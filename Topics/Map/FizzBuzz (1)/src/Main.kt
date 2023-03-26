const val DIVISOR_FOR_FIZZ = 3
const val DIVISOR_FOR_BUZZ = 5

fun iterator(map: Map<String, Int>) {
    map.values.forEach {
        println(
            when {
                it % DIVISOR_FOR_FIZZ == 0 -> "Fizz"
                it % DIVISOR_FOR_BUZZ == 0 -> "Buzz"
                else -> "FizzBuzz"
            }
        )
    }
}