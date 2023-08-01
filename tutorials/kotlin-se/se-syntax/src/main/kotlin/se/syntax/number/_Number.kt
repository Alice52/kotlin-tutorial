package se.syntax.number

class _Number {
}

fun main() {

    // 1. string convert to number
    val age: Int = "18".toInt()
    val age2: Int? = "18.3".toIntOrNull() // val age2: Int = "18.3".toInt() // panic
    println("age: $age, age2: $age2")
}