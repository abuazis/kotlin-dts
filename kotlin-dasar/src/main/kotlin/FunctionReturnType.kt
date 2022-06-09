fun main() {
    println(jumlahkan(10, 10))
    println(jumlahkan(10, 20))

    val result = jumlahkan(200, 200)
    println(result)

    println(bagi(100, 10))
}

fun jumlahkan(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int {
    return if (b == 0) {
        0
    } else {
        val result = a / b
        result
    }
}