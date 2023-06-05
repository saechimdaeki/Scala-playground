package method_parameter

object ScalaByNameParameterMain {

  def main(args: Array[String]): Unit = {
    ifByValue(true, echoInt(1), echoInt(2))
    ifByValue(false, echoInt(1), echoInt(2))
  }

  def echoInt(n: Int): Int = {
    println(s"n = $n")
    n
  }

  def ifByValue(cond: Boolean, onTrue: Int, onFalse: Int) : Int =
    if (cond) onTrue else onFalse
}
