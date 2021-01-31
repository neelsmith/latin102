import edu.holycross.shot.coursecal._
import java.io.PrintWriter

val courseHeaderMd = "# Latin 102-04 S21: daily schedule"

def header : String = {
  s"---\nlayout: page\ntitle: Daily schedule\nnav_order: 2\nhas_children:  true\n---\n\n" + courseHeaderMd + "\n\n"
}


def schedule: Unit = {
  val pg = s"ghpages/schedule/index.md"

  val sched = Schedule("topics.txt", "calendar.yaml")
  val lines = sched.markdownCalendar.split("\n").toVector
  val md = header + lines.slice(4, lines.size).mkString("\n") + "\n\n"
  new PrintWriter(pg) { write(md); close }
  println("Schedule written to " + pg)
}

println("\nWrite course schedule")
println("\n\tschedule")
