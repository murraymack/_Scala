package demo

object if_else_stmt {
  def (args: Array[String]): Unit = {

    val x = 20;
    val y = 30;
    var res = "";

    if (x==20 && y==30) {
      //println("x == 20")
      res = "x == 20 && y == 30"
      println(res)
    } else {
      //println("x != 20");
      res = "x != 20";
    }
    //println(res);
    //val res2 = if (x == 20) "x ==20" else "x != 20";
    // This if expression is good because you directly assign result into variable res2 which is constant.
    //println(res2);
    println(if (x == 20) "x == 20" else "x != 20");
  }
}
