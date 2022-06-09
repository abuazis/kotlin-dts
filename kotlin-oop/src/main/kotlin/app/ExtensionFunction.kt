package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student: Student = Student("Abu", 15)
    student.sayHello("Todd")
    println(student?.upperName)
}