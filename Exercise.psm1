class Exercise {
    [ValidateNotNullOrEmpty()] [object]   $Week
                               [object[]] $Parts

    Exercise ([object]$week) {
        $this.Week  = $week                                      
        $this.Parts = Get-ChildItem -Directory -Filter "part_*" $week
    }
}

function Get-Exercise {
    param (
        [Parameter(Mandatory, ValueFromPipeline)] [string] $Path
    )

    process { 
        $Path 
            | Get-ChildItem -Directory -Filter "week_*" 
            | ForEach-Object { [Exercise]::new($_) }
    }
}

function Compress-Exercise {
    param (
        [Parameter(Mandatory, ValueFromPipeline)] [Exercise] $Exercise,
        [Parameter(Mandatory)]                    [object]   $Destination,
        [Parameter()]                             [string[]] $Exclude
    )

    begin {
        if (-not (Test-Path $Destination)) {
            New-Item -ItemType Directory $Destination
        }
    }

    process {
        $week = Join-Path $Destination "$(Split-Path -Leaf $Exercise.Week)"

        if (-not (Test-Path $week)) {
            New-Item -ItemType Directory $week
        }

        $Exercise.Parts 
            | Where-Object { $_ -ne $null }
            | ForEach-Object {
                $part = Join-Path $week "$(Split-Path -Leaf $_)"

                $_  | Get-ChildItem -Exclude $Exclude
                    | Compress-Archive -Update -Destination $part
            }
            | Out-Null
    }
}


Export-ModuleMember -Function * -Alias *
