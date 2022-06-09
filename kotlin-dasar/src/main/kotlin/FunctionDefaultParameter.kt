fun main() {
    hello("Abu")
    hello("Abu", "Aziz")
    hello("Budi")
    hello("Hahahihi")
}

fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}