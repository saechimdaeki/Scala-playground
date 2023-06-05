package exception

object ScalaEitherMain {

  def main(args: Array[String]): Unit = {
    makeInt("123") match {
      case Left(e) => println("에러 : " + e)
      case Right(i) => println(s"정수 i = $i")
    }

    makeInt("1.2.3.") match {
      case Left(e) => println("에러 : " + e)
      case Right(i) => println(s"정수 i = $i")
    }
  }

  def makeInt(s: String): Either[String, Int] =
    try{
      Right(s.toInt)
    } catch {
      case e: NumberFormatException => Left("정수로 변환할 수 없어용.")
    }

}
