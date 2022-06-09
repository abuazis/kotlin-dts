package app

import annotations.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException

fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.members

    // iterate satu satu, lalu cek kalo ada annotation @NotBlank
    for (property in properties) {
        if (property.annotations.contains(NotBlank())) {
            when (val value = property.call(request)) {
                is String -> {
                    if ("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validateRequest(request)

    val request2 = CreateCategoryRequest("F", "Food")
    validateRequest(request2)
}