fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }

    val upper = fun(value: String): String {
        return if (value == "") {
            "UPS"
        } else {
            value.uppercase()
        }
    }

    println(hello("Abu", upper))

    println(hello("Abu", fun(value: String): String {
        return if (value == "") {
            "UPS"
        } else {
            value.lowercase()
        }
    }))
}