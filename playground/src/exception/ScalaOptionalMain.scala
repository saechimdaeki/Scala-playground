package exception

object ScalaOptionalMain {

  def main(args: Array[String]): Unit = {
    makeInt("123") match {
      case Some(i) => println(s"정수 i = $i")
      case None => println("정수로 변환할 수 없어용.")
    }
  }

  def makeInt(s: String) : Option[Int] =
    try {
      Some(s.toInt)
    } catch {
      case e: NumberFormatException => None
    }

}
