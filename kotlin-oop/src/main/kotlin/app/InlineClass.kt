package app

import data.Token

fun main() {
    val token = Token("secret")
    println(token.value)
    println(token.toUpper())
}