object Strings17 {
  val num1 = 75: Int
  val num2 = 100.25: Double
  val str1: String = "Hello cats and dogs."
  val str2: String = "Would you like to go for a walk?"
  // type java.lang.string; they are immutable in Scala

  def main(args: Array[String]): Unit = {
    println("Length of str1: "+str1.length)
    println(str1 + " " + str2)
    println(str1.concat(str2))

    // Formatting
    val result = printf("%d -- %f -- %s", num1, num2, str1)
    println(result)
    println("(%d -- %f -- %s)".format(num1, num2, str1))
  }

}
