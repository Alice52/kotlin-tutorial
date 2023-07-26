package se.syntax.func

/**
 * 函数作为变量
 */
class _FuncVar {

    fun sum(a: Int, b: Int): Int = a + b

    // 1.函数变量
    var funcType1: (Int, Int) -> Int = this::sum
    var funcType2: (Int, Int) -> Int = ::sum
    // funcType = { 实现(可以是labmbda) }
}


fun main() {
    // 2.定义函数类型
    var funcType: (Int, Int) -> Int

    // 函数赋值
    val func = _FuncVar();
    funcType = func::sum

    // 函数调用1
    println("sum value: ${func.funcType1(1, 2)}")
    // 函数调用2
    println("sum value: ${funcType(1, 2)}")

}