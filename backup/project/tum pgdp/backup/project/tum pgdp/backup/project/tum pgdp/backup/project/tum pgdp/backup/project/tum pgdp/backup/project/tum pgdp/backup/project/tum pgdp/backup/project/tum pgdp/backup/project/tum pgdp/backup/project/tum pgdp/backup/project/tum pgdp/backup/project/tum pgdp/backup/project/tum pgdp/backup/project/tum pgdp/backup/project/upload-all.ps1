# === 自动上传 E:\IDEA\project 下所有子项目到 GitHub ===

# 可选：排除不想上传的文件夹名（按需填写）
$Exclude = @(".venv", ".cache")

# 统一使用当前目录作为根
Set-Location "E:\IDEA\project"

foreach ($dir in Get-ChildItem -Directory) {

    if ($Exclude -contains $dir.Name) { continue }

    Write-Host "📁 处理项目: $($dir.Name)" -ForegroundColor Cyan
    Set-Location $dir.FullName

    # 仓库名：把空格换成 -
    $repoName = ($dir.Name -replace ' ', '-')

    # 1) 初始化 Git
    if (-not (Test-Path ".git")) {
        git init | Out-Null
        Write-Host "✅ 初始化 Git 仓库"
    }

    # 2) 创建 .gitignore（若不存在）
    if (-not (Test-Path ".gitignore")) {
@"
# IntelliJ / IDEA
.idea/
out/
*.iml

# Java / build
*.class
*.jar
*.war
*.log

# OS
.DS_Store
Thumbs.db
"@ | Out-File -Encoding utf8 .gitignore
        Write-Host "🧹 生成 .gitignore"
    }

    # 3) 添加并提交（允许没有变化时静默）
    git add .
    git commit -m "Auto commit from upload-all.ps1" 2>$null

    # 4) 若还没有远程，就创建 GitHub 仓库（public），并首次推送
    $hasGithubRemote = git remote -v | Select-String "github.com"
    if (-not $hasGithubRemote) {
        Write-Host "🌐 创建 GitHub 仓库：$repoName" -ForegroundColor Yellow
        # 想创建私有仓库就把 --public 改成 --private
        gh repo create $repoName --public --source=. --remote=origin --push
    } else {
        Write-Host "🚀 推送更新到远程：$repoName" -ForegroundColor Green
        git push -u origin main
    }

    # 返回根目录，处理下一个
    Set-Location "E:\IDEA\project"
    Write-Host "----------------------------------------------"
}

Write-Host "🎉 所有项目处理完成！" -ForegroundColor Green
