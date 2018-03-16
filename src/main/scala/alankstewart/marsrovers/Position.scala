package alankstewart.marsrovers

case class Position(x: Int, y: Int) {

  def from(x: Int, y: Int) = Position(this.x + x, this.y + y)

  override def toString =
    s"$x $y"
}