fun main() {
    // Byte, Short, Int, Long
    val age: Int = 200
    println(age)

    // Float, Double
    val sample: Float = 10.10F
    println(sample)

    // Binary, Hexadecimal, Decimal
    val binary: Int = 0b010101010
    println(binary)

    // Underscore
    val price: Long = 9_000_000_000L
    println(price)

    // .toInt, .toShort, .toByte, .toLong, .toFloat, .toDouble
    val priceInt: Int = price.toInt()
    println(priceInt)

    val doubleBinary: Double = binary.toDouble()
    println(doubleBinary)
}