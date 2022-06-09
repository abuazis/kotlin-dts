package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Abu")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Rudiger")
    baseDelegate.sayGoodBye("Antonio")
}