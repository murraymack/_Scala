object Functions {
  // def Name( inputs / types) : Return Variable Type = {

  object Math {
    def add(a : Int, b : Int) : Int = {
      a + b
    }
    def square(a: Int) : Int = a * a
  }

  def add(a : Int, b : Int) : Int = {
    a + b
  }

  def subtract(a : Int, b : Int) : Int = {
    return a - b
  }

  def multiply(a : Int, b : Int) : Int = return a * b

  def divide(a : Float, b : Float) = a / b

  def main(args: Array[String]): Unit = {
    println("add: " + add(2,3))
    println("subtract: " + subtract(2,3))
    println("multiply: " + multiply(2,3))
    println("divide: " + divide(2,3))
    println("object Math: Math.add(5,9) = " + Math.add(5,9))
    println("object Math: Math.square(3) = " + Math.square(3))
  }
}