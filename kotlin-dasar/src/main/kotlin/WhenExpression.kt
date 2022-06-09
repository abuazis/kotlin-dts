fun main() {
    var nilai = 'C'

    when (nilai) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        else -> println("Try Again Next Year")
    }

    when (nilai) {
        'A', 'B', 'C' -> println("Selamat, Anda Lulus")
        else -> println("Maaf, Anda Tidak Lulus")
    }

    nilai = 'E'
    val nilaiLulus = arrayOf('A', 'B', 'C')

    when (nilai) {
        in nilaiLulus -> println("Selamat Anda Lulus")
        !in nilaiLulus -> println("Maaf, Tidak Lulus")
    }

    val name = "Abu"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name isn't String")
    }

    val nilaiUjian = 90
    when {
        nilaiUjian > 90 -> println("Amazin")
        nilaiUjian > 80 -> println("Amazin")
        nilaiUjian > 70 -> println("Amazin")
        else -> println("Ngulang tahun depan")
    }
}