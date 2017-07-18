package lesson.one

/**
  * @author Daniel Kocsis
  */
object StringInterpolation extends App {

	// S interpolator

	println(s"S: 1 + 1 = ${1 + 1}")

	def product = "Ducati  Monster(2017)"

	println(s"S: I would like to buy a(n) $product")

	// F interpolator (formatting)

	def price = 10000
	def discount = 2

	println(f"F: On $product $discount%% saves $$${price * discount / 100.00}%2.2f")

	// raw

	println(raw"Raw: On $product $discount%% saves $$${price * discount / 100.00}%2.2f")
}
