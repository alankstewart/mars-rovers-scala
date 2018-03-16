package alankstewart.marsrovers

case class Plateau(bottomLeft: Position = Position(0, 0), topRight: Position) {

  def contains(position: Position): Boolean =
    position.x >= bottomLeft.x &&
      position.x <= topRight.x &&
      position.y >= bottomLeft.y &&
      position.y <= topRight.y
}
