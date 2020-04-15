object _25_ReduceFoldScan {

  // reduceLeft, reduceRight, foldLeft, foldRight, scanLeft, scanRight
  val myList = List(1,2,3,4,5,6,7,10,13);
  val myList2 = List("A","B","C");

  def main(args: Array[String]) {

    // Comment
    println(s"myList.reduceLeft(_+_): ${myList.reduceLeft(_+_)}");
    println(s"myList2.reduceLeft(_+_): ${myList2.reduceLeft(_+_)}");
    println(myList.reduceLeft((x,y) => {println(x + " , " + y); x+y;}));
    println(myList.reduceRight((x,y) => {println(x + " , " + y); x-y;}));

    println(s"myList.reduceRight(_+_): ${myList.reduceRight(_-_)}");
    println(s"myList.reduceRight(_*_): ${myList.reduceRight(_*_)}");

    // reduce vs fold: in fold you pass the extra element as the start value
    // https://stackoverflow.com/questions/7764197/difference-between-foldleft-and-reduceleft-in-scala
    println(s"myList.foldLeft(0)(_ + _): ${myList.foldLeft(0)(_ + _)}")
    println(s"myList.foldLeft(1)(_ + _): ${myList.foldLeft(1)(_ + _)}")
    println(s"myList.foldLeft(100)(_ + _): ${myList.foldLeft(100)(_ + _)}")

    // scan returns the map of intermediate results
    println(s"myList.scanLeft(0)(_ + _): ${myList.scanLeft(0)(_ + _)}")
    println(s"myList.scanLeft(1)(_ + _): ${myList.scanLeft(1)(_ + _)}")
    println(s"myList.scanLeft(100)(_ + _): ${myList.scanLeft(100)(_ + _)}")

  }
}
