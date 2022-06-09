package app

import data.User

fun main() {

    val user1 = User("abuza", "rahasia")
    val user2 = User("joko", "rahasia")

    user1.username = "budi"
    user2.username = "sangatrahasia"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)

}