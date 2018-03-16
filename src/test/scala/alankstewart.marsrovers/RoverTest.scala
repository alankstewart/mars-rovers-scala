package alankstewart.marsrovers

import org.scalatest.{FlatSpec, Matchers}

class RoverTest extends FlatSpec with Matchers {

  "Rover" should "move and turn left" in {
    val plateau = Plateau(topRight = Position(5, 5))
    val rover = Rover(plateau, Position(1, 2), North)
    rover.run("LMLMLMLMM").toString shouldBe "1 3 N"
  }

  it should "move and turn right" in {
    val plateau = Plateau(topRight = Position(5, 5))
    val rover = Rover(plateau, Position(3, 3), East)
    rover.run("MMRMMRMRRM").toString shouldBe "5 1 E"
  }

  it should "stay within plateau" in {
    val plateau = Plateau(topRight = Position(5, 5))
    val rover = Rover(plateau, Position(2, 3), North)
    rover.run("MMMMMMMMMMMMMRML").toString shouldBe "3 5 N"
  }
}
