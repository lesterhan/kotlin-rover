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
            N -> Position(position.x, position.y + 1)
            S -> Position(position.x, position.y - 1)
            E -> Position(position.x + 1, position.y)
            W -> Position(position.x - 1, position.y)
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