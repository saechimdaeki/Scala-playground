package exception


import scala.util.{Failure, Success, Try}


object ScalaExceptionValueMain {

  def main(args: Array[String]): Unit = {
    makeInt("1024") match {
      case Success(value) => println(s"정수 i = $value")
      case Failure(exception) => println(s"정수로 변환할 수 없어용. $exception")
    }
  }

  def makeInt(s: String) : Try[Int] = Try(s.toInt)

}
