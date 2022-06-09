package main

import kotlinx.coroutines.*

@OptIn(InternalCoroutinesApi::class)
fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(5000L)
        println("Start new job!")
    }

    // job.start()
    // job.join()

    // println("Other task")

    delay(2000)

    job.cancel(cause = CancellationException("time is up!"))

    println("Cancelling job...")

    if (job.isCancelled){
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}