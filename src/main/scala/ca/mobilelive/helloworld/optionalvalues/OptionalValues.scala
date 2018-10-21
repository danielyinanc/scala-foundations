package ca.mobilelive.helloworld.optionalvalues

object OptionalValues extends App{
  // How to create an Option
  val greeting: Option[String] = Some("Hello world")

  // A method version returning an Option
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }

  toInt("1") // type Some and value is Some(1)

  // getOrElse
  toInt("1").getOrElse(0) // value is 1 and type is Int

  // forEach
  toInt("1").foreach{ i =>
    println(s"Got an int: $i")
  }

  // pattern matching
  toInt("1") match {
    case Some(i) => println(i)
    case None => println("That didn't work.")
  }


  val bag = List("1", "2", "foo", "3", "bar")
  bag.map(toInt) // List[Option[Int]] = List(Some(1), Some(2), None, Some(3), None)
  bag.flatMap(toInt) //List[Int] = List(1, 2, 3)
  bag.map(toInt).collect{case Some(i) => i} //List[Int] = List(1, 2, 3)
}
