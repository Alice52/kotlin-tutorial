package se.syntax.`object`

import java.util.concurrent.TimeUnit

interface SomeCallback {
    fun onSuccess();
}

open class _2AnoObject {
    open fun print(info: String) = println(info)

    fun processData(callback: SomeCallback) {
        callback.onSuccess()
    }
}

fun main() {
    // 1. 匿名对象实现
    val obj: _2AnoObject = object : _2AnoObject() {
        override fun print(info: String) {
            super.print(info)
            println("zack")
        }
    }
    obj.print("zack")

    // 3. 参数
    obj.processData(object : SomeCallback {
        override fun onSuccess() {
            println("zack")
        }
    })

    // 2.匿名接口实现
    val runnable = object : Runnable {
        override fun run() {
            println("zack")
        }
    }
    runnable.run()

    val runnable2 = Runnable() {
        println("zack")
    }
    runnable2.run()

    TimeUnit.SECONDS.sleep(2)
}