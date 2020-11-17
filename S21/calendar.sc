import edu.holycross.shot.coursecal._
import java.io.PrintWriter


def header : String = {
  s"---\nlayout: page\ntitle: Daily schedule\nnav_order: 2\n---\n\n"
}

/*
def rewriteHeader(md: String): String = {
  val newHeader = "---\nlayout: page\ntitle: Course schedule\nnhas_children: true\nav_order: 1\n---\n\n# Course schedule\n\n## Unit 1: Latin, an inflected language\n\n"

  val lines = md.split("\n")
  newHeader + lines.slice(4, md.size).mkString("\n")
}*/

def schedule: Unit = {
  val pg = s"ghpages/schedule/index.md"

  val sched = Schedule("topics.txt", "calendar.yaml")
  //val md = sched.markdownCalendar
  //val tweaked = rewriteHeader(md)
  val lines = sched.markdownCalendar.split("\n").toVector
  val md = header + lines.slice(4, lines.size).mkString("\n") + "\n\n"
  new PrintWriter(pg) { write(md); close }
  println("Schedule written to " + pg)
}

println("\nWrite course schedule")
println("\n\tschedule")
