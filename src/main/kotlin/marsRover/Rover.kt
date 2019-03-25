package marsRover

class Rover (position: Position, direction: Direction){
    var position: Position? = null
        private set
    var direction: Direction? = null
        private set

    fun move() {
        position = Position(0,1)
    }
}