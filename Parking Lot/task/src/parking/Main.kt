package parking

import java.util.*
import kotlin.system.exitProcess

val scanner = Scanner(System.`in`)

const val PARKING_IS_EMPTY = "Parking lot is empty."
const val NO_PARKING = "Sorry, the parking lot is full."
const val PARK = "park"
const val LEAVE = "leave"
const val CREATE = "create"
const val STATUS = "status"
const val REG_BY_COLOR = "reg_by_color"
const val SPOT_BY_COLOR = "spot_by_color"
const val SPOT_BY_REG = "spot_by_reg"

val spots = mutableListOf(
        Spot(1, false),
        Spot(2, false),
        Spot(3, false),
        Spot(4, false),
        Spot(5, false),
        Spot(6, false),
        Spot(7, false),
        Spot(8, false),
        Spot(9, false),
        Spot(10, false),
        Spot(11, false),
        Spot(12, false),
        Spot(13, false),
        Spot(14, false),
        Spot(15, false),
        Spot(16, false),
        Spot(17, false),
        Spot(18, false),
        Spot(19, false),
        Spot(20, false))

var command = ""
var spotsCounter: Int = 0
var numberSpotsInString: String = ""

// повторение команды create - true
var commandCreate = false

fun main() {
    parking(start())
}

fun start(): String {
    // вход в программу с проверкой команды create
    do {
        command = readLine().toString().trim()
        val initCommandCreate = command(command)
        if (initCommandCreate == "exit") {
            exitProcess(0)
        }
        if (initCommandCreate != CREATE) {
            println("Sorry, a parking lot has not been created.")
        }
    } while (initCommandCreate != CREATE)
    return command
}

fun nextCommand() {
    command = scanner.nextLine().trim()
    parking(command)
}

fun command(command: String): String {
    return command.substringBefore(' ')
}

fun carColor(command: String): String {
    return command.substringAfterLast(' ')
}

fun carRegistrationNumber(command: String): String {
    val after = command.substringAfter(' ')
    return after.substringBefore(' ')
}

fun numberOfSpots(command: String): String {
    return command.substringAfter(' ')
}

fun numberOfCreatedParkingSpots(quantity: String): Int {
    return quantity.toInt()
}

