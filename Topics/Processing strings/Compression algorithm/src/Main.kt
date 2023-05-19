fun main() {
    // write your code here
    val inputString = readln()
    var countRepeatedIt = 1
    var currentIt = inputString.first()
    val forEachString =
        if (inputString.length != 1) {
            inputString.substring(1)
        } else {
            print(currentIt + "1")
            return
        }
    var currentLengthString = 0

    forEachString.forEach {
        currentLengthString++
        if (it == currentIt) {
            countRepeatedIt++
        } else {
            print("$currentIt$countRepeatedIt")
            countRepeatedIt = 1
            currentIt = it
        }
        if (currentLengthString == forEachString.length) {
            print("$currentIt$countRepeatedIt")
        }
    }
}