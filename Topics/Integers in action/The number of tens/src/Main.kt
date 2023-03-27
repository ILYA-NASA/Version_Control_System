@Suppress("MagicNumber")
fun main() {
    val input = readln()
    println(if (input.length > 1) input.substring(input.length - 2).toInt() / 10 else 0)
}

// fun main() = println(readln().toInt() % 100 / 10)