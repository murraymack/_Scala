object Functions3HigherOrder {

  // Take functions as arguments, and return functions as a result
  def math(x: Double, y: Double, z: Double, f: (Double, Double)=>Double): Double = f(f(x, y), z);
  def intDecorator(x: Int, f: (Int) => String) = f(x);
  def cubeSum(a: Int, b: Int, f: (Int, Int) => Double): Double = f(a, b);
  // def intDecorator(x: Int, input type => output type)
    def main(args: Array[String]): Unit = {
      val result = math(50, 20, 1, (x,y)=>x min y)
      val result2 = math(50, 20, 1, (x,y)=>x max y)
      val result3 = math(70, 30, 10, _ * _)
      println(result)
      println(result2)
      println(result3)
      println(intDecorator(15, (y: Int) => "[[yoo " + y + " yoo]]"))
      println(cubeSum(3, 5, (a: Int, b: Int) => a*a*a + b*b*b))
    }

  }
