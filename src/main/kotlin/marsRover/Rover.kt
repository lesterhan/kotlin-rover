package marsRover

import marsRover.Direction.*

class Rover(initialPosition: Position, initialDirection: Direction) {
    var position: Position
        private set
    var direction: Direction
        private set

    init {
        position = initialPosition
        direction = initialDirection
    }

    fun move() {
        position = when (direction) {
            NORTH -> Position(position.x, position.y + 1)
            SOUTH -> Position(position.x, position.y - 1)
            EAST -> Position(position.x + 1, position.y)
            WEST -> Position(position.x - 1, position.y)
        }
    }

    fun turnLeft() {
        direction = when (direction) {
            NORTH -> WEST
            WEST -> SOUTH
            SOUTH -> EAST
            EAST -> NORTH
        }
    }

    fun turnRight() {
        direction = when (direction) {
            NORTH -> EAST
            EAST -> SOUTH
            SOUTH -> WEST
            WEST -> NORTH
        }
    }
}