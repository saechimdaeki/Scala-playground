package method_parameter

object ScalaDefaultParameterMain {

  def main(args: Array[String]): Unit = {
    greeting("김준성")
    greeting("saechimdaeki", "프로그래머")
  }

  def greeting(name: String, role: String= "개발자") =
    println(s"안녕하세요 , ${role} ${name}님.")
}
