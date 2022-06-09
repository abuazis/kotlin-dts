fun main() {
    fun factoriaLoop(value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }
    println(factoriaLoop(10))

    fun factorialRecursiveValue(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursiveValue(value - 1)
        }
    }
    println(factorialRecursiveValue(10))
}