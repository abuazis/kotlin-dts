package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(19, 10, Plus()))
    println(operation(19, 6, Minus()))
    println(operation(20, 10, Modulo()))
}