fun main() {
    fullName(
        firstName = "Abu",
        lastName = "Al Aziz",
        middleName = "Toyib"
    )
}

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello $firstName $middleName $lastName")
}