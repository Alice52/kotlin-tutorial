package se.syntax.others

class _Other {}


fun main() {
    var name: String? = "zack"
    name = null

    // 1. ?.
    val age: Int = 12
    val length: Int? = name?.length
    println("length: $length")

    // 2. !! 如果百分百不会为null 则可以使用 !! 将其转换为为空类型
    name = "zack"
    val name2: String = name!!
    var length2 = name2.length

    // 3. ?: 空合并操作(default value)
    name = null ?: "zack2"
    println("name: $name")  // name: zack2

    // 4. 解构赋值
    val split: List<String> = "zack,tim".split(",")
    val (zack, tim) = split
    println("zack: $zack, tim: $tim")
}

