package se.syntax.func

class _FuncInfix {
    infix fun add(s: String) { /*...*/
    }

    fun test() {
        this add "abc"   // Correct
        add("abc")       // Correct
        // add "abc"        // Incorrect: the receiver must be specified
    }
}

fun main() {
    val func = _FuncInfix()
    func.add("zack")
    func add "zack"
}