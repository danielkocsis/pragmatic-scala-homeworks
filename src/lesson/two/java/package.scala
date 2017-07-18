package lesson.two

/**
  * Created by danielkocsis on 2017. 07. 17..
  */
package object packageObject {

	def log(message:String) = println(s"log: $message")

}

import lesson.two.packageObject._

object Main extends App {
	log("message to log")
}
