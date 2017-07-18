package lesson.two.java

/**
  * Created by danielkocsis on 2017. 07. 17..
  */
class CompanionFactory private(val firstName:String, val lastName:String) {

	override def toString = s"CompanionFactory($firstName, $lastName)"

}

object CompanionFactory {
	def build(fistName: String, lastName :String) =
		new CompanionFactory(fistName, lastName)

	def main(args: Array[String]): Unit = {
		val companionFactory = build("Daniel", "Kocsis")

		println(s"Instance $companionFactory")
	}
}
