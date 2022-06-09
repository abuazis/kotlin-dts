package app

import data.City
import data.Country

fun main() {
    val city = City("Tokyo")
    val country = Country("Japan")

    println(city.name)
    println(country.name)
}