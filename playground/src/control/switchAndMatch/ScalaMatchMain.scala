package control.switchAndMatch

import scala.util.Random

object ScalaMatchMain {

  def main(args: Array[String]): Unit = {

    val weekday = Random.nextInt(3)

    val weekDayAsString = weekday match {
      case 1 => "월요일"
      case 2 => "화요일"
      case _ => "기타"
    }

    println(weekDayAsString)


    // match(2)
    val i = Random.nextInt(10)

    val numAsString = i match {
      case 1 | 3| 5| 7| 9 => "홀수"
      case 2 | 4| 6| 8 | 10 => "짝수"
      case _ =>"범위 초과"
    }

    println(numAsString)


  }


}
