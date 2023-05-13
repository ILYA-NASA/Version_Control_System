fun main() {
    val charNumber = readln().toInt()
    val char = readln()

    println(char.map { it == charNumber.toChar() }.joinToString())
}