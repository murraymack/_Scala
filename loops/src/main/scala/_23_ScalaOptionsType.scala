object _23_ScalaOptionsType {

  // Options are containers that can give you two values
  // Instance of some, or instance of none
  val myList = List(1, 2, 3);
  val myMap = Map(1 -> "Tom", 2 -> "Allister", 3 -> "Daisy");

  // Define an option
  val myOpt5 : Option[Int] = Some(5);
  val myOptNone: Option[Int] = None;

  def main(args: Array[String]): Unit = {
    // myList.find(_ > 6) ... So the _ is the option
    println(s"myList.find(_ >6): ${myList.find(_ > 6)}");
    println(s"myList.find(_ >2): ${myList.find(_ > 2)}");

    // myList.find(_ > 6) ... So the _ is the option
    println(s"myMap.get(1): ${myMap.get(1)}");
    println(s"myMap.get(2): ${myMap.get(2)}");

    // But how do we extract the value from the Some result?
    println(s"myList.find(_ >2).get: ${myList.find(_ > 2).get}");
    println(s"myMap.get(1).get: ${myMap.get(1).get}");

    // To avoid the exception:
    println(s"myList.find(_ >99).getOrElse: ${myList.find(_ > 99).getOrElse("Not_found")}");
    println(s"myMap.get(99).getOrElse: ${myMap.get(99).getOrElse("Still_not_found")}");

    // Print testing on myOpt values
    println(s"myOpt5.isEmpty: ${myOpt5.isEmpty}");
    println(s"myOptNone.isEmpty: ${myOptNone.isEmpty}");
  }

}
