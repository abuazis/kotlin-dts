package app

import data.Car

fun main() {
    val toyota = Car("Toyota")
    toyota.year = 2015

    val almaz = Car("Wuling", "Almaz")

    println(toyota.brand)
    println(toyota.year)
    println(almaz.brand)
    println(almaz.year)
}