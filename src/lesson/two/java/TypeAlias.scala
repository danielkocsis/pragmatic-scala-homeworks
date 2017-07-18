package lesson.two.java

/**
  * Created by danielkocsis on 2017. 07. 17..
  */
class TypeAlias(val name:String) {
	override def toString = s"TypeAlias($name)"
}

object Main extends App {
	type aliasedType = TypeAlias

	println(new aliasedType("Daniel"))
}
