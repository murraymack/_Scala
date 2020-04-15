object _24_Mapping {

  // Map method use to iterate over a collection (e.g. list, array, set)
  // and then apply a function each element of that collection

  val myList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13);
  val myMap = Map(1 -> "Tom", 2 -> "Dave", 3 -> "Susan", 4 -> "Sally", 5 -> "Dudley");

  def main(args: Array[String]) {

    // Multiply each element in myList by 2, out of place operation
    println(s"myList.map(_ * 2): ${myList.map(_ * 2)}");
    println(s"myList.map(x => x * 2): ${myList.map(x => x * 2)}");

    // String mapping examples
    println(s"myList.map(x => Hi + 2): ${myList.map(x => "Hi" + x)}");
    println(s"myList.map(x => Hi * 2): ${myList.map(x => "Hi" * x)}");
    println(s"myMap.map(x => Hi + x): ${myMap.map(x => "Hi" + x)}");
    println(s"myMap.mapValues(x => Hi + x): ${myMap.mapValues(x => "Hi" + x)}");
    println(s"'hello'.map(_.toUpper): ${"hello".map(_.toUpper)}");

    // Flattening a list
    println(List(List(1,2,3),List(3,4,5)));
    println(List(List(1,2,3),List(3,4,5)).flatten);
    println(s"myList.flatMap(x => List(x, x+23)): \n${myList.flatMap(x => List(x, x+23))}");

    // Filter Method
    println(s"myList.filter(x => x > 10): ${myList.filter(x => x > 10)}")
  }
}
