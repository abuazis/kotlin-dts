package main

import kotlinx.coroutines.*

fun main() {
    runBlocking<Unit> {
        launch(Dispatchers.Unconfined) {
            println("Starting in ${Thread.currentThread().name}")

            delay(1000)

            println("Resuming in ${Thread.currentThread().name}")
        }.start()
    }

    // Single Thread Context
    runBlocking<Unit> {
        val dispatcher = newSingleThreadContext("myThread")

        launch(dispatcher) {
            println("Starting in ${Thread.currentThread().name}")

            delay(1000)

            println("Resuming in ${Thread.currentThread().name}")
        }.start()
    }

    // Thread Pool
    runBlocking<Unit> {
        val dispatcher = newFixedThreadPoolContext(3, "myPool")

        launch(dispatcher) {
            println("Starting in ${Thread.currentThread().name}")

            delay(1000)

            println("Resuming in ${Thread.currentThread().name}")
        }.start()
    }
}