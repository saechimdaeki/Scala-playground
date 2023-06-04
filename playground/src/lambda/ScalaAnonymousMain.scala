package lambda

object ScalaAnonymousMain {

  def main(args: Array[String]): Unit = {

    // java Stream.of(1,2,3).map(x -> x+1).forEach(System.out::println); => 2, 3, 4,
    List(1,2,3).map(x => x+1).foreach(println) // => 2, 3, 4,


    // 스칼라에서는 익명함수 축약이 있다 아래 두 코드는 같다.

    List(1,2,3).map(x => x+1).foreach(print)
    List(1,2,3).map(_+1).foreach(print)


  }
}
