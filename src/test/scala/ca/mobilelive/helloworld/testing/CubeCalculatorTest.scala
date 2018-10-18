package ca.mobilelive.helloworld.testing

import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("Zero in zero out") {
    assert(CubeCalculator.cube(0) === 0)
  }
}
