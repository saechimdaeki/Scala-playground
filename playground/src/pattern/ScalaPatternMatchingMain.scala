package pattern

object ScalaPatternMatchingMain {

  def main(args: Array[String]): Unit = {
    println(daysToString(2))
    println(daysToString(5))
  }

  def daysToString(day:Int) : String = day match {
    case 1 => "하루"
    case 2 => "이틀"
    case 3 => "사흘"
    case 4 => "나흘"
    case _ => day + "일"
  }
}
