package example.Scala_VS_JAVA.interfaceAndTrate

class ScalaMath extends ScalaAdder with ScalaMultiplier

object ScalaMathMain {
  def main(args: Array[String]): Unit = {
    val sm = new ScalaMath
    println(sm.add(1, 2))
    println(sm.multiply(1, 2))
  }
}
