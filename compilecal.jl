using Pkg
Pkg.activate(".")
Pkg.instantiate()
using CourseCalendar

calfile = joinpath(pwd(), "S23", "calendar1.toml")
topics = joinpath(pwd(), "S23", "topics1.txt")
sched = courseSchedule(calfile, topics)

md = mdcalendar(sched)

hdg = """---
title: "Schedule"
layout: page
nav_order: 1
has_children: true
---


Deadlines to note:


- ✏️ Class preparation includes written preparation to be submitted the previous day by 5:00 pm
- 🗣️ Deadline for completing oral assignment in individual meeting outside of class
- 📜  Portfolio assignment due
- ⚠️ Last day to revise submissions for a course module



"""

open(joinpath(pwd(), "docs", "schedule", "index.md"), "w") do io
    write(io, hdg * md)
end