package exception

import java.io.IOException

object ScalaExceptionMain {

  def main(args: Array[String]): Unit = {
    try{
//      writeTesxtToFile("test")
    }catch {
      case ioe: IOException =>
        println(ioe.getMessage)
      case nfe: NullPointerException =>
        println(nfe.getMessage)
    } finally {
      println("여기서 리소스 정리")
    }


    
  }
}
