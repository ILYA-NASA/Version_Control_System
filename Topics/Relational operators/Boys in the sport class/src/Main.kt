const val TASK_COUNT = 3

fun main() {
    val heightList = List(TASK_COUNT) { readln().toInt() }
    println(heightList == heightList.sorted() || heightList == heightList.sortedDescending())
}