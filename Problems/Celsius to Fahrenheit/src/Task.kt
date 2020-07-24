import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    val c = scanner.nextDouble()
    println(toF(c))
}

fun toF(c: Double): Double {
    return c * 1.8 + 32
}