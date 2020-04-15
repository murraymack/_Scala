object _19_Lists {

  // Two fundamental differences between lists and arrays
  // Arrays: MUTABLE, and do not represent linked lists.
  // Lists: IMMUTABLE, and represent linked lists.

  val myList: List[Int] = List(1,2,3,4,5,6);
  val myNamesList: List[String] = List("Bob","Jack","Jill");

  // But how are lists useful if they cannot be changed?
  // Let's see how to update a list.



  def main(args: Array[String]) {
    println(0 :: myList); // :: is called a const
    println(myList);
    println(myNamesList);
    println(Nil); // Empty List! You can create a new list
    println(1::5::9::10::Nil);
    println(myNamesList.head); // Just the first value
    println(myNamesList.tail); // Everything except first value
    println(myNamesList.isEmpty);
    println(myList.tail);
    println(myList.reverse);
    println(List.fill(5)("Bob")); // Fills array of length (5) with ("Bob")

    myList.foreach(println)
    var sum: Int = 0;
    myList.foreach(sum += _)
    println(sum);

    for (name <- myNamesList) {
      println(name);}

    println(myNamesList(1)); // Prints the (1) element in the list.

  }
}
