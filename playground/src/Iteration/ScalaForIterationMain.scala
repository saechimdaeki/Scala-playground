package Iteration

object ScalaForIterationMain {

  def main(args: Array[String]): Unit = {
    val xs = List(1,2,3)
    for(x <- xs) println(x)

    for (n <- 0 to 9) println(n)

    for {
      i <- 2 to 9
      j <- 1 to 9
    } println(s"$i x $j = ${i * j}")
  }
}
