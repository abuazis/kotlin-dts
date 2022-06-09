package app

import data.SuperTeacher

fun main() {
    val teacher = SuperTeacher("Abu")
    println(teacher.name)
    // teacher.teach() // error
    teacher.test()
}