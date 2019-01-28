package basics

object CollectionExample extends App {

  val oneTwoThree = List(1, 2, 3)
  val fourFiveSix = List(4, 5, 6)
  println(oneTwoThree ::: fourFiveSix)

  val pair = (99, "Teeest")
  println(pair._1)
  println(s"Hello, ${pair._2}!")


}
