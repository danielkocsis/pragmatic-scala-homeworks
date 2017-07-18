package lesson.one

/**
  * @author Daniel Kocsis
  */
object Loops extends App {

	println("1 to 2")
	for (i <- 1 to 2) {
		println(s"i: $i")
	}

	println("1 until 2")
	for (i <- 1 until 2) {
		println(s"i: $i")
	}

	println("1.to(2)")
	for (i <- 1.to(2)) {
		println(s"i: $i")
	}

	(1 to 4).foreach(println _)

}
