package app

import data.HandPhone
import data.Laptop

fun main() {
    printString("Abu")
//    printString(1) // ERROR

    printStringSafe(1)

    printObjectWithWhen("Abu")
    printObjectWithWhen(1)
    printObject(HandPhone("Samsung"))
    printObject(Laptop("Acer"))
}

fun printString(any: Any) {
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop is ${any.name}")
    } else if (any is HandPhone) {
        println("HandPhone is ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop is ${any.name}")
        is HandPhone -> println("HandPhone is ${any.name}")
        else -> println(any)
    }
}