package demo

object Demo {
  def (args: Array[String] ) {
    val name = "basil"
    val age = 21.5
    println(name + " is " + age + " years old")
    println(s"$name is $age years old.")
    println(f"$name%s is $age%f years old.")
    println(s"Hello \nworld!")
    println(raw"Hello \nworld!")
  }
}