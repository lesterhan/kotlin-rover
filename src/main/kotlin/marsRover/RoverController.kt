package marsRover

import marsRover.entities.Rover
import marsRover.entities.Vector
import marsRover.exceptions.IllegalManeuver

class RoverController(
    val plateauDimention: Vector,
    private val rover: Rover
) {
    fun commandRover(commandString: String) {
        for(command in commandString){
            when (command) {
                'M' -> rover.move()
                'L' -> rover.turnLeft()
                'R' -> rover.turnRight()
            }
            throwExceptionIfRoverOutOfBounds()
        }
    }

    private fun throwExceptionIfRoverOutOfBounds() {
        if (rover.vector.x > plateauDimention.x || rover.vector.y > plateauDimention.y) {
            throw IllegalManeuver()
        }
    }

    fun report(): String {
        return """${rover.vector.x} ${rover.vector.y} ${rover.direction}"""
    }
}