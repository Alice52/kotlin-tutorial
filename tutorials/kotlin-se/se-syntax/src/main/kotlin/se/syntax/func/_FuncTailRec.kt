package se.syntax.func

class _FuncTailRec {
    fun fibonacci(n: Int): Int {
        tailrec fun fibonacciInner(n: Int, prev: Int, next: Int): Int {
            if (n < 1) return next
            return fibonacciInner(n - 1, next, prev + next)
        }

        return fibonacciInner(n, 0, 1)
    }
}

fun main() {
    val fibonacci = _FuncTailRec().fibonacci(4);
    println("fibonacci: $fibonacci")
}

