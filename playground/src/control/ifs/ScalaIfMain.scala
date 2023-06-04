package control.ifs

import scala.util.Random

object ScalaIfMain {

  def main(args: Array[String]): Unit = {
    var x = Random.nextInt(10)
    var y = 0
    if (x %2 == 0)
      y = x * -1

    if (x < 0) {
      println("음수")
    } else if (x == 0)
      println("0")
    else
      println("양수")


    println(min(3,5))



    // 삼항 연산자가 필요 없음 (if else가 같은 역할) like kotlin

    val minVal = if (x<y) x else y

  }




  def min(a: Int, b: Int): Int =
    if (a< b) a else b

}
