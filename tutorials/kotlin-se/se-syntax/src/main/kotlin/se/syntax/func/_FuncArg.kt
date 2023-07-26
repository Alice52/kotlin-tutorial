package se.syntax.func

/**
 * 函数作为参数
 */
class _FuncArg {

    // 1.函数参数可以有默认值
    fun read(b: ByteArray, len: Int = b.size) {}

    // 2.具名函数参数
    fun sendMessage(to: String, message: String, priority: Int = 1) {}

    // 3.函数可以做参数: 并且在最后一位可以变成方法体
    fun foo(
        bar: Int = 0,
        baz: Int = 1,
        qux: () -> Unit,
    ) { /*...*/
    }
}


fun main() {
    val func = _FuncArg()

    // 2.调用
    func.sendMessage(/*priority = 3,*/ message = "Hello", to = "John")


    // 3.最后一位可以变成方法体
    var funcVar: () -> Unit = { println("hello") }
    func.foo(1, 2, funcVar)
    func.foo(1, 2, { println("hello") })
    func.foo(1) { println("hello") }     // Uses the default value baz = 1
    func.foo(qux = { println("hello") }) // Uses both default values bar = 0 and baz = 1
    func.foo { println("hello") }        // Uses both default values bar = 0 and baz = 1
}