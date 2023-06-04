package lambda

object ScalaFunctionValueMain {

  def main(args: Array[String]): Unit = {
    // 자바 코드 예시
    // Fuction<Integer, Integer> add = x -> x +1
    // Stream.of(1,2,3.map(add).forEach(System.out::println); => 2, 3, 4,

    val add = (x: Int) => x + 1
    List(1,2,3).map(add)

  }

}
