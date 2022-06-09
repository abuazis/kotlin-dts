package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Abu")
    manager.sayHello("Aziz")

    val vicePresident = VicePresident("Budi")
    vicePresident.sayHello("Joko")
}