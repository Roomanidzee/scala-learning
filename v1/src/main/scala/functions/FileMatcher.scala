package functions

import java.io.File

object FileMatcher {

  private def filesHere = new File(".").listFiles

  private def filesMatching(matcher: String => Boolean) = {
    for (file <- filesHere; if matcher(file.getName)) yield file
  }

  def filesEnding(query: String): Array[File] = filesMatching(_.endsWith(query))

  def containsNeg(nums: List[Int]): Boolean = nums.exists(_ < 0)

}
