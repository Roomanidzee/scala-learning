package collections.mutables

abstract class Simulation {

  type Action = () => Unit

  case class WorkItem(time: Int, action: Action)

  private var currentTime = 0
  def getCurrentTime: Int = this.currentTime
  def setCurrentTime(newCurrentTime: Int): Unit = {this.currentTime = newCurrentTime}

  private var agenda: List[WorkItem] = List()
  def getAgenda: List[WorkItem] = this.agenda
  def setAgenda(newAgenda: List[WorkItem]): Unit = {this.agenda = agenda}

  private def insert(ag: List[WorkItem], item: WorkItem): List[WorkItem] = {

    if(ag.isEmpty || item.time < ag.head.time){
      item :: ag
    }else{
      ag.head :: insert(ag.tail, item)
    }

  }

  def afterDelay(delay: Int)(block: => Unit): Unit = {

    val item = WorkItem(this.currentTime + delay, () => block)
    this.agenda = this.insert(this.agenda, item)

  }

  private def next(): Unit = {

    (this.agenda: @unchecked) match {

      case item :: rest =>
        this.agenda = rest
        this.currentTime = item.time
        item.action()

    }

  }

  def run(): Unit = {

    afterDelay(0) {
      println(s"*** simulation started, time = ${this.currentTime} ***")
    }

    while(this.agenda.nonEmpty) next()

  }

}
