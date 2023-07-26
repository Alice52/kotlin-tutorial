package se.syntax.keyword


class _Companion {
    // 翻译成单例: static final class DbConstants{}
    object DbConstants {
        const val TABLE_USER_ATTRIBUTE_EMPID: String = "_id"

        fun doOtherStuff() {
        }
    }

    // 翻译成Companion单例对象: static final class Companion {}
    companion object {
        // 翻译成父类下的常量
        const val TABLE_USER_ATTRIBUTE_DATA = "data"

        fun doSomeStuff() {
        }
    }
}

// region @JvmStatic
open class A {}

class JvmStaticClass : A {
    constructor(s: String) : this()
    constructor()

    companion object ZACK {
        @JvmStatic
        fun aStaticFuncation() {
        }
    }
}
// endregion


// region OOP
class MyRunnable : Runnable {
    override fun run() {
        TODO("Not yet implemented")
    }
}

class MyObject {
    companion object CUSTOMER : Runnable by MyRunnable()

}
// endregion


fun main() {
    _Companion.doSomeStuff()
    _Companion.Companion.TABLE_USER_ATTRIBUTE_DATA

    _Companion.DbConstants.TABLE_USER_ATTRIBUTE_EMPID
    _Companion.DbConstants.doOtherStuff()

    JvmStaticClass.aStaticFuncation()

//    MyObject.run()
}
