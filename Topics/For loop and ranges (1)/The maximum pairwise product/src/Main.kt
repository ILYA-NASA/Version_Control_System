fun main() {
    val inputList = MutableList(readln().toInt()) { readln().toInt() }
    val firstMax = inputList.maxOrNull()
    inputList.remove(firstMax)
    println(if (inputList.isEmpty()) firstMax else firstMax!! * inputList.maxOrNull()!!)
}