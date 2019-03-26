package marsRover

import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import marsRover.Direction.*

class RoverTest : StringSpec({
    "Rover.move" should {
        "increment y once when facing N" {
            val rover = Rover(Position(0, 0), NORTH)
            rover.move()
            rover.position shouldBe Position(0, 0 + 1)
        }

        "increment two times when moving twice" {
            val rover = Rover(Position(0, 0), NORTH)
            rover.move()
            rover.move()
            rover.position shouldBe Position(0, 0 + 2)
        }

        "decrement y once when facing S" {
            val rover = Rover(Position(0, 1), SOUTH)
            rover.move()
            rover.position shouldBe Position(0, 1 - 1)
        }

        "increment x once when facing E" {
            val rover = Rover(Position(0, 0), EAST)
            rover.move()
            rover.position shouldBe Position(0 + 1, 0)
        }

        "decrement x once when facing S" {
            val rover = Rover(Position(1, 0), WEST)
            rover.move()
            rover.position shouldBe Position(1 - 1, 0)
        }

    }
    "Rover.turnLeft" should {
        "Turn to W when facing N" {
            val rover = Rover(Position(0, 0), NORTH)
            rover.turnLeft()
            rover.direction shouldBe WEST
        }

        "Turn to S when facing W" {
            val rover = Rover(Position(0, 0), WEST)
            rover.turnLeft()
            rover.direction shouldBe SOUTH
        }

        "Turn to E when facing S" {
            val rover = Rover(Position(0, 0), SOUTH)
            rover.turnLeft()
            rover.direction shouldBe EAST
        }

        "Turn to N when facing E" {
            val rover = Rover(Position(0, 0), EAST)
            rover.turnLeft()
            rover.direction shouldBe NORTH
        }
    }
    "Rover.turnRight" should {
        "Turn to E when facing N" {
            val rover = Rover(Position(0, 0), NORTH)
            rover.turnRight()
            rover.direction shouldBe EAST
        }

        "Turn to S when facing E" {
            val rover = Rover(Position(0, 0), EAST)
            rover.turnRight()
            rover.direction shouldBe SOUTH
        }

        "Turn to W when facing S" {
            val rover = Rover(Position(0, 0), SOUTH)
            rover.turnRight()
            rover.direction shouldBe WEST
        }

        "Turn to N when facing W" {
            val rover = Rover(Position(0, 0), WEST)
            rover.turnRight()
            rover.direction shouldBe NORTH
        }
    }
})
