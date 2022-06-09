package data

class Car(paramBrand: String, paramName: String, paramYear: Int) {

    init {
        println("Car $paramBrand Created")
    }

    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2020) {
        println("Secondary Contructor Initialized")
    }

    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Secondary Contructor 2 Initialized")
    }

    var brand: String = paramBrand
    var year: Int = paramYear
    var name: String = paramName
}