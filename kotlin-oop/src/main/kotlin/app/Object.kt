package app

import data.Person

fun main() {
    val abu = Person()
    abu.firstName = "Abu"

    val aziz = Person()
    aziz.firstName = "Aziz"

    val sakura = Person()
    sakura.firstName = "Sakura"

    println(abu.firstName)
    println(aziz.firstName)
    println(sakura.firstName)
}