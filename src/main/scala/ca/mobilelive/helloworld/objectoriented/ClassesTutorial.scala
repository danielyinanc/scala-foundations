package ca.mobilelive.helloworld.objectoriented
/*
  constructor initialization
  base: String
 */
class ClassesTutorial(val base:String) {
  var age = 0
  var firstName = ""
  var lastName = ""
  private var nickName = ""
  var address = None: Option[String]

  // Methods and Operators
  def printHello = println("Hello")
  def getNickName = nickName
  def +(addAge: Int) = age += addAge
  def unary_~ = Math.sqrt(age)
  def defaultValueMethod(a:Int = 13) = println(a)
  def sqrtplus1(x: Int) = {
    import scala.math.sqrt
    sqrt(x) + 1.0
  }

  // Require & ensuring
  def doublePositive(n: Int): Int = {
    require(n > 0)
    n * 2 // logic
  } ensuring(n => n >= 0 && n % 2 == 0)
}
case class Book(isbn: String)

object ClassesTutorial extends App {
  val tutorialObj = new ClassesTutorial("Hello World")
  tutorialObj.base // no compile errors
  tutorialObj.printHello
  //tutorialObj.base = "test"  no compile error because we are trying to modify an immutable value
  tutorialObj.nickName // this call works because it is the companion object calling, outside the class only getNickName works
  tutorialObj + 12 // increases age to 12 using an operator
  println(~tutorialObj) // this is how we use an operator to show us sqrt of age
  println(tutorialObj.defaultValueMethod()) // 13
  println(tutorialObj.defaultValueMethod(25)) //25

  // Assert
  val rnd = Math.random()
  val n = Math.abs(rnd)
  assert(n > 0)

  // Assume
  val speedFromSensor: Double = 1.0
  assume(speedFromSensor >= 0)

  // Case class instatiation and use in comparison
  val frankenstein = Book("978-0486282114")
  val bible = Book("123-2345255")
  println(frankenstein == bible) //false

  // Create a case class from the copy of first
  val frankestein2 = frankenstein.copy()
  println(frankenstein == frankestein2) //true

}
