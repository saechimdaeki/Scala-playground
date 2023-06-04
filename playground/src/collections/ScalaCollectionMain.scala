package collections

import scala.collection.mutable.ListBuffer

object ScalaCollectionMain {

  def main(args: Array[String]): Unit = {

    // scala.collection.immutable.List[T]
    // scala.collection.immutable.Vector[T]
    val stringList = List("a", "b", "c")
    val stringVector = Vector("a", "b", "c")

    // scala.collection.mutable.Set[T]
    val set = Set("a", "b", "c")

    val map = Map(
      "a" -> 1,
      "b" -> 2,
      "c" -> 3
    )

    // 여기서부터 mutable 컬렉션

    val a = Array("a", "b")

    // scala mutable list
    val mutableList = ListBuffer("a", "b", "c")

  }

}
