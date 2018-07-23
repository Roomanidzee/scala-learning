package basics

object FirstClass extends App {

  val greetStrings = new Array[String](3)

  greetStrings(0) = "Test "
  greetStrings(1) = " test "
  greetStrings(2) = "TEST"

  greetStrings.foreach(str => println(str))

  /*for(i <- 0 to 2){
    println(greetStrings(i))
  }*/

}
