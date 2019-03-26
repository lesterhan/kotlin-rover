package marsRover

import io.kotlintest.should
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec
import io.mockk.mockk
import io.mockk.verify
import marsRover.Direction.*

class RoverControllerTest : StringSpec({

    "commandRover" should {
        "move rover when given M command" {
            val rover: Rover = mockk<Rover>(relaxed = true)
            val rc = RoverController(Vector(5, 5), rover)

            rc.commandRover("M")

            verify (exactly = 1) { rover.move() }
        }
        "turn left when given L command" {
            val rover: Rover = mockk<Rover>(relaxed = true)
            val rc = RoverController(Vector(5, 5), rover)

            rc.commandRover("L")

            verify (exactly = 1) { rover.turnLeft() }
        }
        "turn right when given R command" {
            val rover: Rover = mockk<Rover>(relaxed = true)
            val rc = RoverController(Vector(5, 5), rover)

            rc.commandRover("R")

            verify (exactly = 1) { rover.turnRight() }
        }
        "respond to multiple commands" {
            val rover: Rover = mockk<Rover>(relaxed = true)
            val rc = RoverController(Vector(5, 5), rover)

            rc.commandRover("MLRMMR")

            verify {
                rover.move()
                rover.turnLeft()
                rover.turnRight()
                rover.move()
                rover.move()
                rover.turnRight()
            }
        }
    }

    "RoverController" should {
        "not move Rover beyond plateau dimension" {
            val rover = Rover(Vector(1,1), N)
            val rc = RoverController(Vector(3,3), rover)

            shouldThrow<IllegalManeuver> {
                rc.commandRover("MMM")
            }
        }
    }

})