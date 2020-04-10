object Functions2 {

  object Math {

    def add(a: Int=45, b: Int=45) : Int = {
      return a + b;
    }

    def square(a: Int) : Int = {
      return a * a;
    }

    def printz(x: Int, y: Int): Int = {
      return x + y;
    }

    def +(a: Int, b: Int): Int = {
      return a+b;
    }

  }

  def main(args: Array[String]): Unit = {

    // Anonymous Function:
    var add = (x: Int, y: Int) => x + y
    println(add(300,200))
    //

    println("default parameters of 45, Math.add(): " + Math.add())
    println("pass a single parameter, Math.add(60): " + Math.add(60))
    println("print function x int y in input: " + Math.printz(10, 5))
    println("print + function: " + Math.+(11, 11))
  }

}