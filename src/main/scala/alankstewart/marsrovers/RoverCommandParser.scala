package alankstewart.marsrovers

case class RoverCommandParser(commandString: Option[String]) {

  def commands: Seq[RoverCommand] =
    commandString.getOrElse("").map(_.toUpper) map {
      case 'M' => Move
      case 'L' => TurnLeft
      case 'R' => TurnRight
    }
}
