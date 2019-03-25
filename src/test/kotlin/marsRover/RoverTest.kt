package marsRover

import io.kotlintest.Spec
import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec
import io.kotlintest.specs.ShouldSpec

class RoverTest : AnnotationSpec(){
    private var rover: Rover

    init {
        rover = Rover(Position(0, 0), Direction.NORTH)
    }

    @BeforeEach
    fun beforeEach() {
        rover = Rover(Position(0, 0), Direction.NORTH)
    }

    @Test
    fun incrementYWhileFacingNorth() {
        rover.move()
        rover.position shouldBe Position(0, 1)
    }

    @Test
    fun incrementTwiceWhenMovingTwice() {
        rover.move()
        rover.move()
        rover.position shouldBe Position(0, 2)
    }
}