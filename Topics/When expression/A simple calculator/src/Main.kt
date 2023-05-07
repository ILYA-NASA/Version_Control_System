fun main() {
    val (a, b, c) = readln().trim().split(" ")
    try {
        println(
            when (b) {
                "+" -> a.toLong() + c.toLong()
                "-" -> a.toLong() - c.toLong()
                "/" -> a.toLong() / c.toLong()
                "*" -> a.toLong() * c.toLong()
                else -> "Unknown operator"
            }
        )
    } catch (e: ArithmeticException) {
        println("Division by 0!")
    }
}