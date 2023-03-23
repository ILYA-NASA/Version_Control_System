fun main() {
    val inputList = readln().split(" ").map { it }.toMutableList()
    var longestIndex = 0
    var longestLength = inputList[longestIndex].length
    inputList.forEach {
        if (it.length > longestLength) {
            longestLength = it.length
            longestIndex = inputList.indexOf(it)
        }
    }
    println(inputList[longestIndex])
}