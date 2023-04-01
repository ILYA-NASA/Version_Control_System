fun main() {
    val (s, n) = readln().split(" ")
    if (n.toInt() > s.length) return println(s)
    println(s.drop(n.toInt()) + s.take(n.toInt()))
}