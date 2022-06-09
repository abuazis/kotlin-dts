fun main() {

    var counter: Int = 0

    val lambdaIncerement: () -> Unit = {
        println("Lambda increment")
        counter++
    }

    val anonymousFunction = fun() {
        println("Anonymous Function increment")
        counter++
    }

    fun functionInrement() {
        println("Function increment")
        counter++
    }

    lambdaIncerement()
    anonymousFunction()
    functionInrement()
    lambdaIncerement()
    anonymousFunction()
    functionInrement()

    println(counter)

}