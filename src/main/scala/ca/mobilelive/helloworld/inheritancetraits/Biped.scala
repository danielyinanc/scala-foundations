package ca.mobilelive.helloworld.inheritancetraits

trait Biped {
  self: Animal => val legs = 2
}
