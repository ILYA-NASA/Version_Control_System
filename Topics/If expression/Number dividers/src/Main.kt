fun main() {
    val taskNumArray = arrayOf(2, 3, 5, 6)
    val m = readln().toInt()
    taskNumArray.forEach {
        if (m % it == 0) {
            println("Divided by $it")
        }
    }
}