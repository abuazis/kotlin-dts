package app

import data.Smartphone

fun main() {
    val smartphone = Smartphone("Samsung S18", "Android")

    println(smartphone.toString())
    println(smartphone.hashCode())
}