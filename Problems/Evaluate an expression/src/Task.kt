import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    val x = scanner.nextDouble()
    print(calculate(x))
}

fun calculate(x: Double): Double {
    val x3 = x * x * x
    val x2 = x * x
    return x3 + x2 + x + 1
}