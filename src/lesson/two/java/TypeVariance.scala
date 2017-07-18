package lesson.two.java

/**
  * Created by danielkocsis on 2017. 07. 17..
  */
object TypeVariance extends App {
	def copyObjects[A, T >: A] (from: Array[A], to: Array[T]) =
		Array.concat(from, to)

}

class A

class B extends A

class C