package app

import data.ExecutiveCustomer
import data.PremiumConstructor

fun main() {
    val premiumConstructor = PremiumConstructor("Abu")
    println(premiumConstructor.name)

    val executiveCustomer = ExecutiveCustomer("Abu", 100000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}