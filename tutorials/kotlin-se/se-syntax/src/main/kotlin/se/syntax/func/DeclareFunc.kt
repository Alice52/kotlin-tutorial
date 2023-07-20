package se.syntax.func


fun sum(a: Int, b: Int): Int {
    return a + b
}

// 2.等价于
fun sum2(a: Int, b: Int): Int = a + b
fun sum3(a: Int, b: Int) = a + b


fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum2(a: Int, b: Int) = println("sum of $a and $b is ${a + b}")

fun main() {
    println(sum(1, 2))
    println(sum2(1, 2))
    println(sum3(1, 2))
}