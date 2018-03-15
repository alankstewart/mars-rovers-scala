package alankstewart.marsrovers

case class Position(x: Int, y: Int) {

  override def toString =
    s"$x $y"
}