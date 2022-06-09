fun main() {
    sayHello("Abu", "Aziz")
    sayHello("Aziz", null)
}

fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}