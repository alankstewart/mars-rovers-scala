package alankstewart.marsrovers

case class RoverCommandParser(commandString: Option[String]) {

  def commands: Seq[RoverCommand] =
    commandString.getOrElse("").map {
      case 'M' | 'm' => Move
      case 'L' | 'l' => TurnLeft
      case 'R' | 'r' => TurnRight
    }
}
