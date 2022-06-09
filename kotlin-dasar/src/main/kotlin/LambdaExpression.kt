fun main() {

    val lambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = lambda("Abu", " Aziz")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Abu"))

    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Abu Aziz"))

}

fun toUpper(value: String): String = value.uppercase()