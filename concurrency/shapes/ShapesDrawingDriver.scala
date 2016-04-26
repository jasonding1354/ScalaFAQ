package scalafaq.concurrency.shapes
import akka.actor.{Props, ActorRef, ActorSystem, Actor}

private object Start

class ShapesDrawingDriver(drawerActor: ActorRef) extends Actor {
    import Messages._
    
    def receive = {
        case Start =>
            drawerActor ! Circle(Point(0.0, 0.0), 1.0)
            drawerActor ! Rectangle(Point(0.0, 0.0), 2, 5)
            drawerActor ! 3.14159
            drawerActor ! Triangle(Point(0.0, 0.0), Point(2.0, 0.0), Point(1.0, 2.0))
            drawerActor ! Exit
        case Finished =>
            println(s"ShapesDrawingDriver: cleaning up...")
            context.system.shutdown()
        case response: Response =>
            println("ShapesDrawingDriver: Response =" + response)
        case unexpected =>
            println("ShapesDrawingDriver: ERROR: Receive an unexpected message =" + unexpected)
    }
}

object ShapesDrawingDriver {
  def main(args: Array[String]) {
    val system = ActorSystem("DrawinActorSystem")
    val drawer = system.actorOf(Props(new ShapesDrawingActor), "drawingActor")
    val driver = system.actorOf(Props(new ShapesDrawingDriver(drawer)), "drawingDriver")
    driver ! Start
     system.shutdown
  }
}


