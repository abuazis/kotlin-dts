package app

import data.Fruit

fun main() {
    val fruit1 = Fruit(1)
    val fruit2 = Fruit(2)
    val fruit3 = fruit1 + fruit2
    println(fruit3)

    println(fruit3 - Fruit(10))
}