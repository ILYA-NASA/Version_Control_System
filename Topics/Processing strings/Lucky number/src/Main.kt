fun main() {
    val num = readln()
    val partOne = num.substring(0, num.length / 2)
    val partTwo = num.substring(num.length / 2)
    var sumPartOne = 0
    var sumPartTwo = 0
    partOne.forEach { sumPartOne += it.digitToInt() }
    partTwo.forEach { sumPartTwo += it.digitToInt() }
    println(if (sumPartOne == sumPartTwo) "YES" else "NO")
}