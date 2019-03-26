package marsRover

import marsRover.Direction.*

class Rover(initialVector: Vector, initialDirection: Direction) {
    var vector: Vector
        private set
    var direction: Direction
        private set

    init {
        vector = initialVector
        direction = initialDirection
    }

    companion object {
        fun fromString(initializationString: String): Rover {
            val splitString = initializationString.split(' ')
            val x = splitString[0].toInt()
            val y = splitString[1].toInt()
            val direction = Direction.valueOf(splitString[2])
            return Rover(Vector(x,y), direction)
        }
    }

    fun move() {
        vector = when (direction) {
            N -> Vector(vector.x, vector.y + 1)
            S -> Vector(vector.x, vector.y - 1)
            E -> Vector(vector.x + 1, vector.y)
            W -> Vector(vector.x - 1, vector.y)
        }
    }

    fun turnLeft() {
        direction = when (direction) {
            N -> W
            W -> S
            S -> E
            E -> N
        }
    }

    fun turnRight() {
        direction = when (direction) {
            N -> E
            E -> S
            S -> W
            W -> N
        }
    }
}