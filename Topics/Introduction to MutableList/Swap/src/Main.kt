fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    /*
    val firstElement = numbers.first()
    val lastElement = numbers.last()
    numbers[0] = lastElement
    numbers[numbers.lastIndex] = firstElement
    */
    numbers[0] = numbers.last().also { numbers[numbers.lastIndex] = numbers.first() }

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}