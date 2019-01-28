package traits

import traits.animals.Frog
import traits.queue.BasicIntQueue

object Launcher extends App{

  val frog = new Frog
  println(frog)
  frog.philosophize()

  val queue = new BasicIntQueue
  queue.put(10)
  println(queue.get(0))
  println(queue)

}
