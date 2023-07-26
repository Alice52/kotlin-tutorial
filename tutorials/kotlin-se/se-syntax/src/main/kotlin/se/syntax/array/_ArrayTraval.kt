package se.syntax.array

class _ArrayTraval

fun main() {
    val arrByte = intArrayOf(1, 2, 3, 4, 5)

    // 1.for-in 循环遍历数组
    for (item in arrByte) {
        println(item)
    }

    // 2.使用数组索引遍历
    for (index in arrByte.indices) {
        println(arrByte[index])
    }

    // 3.同时访问数组的索引和元素
    for ((index, value) in arrByte.withIndex()) {
        println("index: $index, value: $value, ")
    }
}