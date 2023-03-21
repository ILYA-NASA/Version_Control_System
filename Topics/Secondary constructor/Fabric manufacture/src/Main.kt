data class Fabric(var color: String) {
    var pattern: String = "none"
    var patternColor: String = "none"
    init {
        println("$color fabric is created")
    }

    constructor(color: String, pattern: String, patternColor: String) : this(color) {
        this.color = color
        this.patternColor = patternColor
        this.pattern = pattern
        println("$patternColor $pattern pattern is printed on the fabric")
    }
}

// fun main() { Fabric("white", "dots", "black") }