import marsRover.RoverController
import marsRover.entities.Rover
import marsRover.entities.Vector

fun main(args: Array<String>) {
    // This part is not tested... lord forgive me
    println("Welcome to Kotlin Rover!")
    println("Enter plateau dimensions:")
    val plateauDimensionsInput = readLine()!!.split(' ')
    val plateauDimensions = Vector(plateauDimensionsInput[0].toInt(), plateauDimensionsInput[1].toInt())
    while (true) {
        println("Enter rover position and heading:")
        val roverInitializationString = readLine()!!
        val rc = RoverController(plateauDimensions, Rover.fromString(roverInitializationString))
        println("Enter rover command:")
        val roverCommand = readLine()!!
        rc.commandRover(roverCommand)
        println("""New coordinates and heading: ${rc.report()}""")
    }
}