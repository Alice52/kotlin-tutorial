package se.syntax.func

import java.util.Arrays.asList


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

fun sendMessage(to: String, message: String, priority: Int = 1) {}

fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: (bar: Int) -> Unit,
) { /*...*/
}

fun double(x: Int) = x * 2

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

infix fun Int.tos(x: Int): Int {
    return x
}

infix fun Int.shls(x: Int): Int {
    return x
}

class MyStringCollection {
    infix fun add(s: String) { /*...*/
    }

    fun build() {
        this add "abc"   // Correct
        add("abc")       // Correct
        //add "abc"        // Incorrect: the receiver must be specified
    }
}

fun fibonacci(n: Int): Int {
    tailrec fun fibonacciInner(n: Int, prev: Int, next: Int): Int {
        if (n < 1) return next
        return fibonacciInner(n - 1, next, prev + next)
    }

    return fibonacciInner(n, 0, 1)
}

fun main() {

    val fibonacci = fibonacci(4);
    val collection = MyStringCollection()
    collection.add("aaa")
    collection add "aaa"

    val shl = 1.shls(2); // 1 shl 2


    val list = asList(1, "2", 3)

    val double = double(2);

    foo(1) { println("hello") }     // Uses the default value baz = 1
    foo(qux = { println("hello") }) // Uses both default values bar = 0 and baz = 1
    foo { println("hello") }        // Uses both default values bar = 0 and baz = 1

    println(sum(1, 2))
    println(sum2(1, 2))
    println(sum3(1, 2))

    sendMessage(/*priority = 3,*/ message = "Hello", to = "John")
}
