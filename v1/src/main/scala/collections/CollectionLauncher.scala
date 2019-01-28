package collections

object CollectionLauncher extends App {

  val fruits : List[String] = List("apples", "oranges", "pears")
  val numbers : List[Int] = List(1, 2, 3, 4)

  val diagonalMatrix : List[List[Int]] = List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )

  val empty: List[Nothing] = List()

  println(s"fruits: ${fruits.toString()}, length: ${fruits.length}")
  println("")
  println(s"numbers: ${numbers.toString()}, length: ${numbers.length}")
  println("")
  println(s"matrix: ${diagonalMatrix.toString()}, length: ${diagonalMatrix.length}")
  println("")
  println(s"empty list: ${empty.toString()}")
  println("")
  println(fruits.take(2))
  println(numbers.drop(2))
  println(diagonalMatrix.flatten)

}
