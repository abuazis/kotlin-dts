fun main() {
    for (i in 1..100) {
        println(hello ({ "Abu" }, {"Aziz"}))
    }
}

inline fun hello(firstName: () -> String, noinline lastname: () -> String): String {
    return "Hello ${firstName()} ${lastname()}"
}