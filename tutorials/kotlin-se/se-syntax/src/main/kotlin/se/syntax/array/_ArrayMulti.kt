package se.syntax.array

class _ArrayMulti

fun main() {
    val multiArr = Array<IntArray>(3) { intArrayOf(1, 2) }
    multiArr.forEach { intArr ->
        println(intArr.contentToString())
        intArr.forEach {
            println(it)
        }
    }
}