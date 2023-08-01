package se.syntax.func

class Practice

/**
 *   1. private/open 等表示可见范围和是否 final
 *   2. inline | infix | tailrec: 内联 | 中缀 | 尾递归
 *   3. fun <I, O>: 泛型
 *   4. I.mApply(): 对 I 类型扩展出 mApply() 函数
 *   5. T.() -> O | (T) -> R: 匿名函数内持有 this | 匿名函数内持有 it
 *   6. return this 可以进行链式调用
 */
inline fun <I, O> I.mApply(lambda: I.(String) -> O): I {
    lambda("hh") // 会在 I 内部执行, 且可以获取到 this

    return this
}

fun main() {
    "zack"
        .mApply { println(this.capitalize() /*"zack".capitalize()*/) } // I:String, O:Unit
        .mApply { this.capitalize() } // I:String, O:String
        .mApply { println(it) }  // I:String, O:Unit and hh
}