package example.Scala_VS_JAVA.method

class ScalaMethodMain {
  def add(a: Int, b: Int): Int = a + b

  def triangle(a: Double, b: Double): Double = {
    val a2 = a * a
    val b2 = b * b
    Math.sqrt(a2 + b2)
  }

}
