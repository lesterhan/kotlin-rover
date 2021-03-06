package marsRover

import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import marsRover.entities.Direction.*
import marsRover.entities.Rover
import marsRover.entities.Vector

class RoverTest : StringSpec({
    "move" should {
        "increment y once when facing N" {
            val rover = Rover(Vector(0, 0), N)
            rover.move()
            rover.vector shouldBe Vector(0, 0 + 1)
        }

        "increment two times when moving twice" {
            val rover = Rover(Vector(0, 0), N)
            rover.move()
            rover.move()
            rover.vector shouldBe Vector(0, 0 + 2)
        }

        "decrement y once when facing S" {
            val rover = Rover(Vector(0, 1), S)
            rover.move()
            rover.vector shouldBe Vector(0, 1 - 1)
        }

        "increment x once when facing E" {
            val rover = Rover(Vector(0, 0), E)
            rover.move()
            rover.vector shouldBe Vector(0 + 1, 0)
        }

        "decrement x once when facing S" {
            val rover = Rover(Vector(1, 0), W)
            rover.move()
            rover.vector shouldBe Vector(1 - 1, 0)
        }

    }
    "turnLeft" should {
        "Turn to W when facing N" {
            val rover = Rover(Vector(0, 0), N)
            rover.turnLeft()
            rover.direction shouldBe W
        }

        "Turn to S when facing W" {
            val rover = Rover(Vector(0, 0), W)
            rover.turnLeft()
            rover.direction shouldBe S
        }

        "Turn to E when facing S" {
            val rover = Rover(Vector(0, 0), S)
            rover.turnLeft()
            rover.direction shouldBe E
        }

        "Turn to N when facing E" {
            val rover = Rover(Vector(0, 0), E)
            rover.turnLeft()
            rover.direction shouldBe N
        }
    }
    "turnRight" should {
        "Turn to E when facing N" {
            val rover = Rover(Vector(0, 0), N)
            rover.turnRight()
            rover.direction shouldBe E
        }

        "Turn to S when facing E" {
            val rover = Rover(Vector(0, 0), E)
            rover.turnRight()
            rover.direction shouldBe S
        }

        "Turn to W when facing S" {
            val rover = Rover(Vector(0, 0), S)
            rover.turnRight()
            rover.direction shouldBe W
        }

        "Turn to N when facing W" {
            val rover = Rover(Vector(0, 0), W)
            rover.turnRight()
            rover.direction shouldBe N
        }
    }
    "Rover.fromString" should {
        "create a correct rover with given parameter" {
            val rover = Rover.fromString("1 2 N")
            rover.vector shouldBe Vector(1, 2)
            rover.direction shouldBe N
        }
    }
})
