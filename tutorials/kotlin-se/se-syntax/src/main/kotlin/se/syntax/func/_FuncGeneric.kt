package se.syntax.func

import java.util.*

class _FuncGeneric {
    fun <T> asList(vararg ts: T): List<T> {
        val result = ArrayList<T>()
        for (t in ts) // ts is an Array
            result.add(t)
        return result
    }
}

fun main() {
    val list = Arrays.asList(1, "2", 3)
}