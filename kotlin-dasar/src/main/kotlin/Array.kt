fun main() {
    val names: Array<String> = arrayOf("Eko", "Joko", "Rudi")
    // names.set(0, "Abu")
    names[0] = "Abu"
    println(names[0])

    val score: Array<Int> = arrayOf(88, 6, 28)
    println(score[0])
    println(score[1])
    println(score[2])

    val members: Array<String?> = arrayOfNulls(10)
    members[0] = "Abu"
    members[1] = "Abu"
    members[2] = "Abu"
    members[3] = "Abu"
    members[4] = null

    println(members[0])
}