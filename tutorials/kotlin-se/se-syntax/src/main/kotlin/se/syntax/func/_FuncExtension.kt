package se.syntax.func

// 扩展函数不能定义在class|object内: 不能是成员函数
class _FuncExtension {}

infix fun Int.tos(x: Int): Int {
    return x
}

infix fun Int.shls(x: Int): Int {
    return x
}

// 对任意对象扩展了 ops 方法, 其返回值为 list
fun Any.ops(): List<String> = listOf("as")

// 对 String对象扩展了 todo 方法(报错)
fun String.todo(): Unit {
    TODO()
}

fun main() {

    val tos = 1.tos(2)
    val shl1 = 1.shls(2); //
    val shl2 = 1 shl 2

}
