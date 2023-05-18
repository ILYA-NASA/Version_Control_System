// complete this function
fun concatenate(one: String, two: String, three: String, separator: String = " ") =
//    one + separator + two + separator + three
    listOf<String>(one, two, three).joinToString(separator)