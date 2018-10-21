package ca.mobilelive.helloworld.inheritancetraits

class Dog extends Animal with Quadriped {
  val noise = "Woof"

  override def makeNoise(): Unit = println(noise+" "+noise)
}
