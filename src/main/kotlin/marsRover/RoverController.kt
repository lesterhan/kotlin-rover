package marsRover

import marsRover.Direction.*

class RoverController(val plateauLength: Int, val plateauWidth: Int) {
    val rovers: MutableList<Rover>

    init {
        rovers = ArrayList()
    }

    fun establishRover(createCommand: String) {
        rovers.add(Rover(Position(1,2), NORTH))
    }


}