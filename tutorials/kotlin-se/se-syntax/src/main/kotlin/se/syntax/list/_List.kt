package se.syntax.list

class _List {}

fun main() {
    // 1. 创建
    val listOf = listOf<String>("zack", "tom") // 不可变集合
    val mutableListOf = mutableListOf<String>("zack", "tom")// 可变集合
    val toMutableList = listOf.toMutableList()

    // 2.取值
    val indexedValue = listOf[0]
    val get: String = listOf.get(0) // zack
    val orElse: String = listOf.getOrElse(2) {
        it.toString() // 或者 "zack"
    } //"2"
    val orNull: String? = listOf.getOrNull(2) // null
    val orN: String = listOf.getOrNull(2) ?: "zack" // 等价于 orElse

    var (_, tom) = listOf

    // 3. 修改
    val add: Boolean = mutableListOf.add("zack")
    val remove: Boolean = mutableListOf.remove("zack") // remove first one
    mutableListOf += "zack" // mutator: 实现对+-的运算符重载
    println(mutableListOf)

    // 4.traverse
    for (v in listOf) {
        println(v)
    }

    listOf.forEach {
        println(it)
    }

    listOf.forEachIndexed { index, value ->
        println("index: $index, value: $value")
    }

    val iterator = listOf.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}