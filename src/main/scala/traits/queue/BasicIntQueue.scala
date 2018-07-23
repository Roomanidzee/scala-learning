package traits.queue

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {

  private val buf = new ArrayBuffer[Int]()

  override def get(index: Int): Int = this.buf(index)

  override def put(x: Int): Unit = this.buf += x

  override def toString: String = s"BasicIntQueue : ${this.buf.toString()}"

}
