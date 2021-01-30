

# Scala calendar building system


## Contents

- `topics.txt` is sequential list of class entries
- `calendar.yaml` configures properties usd by build script in mapping class entries onto dates and composing markdown pages with your semester schedule



## Building a calendar


Prerequisite: `sbt`


1. Start an `sbt console` in this directory
2. `:load calendar.sc`
3. `schedule`

The calendar page is written to `ghpages/schedule/index.md`.