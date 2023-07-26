package se.syntax.flow

class _Range

fun main() {
    var number: Int = 1

    if (number in 1..60) {
        println("不合格")
    } else {
        println("合格")
    }


}
