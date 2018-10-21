package ca.mobilelive.helloworld.collections

import java.awt.Color

import scala.collection.{LinearSeq, SortedSet, mutable}
import scala.collection.immutable.HashMap

object CollectionsExplained extends App {
  Traversable(1, 2, 3)
  Iterable("x", "y", "z")
  Map("x" -> 24, "y" -> 25, "z" -> 26)
  Set(Color.red, Color.green, Color.blue)
  SortedSet("hello", "world")
  mutable.Buffer("x", "y", "z")
  IndexedSeq(1.0, 2.0)
  List(1, 2, 3)
  HashMap("x" -> 24, "y" -> 25, "z" -> 26)
  LinearSeq("a", "b", "c")

  val numbers = Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5) //numbers: Array[Int]
  numbers(3) = 10 // Array index 3 which was 4 becomes 10

  def lists() = {
    val numbers = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5) //numbers: List[Int]
    //numbers(3) = 10 // will result in error as lists are immutable
    numbers(3) // 4
  }

  def sets() = {
     Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
  }

  def tuple() = {
    ("localhost", 80)
  }

  def tupleSyntactic() = {
    1 -> 2
  }

  def maps() = {
    Map(1 -> 2)
  }
  lists()
}
