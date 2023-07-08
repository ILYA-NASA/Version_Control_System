fun main() {
    val (fistCountry, secondCountry) = readln().split(" ")
    for (country in Countries.values()) {
        if (fistCountry.uppercase() == country.name) {
            country.getCurrencyComparison(secondCountry.uppercase())
                .let(::println)
        }
    }
}

enum class Countries(private val currency: String) {
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    KIRIBATI("Australian dollar");

    fun getCurrencyComparison(secondCountry: String): Boolean {
        var result = false
        for (country in Countries.values()) {
            if (secondCountry == country.name) result = country.currency == this.currency
        }
        return result
    }
}