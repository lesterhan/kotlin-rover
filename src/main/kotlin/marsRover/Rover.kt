package marsRover

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
            Direction.NORTH -> Position(position.x, position.y + 1)
            Direction.SOUTH -> Position(position.x, position.y - 1)
            Direction.EAST -> Position(position.x + 1, position.y)
            Direction.WEST -> Position(position.x - 1, position.y)
        }

    }
}