package marsRover

class Rover (initialPosition: Position, initialDirection: Direction){
    var position: Position
        private set
    var direction: Direction
        private set

    init {
        position = initialPosition
        direction = initialDirection
    }

    fun move() {
        position = Position(position.x,position.y + 1)
    }
}