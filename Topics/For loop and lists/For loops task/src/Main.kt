fun main() {
    val inputArray = IntArray(readln().toInt()) { readln().toInt() }
    val (p, m) = readln().split(" ").map { it.toInt() }
    println(if (p in inputArray && m in inputArray) "YES" else "NO")
}