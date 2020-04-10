import java.util.Date

object FunctionsPartiallyApplied {

  // Take functions as arguments, and return functions as a result
  def math(x: Double, y: Double, z: Double, f: (Double, Double)=>Double): Double = f(f(x, y), z);
  def intDecorator(x: Int, f: (Int) => String) = f(x);
  def cubeSum(a: Int, b: Int, f: (Int, Int) => Double): Double = f(a, b);
  def log(date: Date, message: String) = {
    println(date + "  " + message);
  }
  // def intDecorator(x: Int, input type => output type)
  def main(args: Array[String]): Unit = {

    // Fully applied function
    val sum = (a: Int, b: Int, c: Int) => a + b + c;
    println("Fully applied function sum(10, 20, 30): " + sum(10, 20, 30));

    // Partially applied function
    val f = sum(10, 20, _:Int);
    println("Partially applied function sum(10, 20, _:Int): " + f(30));
    println("Partially applied function sum(10, 20, _:Int): " + f(200));

    val date = new Date;
    val newLog = log(date, _:String);
    newLog("Hello, this is your partially applied log function.");
    newLog("Second call");
    newLog("Third call");
    newLog("Fourth call");

  }

}