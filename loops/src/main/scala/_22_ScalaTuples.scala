object _22_ScalaTuples {

  // Class that can contain different kind of elements.
  // Unlike lists or arrays, tuples can contain different data types.
  // Tuples are immutable.
  val myTuple = (55, "David", 100, true); // Int, String, Int, Bool
  val myTuple2 = new Tuple2(1, 2); // Tuple2 for 2 elements
  val myTuple3 = new Tuple3(1, "Bob", (false,true)); // Tuple3 for 3 elements
  // ... new Tuple22 is the max.
  val myTuple22 = new Tuple22(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22);

  def main(args: Array[String]) {
    println(s"myTuple: ${myTuple}");
    println(s"myTuple2: ${myTuple2}");
    println(s"myTuple3: ${myTuple3}");

    // Fetching a specific value from a tuple.
    // Values can be accessed by a few methods:
    println(s"myTuple._1: ${myTuple._1}");
    println(s"myTuple._2: ${myTuple._2}");
    println(s"myTuple._3: ${myTuple._3}");
    println(s"myTuple._4: ${myTuple._4}");

    println(s"myTuple3._3._3: ${myTuple3._3._2}");

    // Iterate over values of a tuple.
    myTuple.productIterator.foreach {
      println
    }

    // Another way to instantiate a tuple:
    println(1 -> "Tom"); // This notation is only valid for two elements.

  }

}
