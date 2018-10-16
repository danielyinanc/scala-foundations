package ca.mobilelive.helloworld.firststeps

class Syntax(val x: Double, val y: Double)  {
  // legal identifiers
  var age: String = ""
  var salary: Int = 0
  var _value:Object = null
  var __1_value: List[String] = null

  // illegal identifiers
  //val 123abs = "test"
  //val -salary = 0

  // Operator identifier as +
  def +(that: Syntax) = new Syntax(this.x + that.x, this.y + that.y)

  // Mixed identifier
  def unary_+(that: Syntax) = new Syntax(this.x+that.x, this.y + that.y)

  // Literal identifier
  def `x1`(that: Syntax) = new Syntax(this.x,this.y)
}
