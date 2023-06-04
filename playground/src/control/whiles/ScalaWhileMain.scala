package control.whiles

object ScalaWhileMain {

  def main(args: Array[String]): Unit = {
    var i = 0
    while (i < 3) {
      println(i)
      i += 1 // scala는  ++ 연산이 없음.
    }
  }

}
