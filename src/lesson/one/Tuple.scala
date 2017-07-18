package lesson.one

/**
  * @author Daniel Kocsis
  */
object Tuple {

	def getUserInfo = ("Daniel Kocsis", "Kawasaki ER-6N (2009)")

	def main(args: Array[String]): Unit = {
		println(s"Person: $getUserInfo")

		println(s"Name: ${getUserInfo._1}" )
		println(s"Bike: ${getUserInfo._2}" )

		getUserInfo.swap.productIterator.foreach(i => println(s"value $i"))
	}

}
