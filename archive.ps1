Import-Module "$(Resolve-Path Exercise.psm1)"


$ignored = Get-Content ".gitignore"
    | ForEach-Object { $_.Trim() }
    | Where-Object { $_ -ne "" }                 # Empty lines
    | Where-Object { -not ($_.StartsWith('#')) } # Comments

"exercises/" 
    | Get-Exercise
    | Compress-Exercise -Destination "archives/" -Exclude $ignored
