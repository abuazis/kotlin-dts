package data

import kotlin.properties.Delegates

class Account(description: String = "") {
    val name: String by lazy {
        println("Name is called")
        "Abu"
    }

    var description: String by Delegates.observable(description) {
        property, oldValue, newValue ->
        println("$property is changed from $oldValue to $newValue")
    }
}