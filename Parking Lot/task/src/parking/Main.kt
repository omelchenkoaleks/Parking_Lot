package parking

import kotlin.system.exitProcess


const val NO_PARKING = "Sorry, the parking lot is full."
const val PARK = "park"
const val LEAVE = "leave"

val spotOne = Spot(1, false)
val spotTwo = Spot(2, false)
val spotThree = Spot(3, false)
val spotFour = Spot(4, false)
val spotFive = Spot(5, false)
val spotSix = Spot(6, false)
val spotSeven = Spot(7, false)
val spotEight = Spot(8, false)
val spotNine = Spot(9, false)
val spotTen = Spot(10, false)
val spotEleven = Spot(11, false)
val spotTwelve = Spot(12, false)
val spotThirteen = Spot(13, false)
val spotFourteen = Spot(14, false)
val spotFifteen = Spot(15, false)
val spotSixteen = Spot(16, false)
val spotSeventeen = Spot(17, false)
val spotEighteen = Spot(18, false)
val spotNineteen = Spot(19, false)
val spotTwenty = Spot(20, false)

var command = ""

fun main() {
    parking(start())
}

fun start(): String {
    command = readLine().toString().trim()
    return command
}

fun nextCommand() {
    command = readLine().toString().trim()
    parking(command)
}

// true - park   &&   false - leave
fun checkCommand(command: String): Boolean {
    var park = ""
    var leave = ""
    if (command.length > 4) {
        park = command.substring(0, 4)
        leave = command.substring(0, 5)
    }
    when {
        park == PARK -> return true
        leave == LEAVE -> return false
    }
    return false
}

fun carColor(command: String): String {
    return command.substringAfterLast(' ')
}

