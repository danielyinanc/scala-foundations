package ca.mobilelive.helloworld.forloops

object ForLoops extends App {
  def withRanges() = {
    for( a <- 1 to 10)
    {
      println( "Value of a: " + a );
    }
  }

  def withCollections() = {
    val numList = List(1,2,3,4,5,6);

    // for loop execution with a collection
    for( a <- numList ){
      println( "Value of a: " + a );
    }
  }

  def withFilters() = {
    val numList = List(1,2,3,4,5,6,7,8,9,10)
    for( a <- numList if a != 3; if a < 8 ){
      println( "Value of a: " + a )
    }
  }

  def withYield() = {
    val numList = List(1,2,3,4,5,6,7,8,9,10);

    // for loop execution with a yield
    var retVal = for{ a <- numList if a != 3; if a < 8 }yield a

    // Now print returned values using another loop.
    for( a <- retVal){
      println( "Value of a: " + a );
    }
  }



  //withFilters()
  //withCollections()
  withRanges()
  //withYield()
}
