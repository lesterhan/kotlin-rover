package marsRover

import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class RoverTest : StringSpec({
    "Rover.move" should {
        "increment y once when facing N" {
            val rover = Rover(Position(0, 0), Direction.NORTH)
            rover.move()
            rover.position shouldBe Position(0, 0 + 1)
        }

        "increment two times when moving twice" {
            val rover = Rover(Position(0, 0), Direction.NORTH)
            rover.move()
            rover.move()
            rover.position shouldBe Position(0, 0 + 2)
        }

        "decrement y once when facing S" {
            val rover = Rover(Position(0, 1), Direction.SOUTH)
            rover.move()
            rover.position shouldBe Position(0, 1 - 1)
        }

        "increment x once when facing E" {
            val rover = Rover(Position(0, 0), Direction.EAST)
            rover.move()
            rover.position shouldBe Position(0 + 1, 0)
        }

        "decrement x once when facing S" {
            val rover = Rover(Position(1, 0), Direction.WEST)
            rover.move()
            rover.position shouldBe Position(1 - 1, 0)
        }

    }
})
