$exercises = "exercises/"
$archives = "archives/"

if (-not (Test-Path $archives)) {
    New-Item -ItemType Directory $archives
}

$exercises
    | Get-ChildItem -Directory -Filter "week_*"
    | ForEach-Object {
        [PSCustomObject]@{
            Week  = $_                                        
            Parts = Get-ChildItem -Directory -Filter "part_*" $_
        }
    } 
    | ForEach-Object -Parallel {
        $week = Join-Path $using:archives ($_.Week | Split-Path -Leaf)

        if (-not (Test-Path $week)) {
            New-Item -ItemType Directory $week
        }

        $_.Parts 
            | ForEach-Object {
                $part = Split-Path -Leaf $_
                $part_archive = Join-Path $week $part
                Compress-Archive -Update $_ $part_archive
            }
    }
    