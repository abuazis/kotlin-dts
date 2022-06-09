package data

import annotations.NotBlank

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Int
)

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String
)