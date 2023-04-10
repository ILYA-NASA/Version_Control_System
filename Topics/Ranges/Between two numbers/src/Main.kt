fun main() {
    val firstNumber = readln().toInt()
    val range = readln().toInt()..readln().toInt()
    println(firstNumber in range)
}