package Iteration

object ScalaForYieldMain {

  def main(args: Array[String]): Unit = {

    val xs = List(1,2,3)
    val ys = for(x <- xs) yield x*2 // => List (2, 4, 6)

    val xs1 = List(3,4,5)
    val ys1 = List(1,2)

    for {
      x <- xs1
      y <- ys1
    } yield (x * y) // => List(3, 6, 4, 8, 5, 10)
  }

}
