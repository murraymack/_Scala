object Currying {
  // Process of transforming a function which takes multiple arguments
  // into a function that takes a single argument

  def add(a: Int, b: Int) = a + b;
  def add2(a: Int) = (b: Int) => a + b;
  def add3(a: Int) (b: Int) = a + b; // Scala wants to pass all the args here

  def main(args: Array[String]) {
    println(add(10, 30))
    println(add2(10)(30))

    // Partial application on curried function
    val sum40 = add2(40)
    println(sum40)
    println(sum40(100))
    println(add3(100)(300))
    //println(add3(20)) Throws an error, missing args list for method add 3

    val sum50 = add3(50)_
    println(sum50(20))

  }

}
