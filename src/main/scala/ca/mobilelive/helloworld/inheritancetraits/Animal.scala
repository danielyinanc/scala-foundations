package ca.mobilelive.helloworld.inheritancetraits

abstract class Animal {
  val legs: Int
  val noise: String
  def makeNoise() = {
    println(noise)
  }
}
