package collections.mutables

class Queue[T](private val leading: List[T], private val trailing: List[T]) {

  private def mirror: Queue[T] = {

    if(this.leading.isEmpty){
      new Queue(this.trailing.reverse, Nil)
    }else this

  }

  def head: T = this.mirror.leading.head
  def tail: Queue[T] = {
    val q = this.mirror
    new Queue[T](q.leading.tail, q.trailing)
  }

  def enqueue(x: T) = new Queue[T](this.leading, x :: this.trailing)

}
