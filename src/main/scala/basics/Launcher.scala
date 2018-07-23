package basics

import java.io.File

object Launcher{

  def main(args: Array[String]) : Unit = {

    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    println(oneHalf + twoThirds)
    println(oneHalf * twoThirds)

    println(" ")

    var filesHere = new File(".").listFiles()
    filesHere.foreach(println)

  }

}
