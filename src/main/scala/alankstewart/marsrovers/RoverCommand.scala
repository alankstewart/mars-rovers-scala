package alankstewart.marsrovers

sealed trait RoverCommand {

  def execute(rover: Rover): Rover
}

case object Move extends RoverCommand {

  override def execute(rover: Rover): Rover = rover.move()
}

case object TurnLeft extends RoverCommand {

  override def execute(rover: Rover): Rover = rover.turnLeft()
}

case object TurnRight extends RoverCommand {

  override def execute(rover: Rover): Rover = rover.turnRight()
}
