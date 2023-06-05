package pattern

object ScalaPatternMain {

  def main(args: Array[String]): Unit = {
    println(show(Dog("꽃님",3)))
    println(show(Person("김준성", true)))
  }

  def show(animal: Animal) : String =
    animal match {
      case Cat(name, kind) => s"고양이 ${name}은 ${kind}종입니다."
      case Dog(name, age) => s"강아지 ${name}은 ${age}살입니다."
      case Person(name, true) => s"사람 ${name}은 성인입니다."
      case Person(name, false) => s"사람 ${name}은 미성년자입니다."
    }
}
