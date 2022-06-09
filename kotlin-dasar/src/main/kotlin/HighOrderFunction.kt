fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }

    val lambdaUpper = { value: String -> value.lowercase() }
    println(hello("Abu", lambdaUpper))

    println(hello("Abu", { value: String -> value.lowercase() }))

    var result = hello("Abu") { value: String ->
        value.lowercase()
    }

}