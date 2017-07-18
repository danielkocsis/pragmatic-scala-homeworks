package lesson.one

/**
  * @author Daniel Kocsis
  */
object RawString {

	def main(args: Array[String]): Unit = {
		val pinkfloyd1 = """There's a silence surrounding me /
			I can't seem to think straight / I'll sit in the corner /
			No one can bother me / I think I should speak now /
			Why won't you talk to me / I can't seem to speak now /
			You never talk to me"""

		println(s"Raw\n$pinkfloyd1")

		val pinkfloyd2 = """There's a silence surrounding me /
			|I can't seem to think straight / I'll sit in the corner /
			|No one can bother me / I think I should speak now /
			|Why won't you talk to me / I can't seem to speak now /
			|You never talk to me""".stripMargin

		println
		println(s"Strip margin\n$pinkfloyd2")
	}

}
