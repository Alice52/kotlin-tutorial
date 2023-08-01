package se.syntax.string

class _String

fun main() {
    // 1. 定义
    val str: String = "abcd 123"

    // 2. 转义字符串
    val s = "Hello, world!\n"

    // 3. Raw string
    val text = """
      name: zack
      age: 18
      """

    // 4. String templates
    val abc = "abc"
    println("$abc.length is ${abc.length}")  // "abc.length is 3"
    println("login status: ${if (abc === "abc") true else false}")  // login status: true

    // 5. 遍历
    for (c in str) {
        println(c)
    }

    // 6. replace + lambda: 将a和k替换成aa和ka
    val replace = "zack".replace(Regex("[ak]")) {
        it.value + 'a'
    }
    println("replace: $replace") // zaacka
}