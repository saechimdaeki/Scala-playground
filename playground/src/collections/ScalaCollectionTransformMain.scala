package collections

object ScalaCollectionTransformMain {

  def main(args: Array[String]): Unit = {
    val squared = List(1, 2, 3).map(x => x * x) // List(1,4,9)

    // 자바처럼 lazy로 하고 싶다면 다음과같이

    LazyList(1,2,3).map(x => x * x)
  }

}
