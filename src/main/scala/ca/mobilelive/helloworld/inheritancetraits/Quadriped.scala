package ca.mobilelive.helloworld.inheritancetraits

trait Quadriped {
  self: Animal => val legs = 4
}
