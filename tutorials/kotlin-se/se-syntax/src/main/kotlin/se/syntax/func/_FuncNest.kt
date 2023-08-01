package se.syntax.func

class _FuncNest {
    fun sum(a: Int, b: Int): Int {
        fun sumInner1(a: Int, b: Int) = a + b
        val sumInner2: (Int, Int) -> Int = { x, y -> x + y }
        fun sumInner(a: Int, b: Int): Int {
            return a + b
        }

        return sumInner(a, b)
    }
}

fun main() {
    val sumNest = _FuncNest().sum(4, 5);
    println("sumNest: $sumNest")
}

