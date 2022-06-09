fun main() {
    var array = arrayOf("Abu", "Toyib", "Aziz")
    var total = 0

    for (name in array) {
        println(name)
        total++
    }

    println("Total perulangan = $total")

    val ukuranArray = array.size - 1

    for (i in 0..ukuranArray) {
        println("Index $i = ${array.get(i)}")
    }
}