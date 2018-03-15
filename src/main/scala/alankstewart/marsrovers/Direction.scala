package alankstewart.marsrovers

sealed abstract class Direction(x: Int, y: Int) {

  def left: Direction

  def right: Direction
}

case object N extends Direction(0, 1) {

  def left = W

  def right = E
}

case object S extends Direction(0, -1) {

  def left = E

  def right = W
}

case object E extends Direction(1, 0) {

  def left = N

  def right = S
}

case object W extends Direction(-1, 0) {

  def left = S

  def right = N
}
