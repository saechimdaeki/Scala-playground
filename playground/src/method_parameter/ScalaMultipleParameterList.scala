package method_parameter

object ScalaMultipleParameterList {


  def main(args: Array[String]): Unit = {
    println(normalAdder(2,3))
    println(multiAdder(2)(3))

    val xs = List(1,2,3)
    println(xs.map(x => normalAdder(2,x))) //  => List(3,4,5)
    println(xs.map(normalAdder(2,_))) // => List(3,4,5)
    println(xs.map(multiAdder(2))) // => List(3,4,5)
  }

  def normalAdder(x: Int, y:Int) = x+ y
  def multiAdder(x: Int)(y:Int) : Int = x + y
}


