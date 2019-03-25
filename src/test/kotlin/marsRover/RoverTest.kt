package marsRover

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class RoverTest : ShouldSpec({
    "Rover.move" {
        should("increment y position when facing N") {
            val rover = Rover(Position(0,0), Direction.NORTH)
            rover.move()

            rover.position shouldBe Position(0, 1)
        }

        should("increment y position 2 times when moving 2 times") {
            val rover = Rover(Position(0,0), Direction.NORTH)
            rover.move()
            rover.move()

            rover.position shouldBe Position(0, 2)
        }
    }
})