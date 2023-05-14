fun main() {
    val input = readln().toInt()
    var countNum = 1
    var countInput = 1
    while (countNum <= input) {
        repeat(countNum) {
            if (countInput <= input) {
                print("$countNum ")
            }
            countInput++
        }
        countNum++
    }
}