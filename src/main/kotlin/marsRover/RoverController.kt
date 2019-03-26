package marsRover

class RoverController(
    val plateauDimention: Vector,
    val rover: Rover
) {
    fun commandRover(commandString: String) {
        for(command in commandString){
            when (command) {
                'M' -> rover.move()
                'L' -> rover.turnLeft()
                'R' -> rover.turnRight()
            }
        }
    }
}