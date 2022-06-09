fun main() {
    val result = "Abu Aziz" to "UP"
    println(result)
}

infix fun String.to(type: String): String {
    return if (type == "LO") {
        this.uppercase()
    } else {
        this.lowercase()
    }
}