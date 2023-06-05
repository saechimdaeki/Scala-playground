package caseclass

case class Point(x: Double, y: Double)

case class Circle(point: Point, radius: Double)

object Main {
  def main(args: Array[String]): Unit = {
    val center = Point(0.0, 0.0)
    val smallCircle = Circle(center, 2.0)
    println(smallCircle.radius)



    // 케이스 클래스는 equals를 재정의해줌

    println(Circle(center, 1.0) == Circle(center, 1.0)) // => true
    println(Circle(center, 1.0) == Circle(center, 2.0)) // => false


    // .copy 또한 만들어줌

    val aCircle = Circle(Point(0.0, 0.0), 1.0)
    val biggerCircle = aCircle.copy(radius = 2.0)
    val movedCircle = biggerCircle.copy(point = Point(2.0, 2.0))

    println(aCircle)
    println(biggerCircle)
    println(movedCircle)
  }
}
