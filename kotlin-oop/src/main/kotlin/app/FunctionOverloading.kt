package app

import data.Person

fun main() {
    val abu = Person()
    abu.firstName = "Abu"

    abu.sayHello("Budi")
    abu.sayHello("Joko", "Nugroho")
}