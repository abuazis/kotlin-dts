package main

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
//    launch {
//        delay(1000L)
//        println("Couroutines!")
//    }
//    println("Hello,")
//    delay(2000L)

    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")
}

suspend fun getCapital(): Int {
    delay(3000L)
    return 5000
}

suspend fun getIncome(): Int {
    delay(3000L)
    return 7500
}