import Array._

object Arrays {

  val myArray: Array[Int] = new Array[Int](4);
  // [Int] --> any variable type to store in array
  // (4) --> Size of the array
  val myArray2 = new Array[Int](5); // (5) Size of 5
  val myArray3 = Array(1,2,3,4,5,6,7,8);

  def main(args: Array[String]) {
    myArray(0) = 20;
    myArray(1) = 10;
    myArray(2) = 30;
    myArray(3) = 50;
    println(myArray); // Prints jibberish!

    // So instead we will preint it like this:
    for (x <- myArray) {
      println(x); // This means we are iterating over the array, starting index 0
    }

    // Another way to iterate over array:
    for (i <- 0 to (myArray.length -1)) { // -1 Because array is 0 indexed
      println(myArray(i));
    }
    for (x<-myArray2) {
      println(x);
    }

    // myArray3
    println(myArray3.length + " : length of array");
    val result = concat(myArray, myArray3); // Must import Array._
    for (i <- 0 to (result.length - 1)) {
      println(result(i))
    }
  }
}
