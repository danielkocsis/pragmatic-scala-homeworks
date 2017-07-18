package lesson.one

/**
  * @author Daniel Kocsis
  *
  * see: http://www.jesperdj.com/2016/01/08/scala-access-modifiers-and-qualifiers-in-detail/
  */
package outside {

	package inside {

		object Messages {

			// Accessible up to package 'inside'

			private[inside] val Insiders = "Hello Friends"

			// Accessible up to package 'outside'

			private[outside] val Outsiders = "Hello People"

		}

		object InsideGreeter {
			def sayHello(): Unit =

				// Can access both messages

				println(Messages.Insiders + " and " + Messages.Outsiders)
		}
	}

	object OutsideGreeter {

		// Can only access the 'Outsiders' message

		def sayHello(): Unit = {
			println(inside.Messages.Outsiders)

			// println(inside.Messages.Insiders)
		}
	}

}

class Counter {

	// Normal private member variable

	private var total = 0

	// Object-private member variable

	private[this] var lastAdded = 0

	def add(n: Int): Unit = {
		total += n
		lastAdded = n
	}

	def copyFrom(other: Counter): Unit = {

		// OK, private member from other instance is accessible

		total = other.total

		// ERROR, object-private member from other instance is not accessible

		// lastAdded = other.lastAdded
	}

	override def toString = s"Counter($total, $lastAdded)"
}

object AccessQualifiers extends App {

	val counterA = new Counter
	val counterB = new Counter

	counterA.add(10)
	counterB.copyFrom(counterA)

	println(s"counterA $counterA")
	println(s"counterB $counterB")

}