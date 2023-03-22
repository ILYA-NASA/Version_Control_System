fun stringToMap(first: String, second: String, third: String): Map<String, Int> {
    return buildMap {
        put(first, first.length)
        put(second, second.length)
        put(third, third.length)
    }
}

// fun stringToMap(first: String, second: String, third: String) =
//     listOf(first, second, third).associateWith { it.length }