fun parking(command: String) {

    if (command == "exit") {
        exitProcess(0)
    }

    val color = carColor(command)
    val currentCommand = checkCommand(command)
    if (!currentCommand) {
        val num = command.substringAfter(' ')

        when (num.toInt()) {
            1 -> {
                if (spotOne.spotInBusy()) {
                    spotOne.setStatus(false)
                    println("Spot 1 is free.")
                } else {
                    println("There is no car in spot 1.")
                }
                nextCommand()
            }
            2 -> {
                if (spotTwo.spotInBusy()) {
                    spotTwo.setStatus(false)
                    println("Spot 2 is free.")
                } else {
                    println("There is no car in spot 2.")
                }
                nextCommand()
            }
            3 -> {
                if (spotThree.spotInBusy()) {
                    spotThree.setStatus(false)
                    println("Spot 3 is free.")
                } else {
                    println("There is no car in spot 3.")
                }
                nextCommand()
            }
            4 -> {
                if (spotFour.spotInBusy()) {
                    spotFour.setStatus(false)
                    print("Spot 4 is free.")
                } else {
                    println("There is no car in spot 4.")
                }
                nextCommand()
            }
            5 -> {
                if (spotFive.spotInBusy()) {
                    spotFive.setStatus(false)
                    println("Spot 5 is free.")
                } else {
                    println("There is no car in spot 5.")
                }
                nextCommand()
            }
            6 -> {
                if (spotSix.spotInBusy()) {
                    spotSix.setStatus(false)
                    println("Spot 6 is free.")
                } else {
                    println("There is no car in spot 6.")
                }
                nextCommand()
            }
            7 -> {
                if (spotSeven.spotInBusy()) {
                    spotSeven.setStatus(false)
                    println("Spot 7 is free.")
                } else {
                    println("There is no car in spot 7.")
                }
                nextCommand()
            }
            8 -> {
                if (spotEight.spotInBusy()) {
                    spotEight.setStatus(false)
                    println("Spot 8 is free.")
                } else {
                    println("There is no car in spot 8.")
                }
                nextCommand()
            }
            9 -> {
                if (spotNine.spotInBusy()) {
                    spotNine.setStatus(false)
                    println("Spot 9 is free.")
                } else {
                    println("There is no car in spot 9.")
                }
                nextCommand()
            }
            10 -> {
                if (spotTen.spotInBusy()) {
                    spotTen.setStatus(false)
                    println("Spot 10 is free.")
                } else {
                    println("There is no car in spot 10.")
                }
                nextCommand()
            }
            11 -> {
                if (spotEleven.spotInBusy()) {
                    spotEleven.setStatus(false)
                    println("Spot 11 is free.")
                } else {
                    println("There is no car in spot 11.")
                }
                nextCommand()
            }
            12 -> {
                if (spotTwelve.spotInBusy()) {
                    spotTwelve.setStatus(false)
                    println("Spot 12 is free.")
                } else {
                    println("There is no car in spot 12.")
                }
                nextCommand()
            }
            13 -> {
                if (spotThirteen.spotInBusy()) {
                    spotThirteen.setStatus(false)
                    println("Spot 13 is free.")
                } else {
                    println("There is no car in spot 13.")
                }
                nextCommand()
            }
            14 -> {
                if (spotFourteen.spotInBusy()) {
                    spotFourteen.setStatus(false)
                    println("Spot 14 is free.")
                } else {
                    println("There is no car in spot 14.")
                }
                nextCommand()
            }
            15 -> {
                if (spotFifteen.spotInBusy()) {
                    spotFifteen.setStatus(false)
                    println("Spot 15 is free.")
                } else {
                    println("There is no car in spot 15.")
                }
                nextCommand()
            }
            16 -> {
                if (spotSixteen.spotInBusy()) {
                    spotSixteen.setStatus(false)
                    println("Spot 16 is free.")
                } else {
                    println("There is no car in spot 16.")
                }
                nextCommand()
            }
            17 -> {
                if (spotSeventeen.spotInBusy()) {
                    spotSeventeen.setStatus(false)
                    println("Spot 17 is free.")
                } else {
                    println("There is no car in spot 17.")
                }
                nextCommand()
            }
            18 -> {
                if (spotEighteen.spotInBusy()) {
                    spotEighteen.setStatus(false)
                    println("Spot 18 is free.")
                } else {
                    println("There is no car in spot 18.")
                }
                nextCommand()
            }
            19 -> {
                if (spotNineteen.spotInBusy()) {
                    spotNineteen.setStatus(false)
                    println("Spot 19 is free.")
                } else {
                    println("There is no car in spot 19.")
                }
                nextCommand()
            }
            20 -> {
                if (spotTwenty.spotInBusy()) {
                    spotTwenty.setStatus(false)
                    println("Spot 20 is free.")
                } else {
                    println("There is no car in spot 20.")
                }
                nextCommand()
            }
        }
    }

    if (currentCommand) {
        when {
            !spotOne.spotInBusy() -> {
                spotOne.setStatus(true)
                println("$color car parked in spot 1.")
            }
            !spotTwo.spotInBusy() -> {
                spotTwo.setStatus(true)
                println("$color car parked in spot 2.")
            }
            !spotThree.spotInBusy() -> {
                spotThree.setStatus(true)
                println("$color car parked in spot 3.")
            }
            !spotFour.spotInBusy() -> {
                spotFour.setStatus(true)
                println("$color car parked in spot 4.")
            }
            !spotFive.spotInBusy() -> {
                spotFive.setStatus(true)
                println("$color car parked in spot 5.")
            }
            !spotSix.spotInBusy() -> {
                spotSix.setStatus(true)
                println("$color car parked in spot 6.")
            }
            !spotSeven.spotInBusy() -> {
                spotSeven.setStatus(true)
                println("$color car parked in spot 7.")
            }
            !spotEight.spotInBusy() -> {
                spotEight.setStatus(true)
                println("$color car parked in spot 8.")
            }
            !spotNine.spotInBusy() -> {
                spotNine.setStatus(true)
                println("$color car parked in spot 9.")
            }
            !spotTen.spotInBusy() -> {
                spotTen.setStatus(true)
                println("$color car parked in spot 10.")
            }
            !spotEleven.spotInBusy() -> {
                spotEleven.setStatus(true)
                println("$color car parked in spot 11.")
            }
            !spotTwelve.spotInBusy() -> {
                spotTwelve.setStatus(true)
                println("$color car parked in spot 12.")
            }
            !spotThirteen.spotInBusy() -> {
                spotThirteen.setStatus(true)
                println("$color car parked in spot 13.")
            }
            !spotFourteen.spotInBusy() -> {
                spotFourteen.setStatus(true)
                println("$color car parked in spot 14.")
            }
            !spotFifteen.spotInBusy() -> {
                spotFifteen.setStatus(true)
                println("$color car parked in spot 15.")
            }
            !spotSixteen.spotInBusy() -> {
                spotSixteen.setStatus(true)
                println("$color car parked in spot 16.")
            }
            !spotSeventeen.spotInBusy() -> {
                spotSeventeen.setStatus(true)
                println("$color car parked in spot 17.")
            }
            !spotEighteen.spotInBusy() -> {
                spotEighteen.setStatus(true)
                println("$color car parked in spot 18.")
            }
            !spotNineteen.spotInBusy() -> {
                spotNineteen.setStatus(true)
                println("$color car parked in spot 19.")
            }
            !spotTwenty.spotInBusy() -> {
                spotTwenty.setStatus(true)
                println("$color car parked in spot 20.")
            }
            else -> println(NO_PARKING)
        }
        nextCommand()
    }
}

data class Spot(private val num: Int, private var free: Boolean) {

    fun setStatus(status: Boolean) {
        free = status
    }

    fun spotInBusy(): Boolean {
        return free
    }

    fun spotNumber(): Int {
        return num
    }
}