import scala.collection.mutable

object _20_Sets {

  // Sets can be mutable or immutable type
  // By default all sets are immutable
  val mySet: Set[Int] = Set(1,2,5,8,9,6,4,4);

  // Remember, sets are not ordered.
  // To make a set mutable you need to use:
  var myMuteSet: mutable.Set[Int] = mutable.Set(1,2,5,8,9,6,4,4);

  // Now try to concatenate sets:
  val mySet2: Set[Int] = Set(4,18,19,2,5,8,9,6,4,4,35);

  val myList: List[Int] = List(1,2,5,8,9,6,4,4);
  val myNames: Set[String] = Set("Max", "Tom", "John");

  def main(args: Array[String]): Unit = {

    println("mySet: " + mySet);
    println("mySet: " + myMuteSet);
    println(mySet + 10); // Notice this adds a 10 to the set in random spot
    println(myMuteSet + 10);
    println(mySet(8)); // Check if (8) is in the set, it is not an index
    println(myNames("Max")); // Check if ("Max") is in the set
    println(mySet.head);
    println(mySet.tail);
    println(mySet.isEmpty);

    // Below is concatenation
    // Notice here how concatenating two sets retains the properties of a set
    // E.g. no duplicate values are stored.
    println(s"mySet ++ mySet2: ${mySet++mySet2}");
    println(s"mySet.++(mySet2): ${mySet.++(mySet2)}");

    // Below is the intersection of two sets; e.g. which values overlap
    println("mySet.&(mySet2): " + mySet.&(mySet2));
    println("mySet.intersect(mySet2): " + mySet.intersect(mySet2));

    // A few more functions
    println("mySet.max: " + mySet.max);
    println("mySet.min: " + mySet.min);

    // Use a set with For loop
    mySet.foreach(println);
    for (name <- myNames) {
      println(name);
    }
  }

}
