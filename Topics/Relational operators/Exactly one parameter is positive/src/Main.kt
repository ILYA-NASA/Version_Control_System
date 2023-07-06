const val TASK_INPUT_COUNT = 3
const val TASK_POSITIVE_COUNT = 1

fun main() {
    val inputArray = IntArray(TASK_INPUT_COUNT) { readln().toInt() }
    var count = 0
    inputArray.forEach { if (it > 0) count++ }
    println(count == TASK_POSITIVE_COUNT)
}