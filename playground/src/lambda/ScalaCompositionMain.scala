package lambda

object ScalaCompositionMain {
  def main(args: Array[String]): Unit = {

    // 자바 코드 예시
    // Function<Integer, Integer> add1 = x -> x + 1;
    // Function<Integer, Integer> square = x -> x * x;
    // Function<Integer, Integer> add1Square = square.compose(add1);

    // Stream.of(1,2,3).map(add1).map(square).forEach(System.out::println);
    // Stream.of(1,2,3).map(add1Square).forEach(System.out::println);
    // => 4, 9, 16

    val add = (x: Int) => x + 1
    val sqaure = (x: Int) => x * x
    val addSquare = sqaure.compose(add)

    List(1,2,3).map(add).map(sqaure) // => List(4,9,16)_
    List(1,2,3).map(addSquare) // => List(4,9,16)_
  }
}
