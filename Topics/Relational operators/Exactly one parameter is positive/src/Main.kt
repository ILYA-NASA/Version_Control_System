const val TASK_INPUT_COUNT = 3
const val TASK_POSITIVE_COUNT = 1

fun main() = (Array(TASK_INPUT_COUNT) { readln().toInt() }.filter { it > 0 }.size == TASK_POSITIVE_COUNT).let(::println)