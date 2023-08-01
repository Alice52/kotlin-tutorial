package se.syntax.func

class _FuncDefine {

    // 1. 常规函数定义
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // 2.等价于
    fun sum2(a: Int, b: Int): Int = a + b
    fun sum3(a: Int, b: Int) = a + b


    // 3.定义初始化函数变量
    var funcVoid: () -> Unit = { println("hello") }
    var funcReturn: (x: String) -> String = { it }
    var funcReturn2 = { x: String -> x } // 推断函数声明为 (x: String) -> String
    var funcArgs: (x: String, y: String) -> String = { x, y -> x + y }

    // 4.特殊字符: 规避关键字等
    fun `123`() {}
}

fun main() {
    val func = _FuncDefine()
    println(func.sum(1, 2))
    println(func.sum2(1, 2))
    println(func.sum3(1, 2))
}