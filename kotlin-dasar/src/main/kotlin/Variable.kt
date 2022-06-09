const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    val firstName = "Abu"
    val age = 30

    println(firstName)
    println(age)

    var name: String?
    name = "Abu"
    println(name)
    println(name?.length)

    println(APPLICATION)
    println(VERSION)
}