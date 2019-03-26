package marsRover

import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import marsRover.Direction.*

class RoverControllerTest: StringSpec ({
    "establishRover" should {
        "create a rover with given parameters" {
            val rc = RoverController(5,5)
            rc.establishRover("1 2 N")

            rc.rovers.first().position shouldBe Position(1,2)
            rc.rovers.first().direction shouldBe N
        }

        "create two rovers with given parameters" {
            val rc = RoverController(5,5)
            rc.establishRover("1 2 N")
            rc.establishRover("3 4 E")

            rc.rovers[0].position shouldBe Position(1,2)
            rc.rovers[0].direction shouldBe N

            rc.rovers[1].position shouldBe Position(3,4)
            rc.rovers[1].direction shouldBe E
        }
    }
})