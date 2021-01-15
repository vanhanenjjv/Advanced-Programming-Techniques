Import-Module "$(Resolve-Path Exercise.psm1)"

"exercises/" 
    | Get-Exercise
    | Compress-Exercise -Destination "archives/"
