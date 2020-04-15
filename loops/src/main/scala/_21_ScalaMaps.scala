object _21_ScalaMaps {

  // Map is collection of key value pairs
  // Keys are unique in the map
  // Two kinds of maps: mutable and immutable
  // By default, declaring a map it is
  val myMap : Map[Int, String] =
    Map(801->"Max", 802->"Tom", 803->"Susan",
        804->"Deborah", 805->"Jamie", 806->"Allister");
  val myMap2 : Map[Int, String] =
    Map(807->"Travis", 808->"Elizabeth", 809->"Argo",
        810->"Cezanne", 811->"Sook", 812->"Johnny");

  def main(args: Array[String]): Unit = {
    println(s"myMap: ${myMap}");
    println(s"myMap(802): ${myMap(802)}");
    println(s"myMap.keys: ${myMap.keys}"); // This is a set because unique values
    println(s"myMap.values: ${myMap.values}");
    println(s"myMap.isEmpty: ${myMap.isEmpty}");

    // Below is how to loop through a Scala Map
    myMap.keys.foreach {iKey =>
      println(s"iKey: ${iKey}");
      println(s"value: ${myMap(iKey)}");
    }

    // map.contains is useful for avoiding an exception if a key/value is not present
    println(s"myMap.contains(9999): ${myMap.contains(9999)}");

    // Concatenate two maps:
    println(s"myMap ++ myMap2: ${myMap ++ myMap2}");
    println(s"(myMap ++ myMap2).size: ${(myMap ++ myMap2).size}");
  }

}
