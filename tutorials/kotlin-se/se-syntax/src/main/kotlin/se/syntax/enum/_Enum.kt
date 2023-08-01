package se.syntax.enum

enum class _Enum(val seq: Int) {

    First(1), Second(2);

}

fun main() {
    println(_Enum.Second) // Second
    println(_Enum.Second is _Enum) // true
}