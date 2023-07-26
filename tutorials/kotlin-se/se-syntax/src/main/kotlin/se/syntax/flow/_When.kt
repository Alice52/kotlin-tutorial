package se.syntax.flow

class _When

fun main() {
    val week = 2;

    val info = when (week) {
        1 -> "Monday"
        2 -> "Tuesday"
        else -> {
            println("unknown day")
        }
    }

    println(info)
}