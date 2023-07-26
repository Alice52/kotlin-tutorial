package se.syntax.func

class _FuncReturn {
    fun square(n: Int): Int {
        return n * n
    }

    @Deprecated(message = "use fun5")
    fun fun4(type: String): (Int) -> Int {
        when (type) {
            "square" -> return ::square
            else -> return { n ->
                n * n * n
            }
        }
    }

    fun fun5(type: String): (Int) -> Int {
        return if (type == "square") {
            ::square
        } else { n ->
            n * n * n
        }
    }
}

fun main() {
    val func = _FuncReturn()
    val returnFunc = func.fun5("square")
    val square = returnFunc(4)

    println("square: $square")
}