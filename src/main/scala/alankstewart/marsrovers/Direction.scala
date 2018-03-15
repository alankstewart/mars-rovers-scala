package alankstewart.marsrovers

sealed abstract class Direction(val x: Int, val y: Int) {

  def left: Direction

  def right: Direction
}

case object North extends Direction(0, 1) {

  override def left: Direction = West

  override def right: Direction = East
}

case object South extends Direction(0, -1) {

  override def left = East

  override def right = West
}

case object East extends Direction(1, 0) {

  override def left = North

  override def right = South
}

case object West extends Direction(-1, 0) {

  override def left = South

  override def right = North
}
