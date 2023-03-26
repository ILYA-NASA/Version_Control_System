fun main() {
    val inputList = MutableList(readln().toInt()) { readln().toInt() }
    println(if (inputList.contains(readln().toInt())) "YES" else "NO")
}