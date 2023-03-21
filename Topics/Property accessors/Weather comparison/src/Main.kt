const val MIN_TASK_TEMP = -92
const val MAX_TASK_TEMP = 57
const val DEFAULT_DUBAI_TEMP = 30
const val DEFAULT_MOSCOW_TEMP = 5
const val DEFAULT_HANOI_TEMP = 20

data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = when (name) {
                "Dubai" -> if (value < MIN_TASK_TEMP || value > MAX_TASK_TEMP) DEFAULT_DUBAI_TEMP else value
                "Moscow" -> if (value < MIN_TASK_TEMP || value > MAX_TASK_TEMP) DEFAULT_MOSCOW_TEMP else value
                "Hanoi" -> if (value < MIN_TASK_TEMP || value > MAX_TASK_TEMP) DEFAULT_HANOI_TEMP else value
                else -> value
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    // implement comparing here
    print(
        when {
            firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees -> firstCity.name
            secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees -> secondCity.name
            thirdCity.degrees < secondCity.degrees && thirdCity.degrees < firstCity.degrees -> thirdCity.name
            else -> "neither"
        }
    )
}

