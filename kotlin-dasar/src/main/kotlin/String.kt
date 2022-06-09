fun main() {
    val firstName: String = "Abu"
    val lastName: String = "Aziz"

    // Multiline string
    val address: String = """
        >Jalan belum jadi, RT 01 RW 01,
        >Kabupaten Subang,
        >Jawa Barat,
        >Indonesia
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)

    // String template
    val fullName: String = "$firstName $lastName"
    println(fullName)

    val desc: String = "total $fullName char = ${fullName.length}"
    println(desc)
}