import java.util.Scanner

data class Box(val height: Int, val length: Int, val width: Int)

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val height = input.nextInt()
    val lengthOne = input.nextInt()
    val lengthTwo = input.nextInt()
    val width = input.nextInt()

    val box = Box(height, lengthOne, width)
    val boxCopy = box.copy(length = lengthTwo)

    println(box.toString())
    println(boxCopy.toString())
}