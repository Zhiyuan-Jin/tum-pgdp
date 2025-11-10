param(
  [string]$Root = "E:\IDEA\project"
)

Write-Host "🔎 开始扫描：$Root" -ForegroundColor Cyan
Set-Location $Root

# 确保 ziji 别名存在（只推 GitHub 的 origin）
$ziji = git config --global --get alias.ziji
if (-not $ziji) {
  git config --global alias.ziji "!git add . && git commit -m 'update' || echo . && git push origin HEAD:main"
  Write-Host "✅ 已设置 alias: git ziji" -ForegroundColor Green
} else {
  Write-Host "ℹ️ 已存在 alias: git ziji" -ForegroundColor DarkGray
}

$dirs = Get-ChildItem -Directory
$report = @()

foreach ($d in $dirs) {
  $path = $d.FullName
  $isRepo = Test-Path (Join-Path $path ".git")

  $item = [ordered]@{
    Project    = $d.Name
    Path       = $path
    IsRepo     = $isRepo
    Branch     = ""
    Origin     = ""
    HasChanges = ""
    Action     = ""
    Result     = ""
  }

  if (-not $isRepo) {
    $item.Action = "非Git仓库（跳过）"
    $report += New-Object psobject -Property $item
    continue
  }

  Set-Location $path

  # 移除 Artemis 远端（如果有）
  $remotes = git remote -v
  if ($remotes -match "artemis\.tum\.de") {
    git remote remove origin 2>$null
  }

  # 如果还有 github 这个名字的远端，把它改名为 origin
  $hasGithubName = git remote | Select-String '^github$'
  if ($hasGithubName) { git remote rename github origin 2>$null }

  # 获取 origin
  $origin = (git remote get-url origin 2>$null)
  if ($origin) { $item.Origin = $origin }

  # 分支 -> main
  git branch -M main 2>$null

  # 当前分支
  $branch = (git rev-parse --abbrev-ref HEAD 2>$null)
  $item.Branch = $branch

  # 是否有改动（兼容5.1：用 if/else 代替 ? :）
  $status = git status --porcelain
  if ([string]::IsNullOrWhiteSpace($status)) {
    $item.HasChanges = "clean"
  } else {
    $item.HasChanges = "dirty"
  }

  # 没有 GitHub 远端时给出提示
  if (-not $origin -or $origin -notmatch "github\.com") {
    $pretty = ($d.Name -replace ' ','-')
    $item.Action = "请在 GitHub 新建仓库并执行：`n  git remote add origin https://github.com/<你>/$pretty.git"
    $item.Result = "等待添加后再 push"
    $report += New-Object psobject -Property $item
    Set-Location $Root
    continue
  }

  # 有改动就提交
  if ($item.HasChanges -eq "dirty") {
    git add .
    git commit -m "update" 2>$null
  }

  # 推送
  try {
    git push -u origin main
    $item.Action = "push origin main"
    $item.Result = "OK"
  } catch {
    $item.Action = "push origin main"
    $item.Result = "失败（检查凭据/权限/仓库是否存在）"
  }

  $report += New-Object psobject -Property $item
  Set-Location $Root
}

Write-Host ""
Write-Host "📋 扫描结果：" -ForegroundColor Cyan
$report | Format-Table -AutoSize

Write-Host "`n✅ 完成。对于提示“请在 GitHub 新建仓库并执行 …”的项目："
Write-Host "   1) 先去 GitHub 新建空仓库（不要初始化 README）"
Write-Host "   2) 进入该项目目录执行："
Write-Host "      git remote add origin https://github.com/<你>/<仓库名>.git"
Write-Host "      git branch -M main"
Write-Host "      git ziji"
