import java.util.Date

object Closures {
  // Closures are functions which use variables declared outside the function
  // Impure Closure: Variable when data type can change inside the closure or outside
  // So var makes this impure closure, if it was val it would be pure closure
  // because
  var number = 10;
  val add = (x: Int) => {
    number = x + number;
    number;};

  def main(args: Array[String]): Unit = {
    println("Print add(10): "+add(10))
    println("Print add(number): "+add(number))
    number = 100;
    println("Print add(number): "+add(number))
  }

}
