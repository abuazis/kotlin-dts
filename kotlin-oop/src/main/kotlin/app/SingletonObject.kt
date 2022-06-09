package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Changed"
    println(Utilities.name)
    println(Utilities.toUpper("Abu"))
    a()
    b()

    println(Application.Companion.toUpper("Abu"))
    println(Application.toUpper("Abu"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}