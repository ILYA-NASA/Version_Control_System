const val TIME_DIVIDER = 60
const val HOURS_IN_DAY = 24

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000
    val hours = totalSeconds / TIME_DIVIDER / TIME_DIVIDER % HOURS_IN_DAY
    val minutes = totalSeconds / TIME_DIVIDER % hours
    val seconds = totalSeconds % TIME_DIVIDER
    println("$hours:$minutes:$seconds")
}