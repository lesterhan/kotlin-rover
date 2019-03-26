package marsRover

import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import marsRover.Direction.*

class RoverControllerTest: StringSpec ({
    "establishRover" should {
        "create a rover with given parameters" {
            val rc = RoverController(1,1)
            rc.establishRover("1 2 N")

            rc.rovers.first().position shouldBe Position(1,2)
            rc.rovers.first().direction shouldBe NORTH
        }
    }
})