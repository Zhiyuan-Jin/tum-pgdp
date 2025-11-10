param(
  [string]$Root = "E:\IDEA\project\tum pgdp"
)

$ErrorActionPreference = "Stop"

# 0) 基础路径
$BackupRoot = Join-Path $Root "backup"

# 1) 检查这是 Git 仓库且指向 GitHub
Set-Location $Root
$origin = git remote get-url origin 2>$null
if (-not $origin -or ($origin -notmatch "github\.com")) {
  Write-Host "❌ 此目录的 origin 未指向 GitHub，请先设置：`n  git remote set-url origin https://github.com/Zhiyuan-Jin/tum-pgdp.git" -ForegroundColor Red
  exit 1
}

# 2) 遍历 week_* 下的每个作业目录，复制到 backup/ 相同结构
$weeks = Get-ChildItem -Path $Root -Directory -Filter "week_*"
if (-not $weeks) {
  Write-Host "ℹ️ 未找到 week_* 目录，无需备份。" -ForegroundColor Yellow
  exit 0
}

foreach ($week in $weeks) {
  # 跳过误放的 backup
  if ($week.Name -ieq "backup") { continue }

  $repos = Get-ChildItem -Directory -Path $week.FullName
  foreach ($repo in $repos) {
    $src = $repo.FullName
    $dst = Join-Path (Join-Path $BackupRoot $week.Name) $repo.Name

    New-Item -ItemType Directory -Force -Path $dst | Out-Null
    Write-Host "📦 备份：$($week.Name)\$($repo.Name)" -ForegroundColor Cyan

    # 复制时排除 Git/IDE/构建产物
    robocopy "$src" "$dst" /E `
      /XD .git .idea .gradle build out target bin .mvn .vscode `
      /XF *.class *.iml *.log *.tmp > $null
  }
}

# 3) 提交并推送到 GitHub（只影响 tum-pgdp 仓库）
Set-Location $Root
git add .
git commit -m "Backup all assignments $(Get-Date -Format 'yyyy-MM-dd HH:mm:ss')" 2>$null
# 你之前的 ziji 已配置推 GitHub，如需更保险也可改为：git push origin main
git ziji

Write-Host "✅ 备份完成，已推送到 GitHub：tum-pgdp/backup/" -ForegroundColor Green
