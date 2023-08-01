package se.syntax.func

import java.io.File

class _Builtin {}

fun main() {
    var name: String? = "zack"

    // 1.let
    val length: Int? = name?.let { it.length }
    // 2.also
    val also: String? = name?.also { println("${it.length}") }
    // 3.apply
    val apply: String? = name?.apply { println(length) }?.apply { println(capitalize()) }

    // 4.run
    val runLength: Int = "zack".run {
        this.length
    }.run {
        plus(2)
    }
    runLength.run(::println)  //6

    // 5.takeIf
    val takeIf: String? = "zack".takeIf { it.equals("zack") } // zack
    val takeIf1: String? = "zack".takeIf { it.equals("zaaaaack") } // null
    val takeIf2: String? = null.takeIf { it.equals("zack") } // null

    // apply sample
    val file = File(".\\_Builtin.kt")
    file.apply { setExecutable(true) }.apply { setReadable(true) }.apply { println(readLines()) }

}