import scala.util.Random

object MatchExpressions {
  def main(args: Array[String]): Unit = {
    val age = "100";
    age match {
      case "19" => println(age)
      case "20" => println(age)
      case "21" => println(age)
      case "22" => println(age) // int
      case "23" => println(age) // int
      case "24" => println(age)
      case "0" => println("case 18 prints: " + age)
      case _ => println("no case matches: default case")
    }
    val result = age match {
      case "19" => age
      case "20" => age
      case "21" => age
      case "22" => age
      case "23" => age
      case "24" => age
      case "0" => age
      case _ => println("no case matches: default case")
    }
    val i = Random.between(0, 9)
    i match {
      case 1 | 3 | 5 | 7 => println("odd numbers: " + i)
      case 2 | 4 | 6 | 8 => println("even numbers: " + i)
    }
  }

}
