package generic

/*
    fun <T> run(): T {
        /*...*/
    }

    public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
        /*...*/
    }

    val numbers = (1..100).toList()
    print(numbers.slice<Int>(1..10))

    output : [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
*/