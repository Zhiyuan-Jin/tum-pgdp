param(
  [string]$Root = "E:\IDEA\project\tum pgdp"
)
$ErrorActionPreference = "Stop"
$BackupRoot = Join-Path $Root "backup"
Set-Location $Root

Write-Host "🔁 开始自动备份到 GitHub..." -ForegroundColor Cyan

# 遍历 week_* 文件夹
$weeks = Get-ChildItem -Path $Root -Directory -Filter "week_*"
foreach ($week in $weeks) {
  if ($week.Name -ieq "backup") { continue }
  $repos = Get-ChildItem -Directory -Path $week.FullName
  foreach ($repo in $repos) {
    $src = $repo.FullName
    $dst = Join-Path (Join-Path $BackupRoot $week.Name) $repo.Name
    New-Item -ItemType Directory -Force -Path $dst | Out-Null
    Write-Host "📦 备份：$($week.Name)\$($repo.Name)" -ForegroundColor Cyan
    robocopy "$src" "$dst" /E /XD .git .idea .gradle build out target bin .mvn .vscode /XF *.class *.iml *.log *.tmp > $null
  }
}

# 提交并推送
git add .
git commit -m "Backup + update $(Get-Date -Format 'yyyy-MM-dd HH:mm:ss')" 2>$null
git push origin HEAD:main

Write-Host "✅ 所有作业已自动备份并上传至 GitHub！" -ForegroundColor Green
