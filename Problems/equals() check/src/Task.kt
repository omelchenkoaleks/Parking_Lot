import java.util.Scanner

data class Client(val name: String, val age: Int) {
    val balance: Int = 0
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val nameClientOne = input.next()
    val ageClientOne = input.nextInt()
    val balanceClientOne = input.nextInt()
    val nameClientTwo = input.next()
    val ageClientTwo = input.nextInt()
    val balanceClientTwo = input.nextInt()

    val clientOne = Client(nameClientOne, ageClientOne)
    val clientTwo = Client(nameClientTwo, ageClientTwo)

    println(clientOne == clientTwo)
}