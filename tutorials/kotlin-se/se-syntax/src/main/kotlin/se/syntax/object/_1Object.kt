package se.syntax.`object`

class _1Object {
    object MySingleton {
        // 单例对象的属性和方法
        var count: Int

        init {  // 会转移到构造函数中
            count = 0
        }

        fun increment() {
            count++
        }
    }
}