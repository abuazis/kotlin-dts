package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee: Employee = Employee("Abu")
    employee.sayHello("Budi")

    employee = Manager("Abu")
    employee.sayHello("Budi")

    employee = VicePresident("Abu")
    employee.sayHello("Budi")
}