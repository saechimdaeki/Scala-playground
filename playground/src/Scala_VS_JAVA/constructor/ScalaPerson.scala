package example.Scala_VS_JAVA.constructor

class ScalaPerson(var name: String, var age: Int) {

  // 인수 없는 보조 생성자
  def this() = this("", 0)

  // 인수 하나 받는 보조 생성자
  def this(name : String) = this(name, 0)

  override def toString: String = s"${name}님은 ${age}세입니다."
}
