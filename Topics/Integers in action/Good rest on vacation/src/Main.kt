const val INPUT_COUNT = 4
const val FLIGHTS = 2

fun main() {
    val (dayCount, dayFoodCost, oneFlightCost, oneNightCost) = Array(INPUT_COUNT) { readln().toInt() }
    println(dayCount * dayFoodCost + FLIGHTS * oneFlightCost + (dayCount - 1) * oneNightCost)
}