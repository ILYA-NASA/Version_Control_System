/*
fun main() {
    val squirrels = readln().toInt()
    val nuts = readln().toInt()
    println(nuts / squirrels)
}
 */

fun main() = List(2) { readln().toInt() }.let { (n, k) -> k / n }.run(::print)