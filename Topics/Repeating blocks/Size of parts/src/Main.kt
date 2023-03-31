fun main() {
    var (larger, smaller, perfect) = arrayOf(0, 0, 0)
    repeat(readln().toInt()) {
        when (readln()) {
            "1" -> larger++
            "-1" -> smaller++
            "0" -> perfect++
        }
    }
    println("$perfect $larger $smaller")
}