package Object

class Car(val cc: Int) {
  import Car._
  def taxPerYear : Int = taxPerCc(cc).intValue * cc
}

// 동반 오브젝트 Companion Object
object Car {

  // 배기량에 따른 cc당 자동차세 + 교육세 30%
  private def taxPerCc(cc: Int) =
    (if (cc <= 1000)  80
    else if (cc <= 1600) 140
    else 200) * 1.3
}
