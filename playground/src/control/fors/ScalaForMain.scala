package control.fors

object ScalaForMain {

  def main(args: Array[String]): Unit = {

    val ints = List(1, 2, 3, 4, 5)

    for (i <- ints)
      println(i)

    for (i <- ints) {
      val x = i*2
      println(s"i = $i, x= $x")
    }

    // 다중 for문
    for {
      i <- 1 to 2
      j <- 'a' to 'b'
      k <- 1 to 10 by 5
    } println(s"i = $i, j = $j, k = $k")



    // for 반복 + 선별 조건
    val intList = (1 to 10).toList
    for {
      i <- intList
      if i % 2 == 0
      if i < 5 // and는 생략됨
    } println(i)

  }

}
