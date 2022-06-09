fun main() {

    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    display(10)

    tailrec fun factorialRecursiveValue(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialRecursiveValue(value - 1, total * value)
        }
    }

    println(factorialRecursiveValue(10))
}