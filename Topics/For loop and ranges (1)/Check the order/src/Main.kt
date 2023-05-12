fun main() {
    val size = readln().toInt()
    var first = readln().toInt()
    repeat(size - 1) {
        if (first + 1 > readln().toInt()) {
            println("NO")
            return
        }
        first = first.inc()
    }
    println("YES")
}