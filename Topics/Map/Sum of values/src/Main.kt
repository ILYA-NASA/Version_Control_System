fun summator(map: Map<Int, Int>): Int {
    // put your code here
    var result = 0
    for ((k, v) in map) if (k % 2 == 0) result += v
    return result
}

// fun summator(map: Map<Int, Int>) = map.filter { it.key % 2 == 0 }.values.sum()