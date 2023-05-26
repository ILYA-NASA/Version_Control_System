fun main() {
    val n = readln().toInt()
//    (−15,12]∪(14,17)∪[19,+∞)
    println(if (n in -14..12 || n in 15..16 || n in 19..Long.MAX_VALUE) "True" else "False")
}