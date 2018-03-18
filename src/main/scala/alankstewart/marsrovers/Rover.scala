package alankstewart.marsrovers

case class Rover(plateau: Plateau, position: Position, direction: Direction) {

  def run(commandString: String) = {
    val commands = RoverCommandParser(Option(commandString)).commands
    commands.foldLeft(this)((rover, command) => command.execute(rover))
  }

  def move() = {
    val newPosition = direction match {
      case North => position.from(0, 1)
      case South => position.from(0, -1)
      case East => position.from(1, 0)
      case West => position.from(-1, 0)
    }

    if (plateau.contains(newPosition)) Rover(plateau, newPosition, direction) else this
  }

  def turnLeft() = Rover(plateau, position, direction.left)

  def turnRight() = Rover(plateau, position, direction.right)

  def currentPosition: String = toString

  override def toString = s"$position $direction"
}
