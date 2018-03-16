package alankstewart.marsrovers

sealed trait Direction {

  def left: Direction

  def right: Direction
}

case object North extends Direction {

  override def left: Direction = West

  override def right: Direction = East

  override def toString = "N"
}

case object South extends Direction {

  override def left = East

  override def right = West

  override def toString = "S"
}

case object East extends Direction {

  override def left = North

  override def right = South

  override def toString = "E"
}

case object West extends Direction {

  override def left = South

  override def right = North

  override def toString = "W"
}
