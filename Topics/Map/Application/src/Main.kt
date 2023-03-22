fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    var result = 0
    shoppingList.forEach { result += priceList[it] ?: 0 }
    return result
}

// fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int =
//     shoppingList.sumOf { priceList[it] ?: 0 }