fun parking(command: String) {

    if (command == "exit") {
        exitProcess(0)
    }

    val color = carColor(command)
    val carRegistrationNumber = carRegistrationNumber(command)
    val currentCommand = command(command)

    if (currentCommand == CREATE) {
        numberSpotsInString = numberOfSpots(command)
        if (!commandCreate) {
            commandCreate = true
            println("Created a parking lot with $numberSpotsInString spots.")
            spotsCounter = numberOfCreatedParkingSpots(numberSpotsInString)
            nextCommand()
        }
        if (commandCreate) {
            for (spot in spots) {
                if (spot.spotInBusy()) {
                    spot.setStatusFreeOrBusy(false)
                    spot.setNumberOfCar("")
                    spot.setCarColor("")
                }
            }
            println("Created a parking lot with $numberSpotsInString spots.")
            spotsCounter = numberOfCreatedParkingSpots(numberSpotsInString)
            nextCommand()
        }
    }

    if (currentCommand == STATUS) {
        if (showStatus(spots)) println(PARKING_IS_EMPTY)
        nextCommand()
    }

    if (currentCommand == REG_BY_COLOR) {
        var inStock = false
        val arrNumberOfCar = mutableListOf<String>()
        for (spot in spots) {
            if (spot.carColor().toUpperCase() == color.toUpperCase()) {
                arrNumberOfCar.add(spot.numberOfCar())
                inStock = true
            }
        }
        if (!inStock) {
            println("No cars with color $color were found.")
        } else {
            println(arrNumberOfCar.joinToString())
        }
        nextCommand()
    }

    if (currentCommand == SPOT_BY_COLOR) {
        var inStock = false
        val arrSpotNumber = mutableListOf<Int>()
        for (spot in spots) {
            if (spot.carColor().toUpperCase() == color.toUpperCase()) {
                arrSpotNumber.add(spot.spotNumber())
                inStock = true
            }
        }
        if (!inStock) {
            println("No cars with color $color were found.")
        } else {
            println(arrSpotNumber.joinToString())
        }
        nextCommand()
    }

    if (currentCommand == SPOT_BY_REG) {
        var inStock = false
        for (spot in spots) {
            if (spot.numberOfCar() == carRegistrationNumber) {
                println(spot.spotNumber())
                inStock = true
            }
        }
        if (!inStock) {
            println("No cars with registration number $carRegistrationNumber were found.")
        }
        nextCommand()
    }

    if (currentCommand == LEAVE) {
        val num = command.substringAfter(' ')

        when (num.toInt()) {
            1 -> {
                if (spots[0].spotInBusy()) {
                    spots[0].setStatusFreeOrBusy(false)
                    spots[0].setNumberOfCar("")
                    spots[0].setCarColor("")
                    println("Spot 1 is free.")
                } else {
                    println("There is no car in spot 1.")
                }
                nextCommand()
            }
            2 -> {
                if (spots[1].spotInBusy()) {
                    spots[1].setStatusFreeOrBusy(false)
                    spots[1].setNumberOfCar("")
                    spots[1].setCarColor("")
                    println("Spot 2 is free.")
                } else {
                    println("There is no car in spot 2.")
                }
                nextCommand()
            }
            3 -> {
                if (spots[2].spotInBusy()) {
                    spots[2].setStatusFreeOrBusy(false)
                    spots[2].setNumberOfCar("")
                    spots[2].setCarColor("")
                    println("Spot 3 is free.")
                } else {
                    println("There is no car in spot 3.")
                }
                nextCommand()
            }
            4 -> {
                if (spots[3].spotInBusy()) {
                    spots[3].setStatusFreeOrBusy(false)
                    spots[3].setNumberOfCar("")
                    spots[3].setCarColor("")
                    println("Spot 4 is free.")
                } else {
                    println("There is no car in spot 4.")
                }
                nextCommand()
            }
            5 -> {
                if (spots[4].spotInBusy()) {
                    spots[4].setStatusFreeOrBusy(false)
                    spots[4].setNumberOfCar("")
                    spots[4].setCarColor("")
                    println("Spot 5 is free.")
                } else {
                    println("There is no car in spot 5.")
                }
                nextCommand()
            }
            6 -> {
                if (spots[5].spotInBusy()) {
                    spots[5].setStatusFreeOrBusy(false)
                    spots[5].setNumberOfCar("")
                    spots[5].setCarColor("")
                    println("Spot 6 is free.")
                } else {
                    println("There is no car in spot 6.")
                }
                nextCommand()
            }
            7 -> {
                if (spots[6].spotInBusy()) {
                    spots[6].setStatusFreeOrBusy(false)
                    spots[6].setNumberOfCar("")
                    spots[6].setCarColor("")
                    println("Spot 7 is free.")
                } else {
                    println("There is no car in spot 7.")
                }
                nextCommand()
            }
            8 -> {
                if (spots[7].spotInBusy()) {
                    spots[7].setStatusFreeOrBusy(false)
                    spots[7].setNumberOfCar("")
                    spots[7].setCarColor("")
                    println("Spot 8 is free.")
                } else {
                    println("There is no car in spot 8.")
                }
                nextCommand()
            }
            9 -> {
                if (spots[8].spotInBusy()) {
                    spots[8].setStatusFreeOrBusy(false)
                    spots[8].setNumberOfCar("")
                    spots[8].setCarColor("")
                    println("Spot 9 is free.")
                } else {
                    println("There is no car in spot 9.")
                }
                nextCommand()
            }
            10 -> {
                if (spots[9].spotInBusy()) {
                    spots[9].setStatusFreeOrBusy(false)
                    spots[9].setNumberOfCar("")
                    spots[9].setCarColor("")
                    println("Spot 10 is free.")
                } else {
                    println("There is no car in spot 10.")
                }
                nextCommand()
            }
            11 -> {
                if (spots[10].spotInBusy()) {
                    spots[10].setStatusFreeOrBusy(false)
                    spots[10].setNumberOfCar("")
                    spots[10].setCarColor("")
                    println("Spot 11 is free.")
                } else {
                    println("There is no car in spot 11.")
                }
                nextCommand()
            }
            12 -> {
                if (spots[11].spotInBusy()) {
                    spots[11].setStatusFreeOrBusy(false)
                    spots[11].setNumberOfCar("")
                    spots[11].setCarColor("")
                    println("Spot 12 is free.")
                } else {
                    println("There is no car in spot 12.")
                }
                nextCommand()
            }
            13 -> {
                if (spots[12].spotInBusy()) {
                    spots[12].setStatusFreeOrBusy(false)
                    spots[12].setNumberOfCar("")
                    spots[12].setCarColor("")
                    println("Spot 13 is free.")
                } else {
                    println("There is no car in spot 13.")
                }
                nextCommand()
            }
            14 -> {
                if (spots[13].spotInBusy()) {
                    spots[13].setStatusFreeOrBusy(false)
                    spots[13].setNumberOfCar("")
                    spots[13].setCarColor("")
                    println("Spot 14 is free.")
                } else {
                    println("There is no car in spot 14.")
                }
                nextCommand()
            }
            15 -> {
                if (spots[14].spotInBusy()) {
                    spots[14].setStatusFreeOrBusy(false)
                    spots[14].setNumberOfCar("")
                    spots[14].setCarColor("")
                    println("Spot 15 is free.")
                } else {
                    println("There is no car in spot 15.")
                }
                nextCommand()
            }
            16 -> {
                if (spots[15].spotInBusy()) {
                    spots[15].setStatusFreeOrBusy(false)
                    spots[15].setNumberOfCar("")
                    spots[15].setCarColor("")
                    println("Spot 16 is free.")
                } else {
                    println("There is no car in spot 16.")
                }
                nextCommand()
            }
            17 -> {
                if (spots[16].spotInBusy()) {
                    spots[16].setStatusFreeOrBusy(false)
                    spots[16].setNumberOfCar("")
                    spots[16].setCarColor("")
                    println("Spot 17 is free.")
                } else {
                    println("There is no car in spot 17.")
                }
                nextCommand()
            }
            18 -> {
                if (spots[17].spotInBusy()) {
                    spots[17].setStatusFreeOrBusy(false)
                    spots[17].setNumberOfCar("")
                    spots[17].setCarColor("")
                    println("Spot 18 is free.")
                } else {
                    println("There is no car in spot 18.")
                }
                nextCommand()
            }
            19 -> {
                if (spots[18].spotInBusy()) {
                    spots[18].setStatusFreeOrBusy(false)
                    spots[18].setNumberOfCar("")
                    spots[18].setCarColor("")
                    println("Spot 19 is free.")
                } else {
                    println("There is no car in spot 19.")
                }
                nextCommand()
            }
            20 -> {
                if (spots[19].spotInBusy()) {
                    spots[19].setStatusFreeOrBusy(false)
                    spots[19].setNumberOfCar("")
                    spots[19].setCarColor("")
                    println("Spot 20 is free.")
                } else {
                    println("There is no car in spot 20.")
                }
                nextCommand()
            }
        }
    }

    if (currentCommand == PARK) {
        when {
            !spots[0].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[0].setStatusFreeOrBusy(true)
                    spots[0].setNumberOfCar(carRegistrationNumber)
                    spots[0].setCarColor(color)
                    println("$color car parked in spot 1.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[1].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[1].setStatusFreeOrBusy(true)
                    spots[1].setNumberOfCar(carRegistrationNumber)
                    spots[1].setCarColor(color)
                    println("$color car parked in spot 2.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[2].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[2].setStatusFreeOrBusy(true)
                    spots[2].setNumberOfCar(carRegistrationNumber)
                    spots[2].setCarColor(color)
                    println("$color car parked in spot 3.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[3].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[3].setStatusFreeOrBusy(true)
                    spots[3].setNumberOfCar(carRegistrationNumber)
                    spots[3].setCarColor(color)
                    println("$color car parked in spot 4.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[4].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[4].setStatusFreeOrBusy(true)
                    spots[4].setNumberOfCar(carRegistrationNumber)
                    spots[4].setCarColor(color)
                    println("$color car parked in spot 5.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[5].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[5].setStatusFreeOrBusy(true)
                    spots[5].setNumberOfCar(carRegistrationNumber)
                    spots[5].setCarColor(color)
                    println("$color car parked in spot 6.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[6].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[6].setStatusFreeOrBusy(true)
                    spots[6].setNumberOfCar(carRegistrationNumber)
                    spots[6].setCarColor(color)
                    println("$color car parked in spot 7.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[7].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[7].setStatusFreeOrBusy(true)
                    spots[7].setNumberOfCar(carRegistrationNumber)
                    spots[7].setCarColor(color)
                    println("$color car parked in spot 8.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[8].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[8].setStatusFreeOrBusy(true)
                    spots[8].setNumberOfCar(carRegistrationNumber)
                    spots[8].setCarColor(color)
                    println("$color car parked in spot 9.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[9].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[9].setStatusFreeOrBusy(true)
                    spots[9].setNumberOfCar(carRegistrationNumber)
                    spots[9].setCarColor(color)
                    println("$color car parked in spot 10.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[10].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[10].setStatusFreeOrBusy(true)
                    spots[10].setNumberOfCar(carRegistrationNumber)
                    spots[10].setCarColor(color)
                    println("$color car parked in spot 11.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[11].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[11].setStatusFreeOrBusy(true)
                    spots[11].setNumberOfCar(carRegistrationNumber)
                    spots[11].setCarColor(color)
                    println("$color car parked in spot 12.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[12].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[12].setStatusFreeOrBusy(true)
                    spots[12].setNumberOfCar(carRegistrationNumber)
                    spots[12].setCarColor(color)
                    println("$color car parked in spot 13.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[13].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[13].setStatusFreeOrBusy(true)
                    spots[13].setNumberOfCar(carRegistrationNumber)
                    spots[13].setCarColor(color)
                    println("$color car parked in spot 14.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[14].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[14].setStatusFreeOrBusy(true)
                    spots[14].setNumberOfCar(carRegistrationNumber)
                    spots[14].setCarColor(color)
                    println("$color car parked in spot 15.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[15].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[15].setStatusFreeOrBusy(true)
                    spots[15].setNumberOfCar(carRegistrationNumber)
                    spots[15].setCarColor(color)
                    println("$color car parked in spot 16.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[16].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[16].setStatusFreeOrBusy(true)
                    spots[16].setNumberOfCar(carRegistrationNumber)
                    spots[16].setCarColor(color)
                    println("$color car parked in spot 17.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[17].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[17].setStatusFreeOrBusy(true)
                    spots[17].setNumberOfCar(carRegistrationNumber)
                    spots[17].setCarColor(color)
                    println("$color car parked in spot 18.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[18].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[18].setStatusFreeOrBusy(true)
                    spots[18].setNumberOfCar(carRegistrationNumber)
                    spots[18].setCarColor(color)
                    println("$color car parked in spot 19.")
                } else {
                    println(NO_PARKING)
                }
            }
            !spots[19].spotInBusy() -> {
                if (spotsCounter > 0) {
                    spotsCounter--
                    spots[19].setStatusFreeOrBusy(true)
                    spots[19].setNumberOfCar(carRegistrationNumber)
                    spots[19].setCarColor(color)
                    println("$color car parked in spot 20.")
                } else {
                    println(NO_PARKING)
                }
            }
            else -> println(NO_PARKING)
        }
        nextCommand()
    }
}

fun showStatus(list: MutableList<Spot>): Boolean {
    var free = true
    for (spot in list) {
        if (spot.spotInBusy()) {
            println("${spot.spotNumber()} ${spot.numberOfCar()} ${spot.carColor()}")
            free = false
        }
    }
    return free
}

data class Spot(private val parkingSpaceNumber: Int,
                private var isFree: Boolean,
                private var numberOfCar: String = "",
                private var carColor: String = "") {

    fun spotNumber(): Int {
        return parkingSpaceNumber
    }

    fun setStatusFreeOrBusy(status: Boolean) {
        isFree = status
    }

    fun spotInBusy(): Boolean {
        return isFree
    }

    fun setNumberOfCar(number: String) {
        numberOfCar = number
    }

    fun numberOfCar(): String {
        return numberOfCar
    }

    fun setCarColor(color: String) {
        carColor = color
    }

    fun carColor(): String {
        return carColor
    }
}