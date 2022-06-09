package app

import data.Human

fun main() {
    val human: Human = Human("Abu")
    human.sayHello("Budi")
    human.go()
    human.move()
}