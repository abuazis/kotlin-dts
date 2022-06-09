fun main() {
    val name = "Abu"

    println(name.hello())

    "Abu".printHello()
}

fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")