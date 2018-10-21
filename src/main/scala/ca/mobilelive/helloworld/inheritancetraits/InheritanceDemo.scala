package ca.mobilelive.helloworld.inheritancetraits

object InheritanceDemo {
  new Dog().makeNoise() //Woof Woof
  val quad = new GenericAnimal() with Quadriped
  quad.makeNoise() //gulp

  val biped = new GenericAnimal() with Biped {
    override val noise: String = "Hello"
  }

  biped.makeNoise() //Hello
}
