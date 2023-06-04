package example.Scala_VS_JAVA.strings


object ScalaStringMain {
  def main(args: Array[String]): Unit = {

    // 문자열 대체
    println("Hello, World!".replace("World", "Korea"))

    // 여러 줄 문자열
    val multiline =
      """안녕하세요,
         여러 줄에 걸친
         문자열입니다.
      """
    println(multiline)

    val jsonString =
      """{
        | "message" : "안녕하세요",
        | "status" : 200
        |}""".stripMargin
    println(jsonString)

    // 치환값 문자열

    val name = "홍길동"
    val str = s"안녕하세요, ${name}님!"
    println(str)

    val sum = s"1 + 2 = ${1 + 2}"
    println(sum)
  }
}
