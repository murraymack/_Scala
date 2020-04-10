object ForLoops {
  def main(args: Array[String]): Unit = {
    for (i <- 1.to(5)) {
      println("value of i: " + i)
    }
    for (a <- 1 until 6) {
      println("value a until: " + a)
    }
    for (a <- 1 until 9; j <- 1 to 3) {
      println("value a until: " + a + "; value j to: " + j)
      // counter for j will continue to reset until a loop is complete
    }
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    for (q <- lst) {
      println("q from list: " + q)
    }
    for (p <- lst; if p < 7) {
      println("p from list with if conditional: " + p)
    }
    val result = for (m <- lst; if m < 6) yield {
      m * m
    }
    println("value of result: " + result)
  }

}
