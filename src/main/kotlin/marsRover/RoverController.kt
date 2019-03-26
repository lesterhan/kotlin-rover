package marsRover

import marsRover.Direction.*

class RoverController(val plateauLength: Int, val plateauWidth: Int) {
    val rovers: MutableList<Rover>

    init {
        rovers = ArrayList()
    }

    fun establishRover(createCommand: String) {
        val splitString = createCommand.split(' ')
        val x = splitString[0].toInt()
        val y = splitString[1].toInt()
        val direction = Direction.valueOf(splitString[2])

        rovers.add(Rover(Position(x,y), direction))
    }


}