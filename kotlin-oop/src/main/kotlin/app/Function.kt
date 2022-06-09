package app

import data.Person

fun main() {
    val abu = Person()
    abu.firstName = "Abu"
    abu.middleName = "Rothschild"
    abu.lastName = "Aziz"

    abu.sayHello("Budi")
    abu.run()

    val fullName = abu.getFullName()
    println(fullName)
}