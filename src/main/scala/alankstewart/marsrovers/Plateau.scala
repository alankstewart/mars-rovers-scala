package alankstewart.marsrovers

object Plateau {

  private val LowerLeft = Position(0, 0)

}

case class Plateau(upperRightX: Int, upperRightY: Int) {

  private val upperRight = Position(upperRightX, upperRightY)

  import Plateau._

  def contains(position: Position) =
    position.x >= LowerLeft.x && position.x <= upperRight.x &&
      position.y >= LowerLeft.y && position.y <= upperRight.y
}

