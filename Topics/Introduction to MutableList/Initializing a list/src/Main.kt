fun main() {
    val numbers = MutableList(100) { i ->
        when (i + 1) {
            1, 10, 100 -> i + 1
            else -> 0
        }
    }

    // do not touch the lines below 
    println(numbers.joinToString())
}