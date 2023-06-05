package method_parameter

object ScalaNamedParameterMain {

  def main(args: Array[String]): Unit = {
    update("x", 3)
    update(key = "x", value = 3)
    update(value = 3, key = "x")
  }

  def update(key: String, value: Int) =
    println(s"$key -> $value")
}
