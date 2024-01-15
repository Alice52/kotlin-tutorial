package se.syntax.func

class Practice

/**
 *   1. private/open 等表示可见范围和是否 final
 *   2. inline(不要在class内) | infix | tailrec: 内联 | 中缀 | 尾递归
 *   3. fun <I, O>: 泛型
 *   4. I.mApply(): 对 I 类型扩展出 mApply() 函数
 *   5. T.() -> O | (T) -> R: 匿名函数内持有 this | 匿名函数内持有 it
 *   6. return this 可以进行链式调用
 */
inline fun <I, O> I.mApply(lambda: I.(String) -> O): I {
    lambda("hh") // 会在 I 内部执行, 且可以获取到 this

    return this
}

class Context {
    val name = "zack"
    fun tip(str: String) {
        println(str)
    }
}

infix fun Context.apply(lambda: Context.(String) -> Unit): Context {
    lambda(name)
    return this
}

fun main() {
    // 1. 定义复杂函数
    "zack".mApply { println(this.capitalize() /*"zack".capitalize()*/) } // I:String, O:Unit
        .mApply { this.capitalize() } // I:String, O:String
        .mApply { println(it) }  // I:String, O:Unit and hh

    // 2.测试 Context 相关
    Context().apply {
        println(this.name) // zack
    }.apply {
        tip("second") // second
    }.apply {
        tip(name) // zack
    }.apply {
        tip(it) // --> name (zack)
    }.apply({ it -> tip(it) }) // 传入函数, 且该函数的第一个桉树被当作调用tip的参数, 具体参数有 line-27 决定的
}
