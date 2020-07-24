import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    val density = scanner.nextDouble()
    val height = scanner.nextDouble()

    println(calculateLiquidPressure(density, height))
}

fun calculateLiquidPressure(density: Double, height: Double): Double {
    val gravity = 9.8
    return gravity * density * height
}