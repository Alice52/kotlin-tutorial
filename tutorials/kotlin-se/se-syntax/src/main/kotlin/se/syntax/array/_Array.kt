package se.syntax.array

class _Array {

    // 不能存 null 元素
    var arr0: IntArray = intArrayOf(1, 2, 3, 4, 5) // [1, 2, 3, 4, 5]
    // Int? ==> Integer
    var arr1: Array<Int?> = arrayOf(1, 2, null, 4, 5) // [1, 2, 3, 4, 5]
    var arr2: Array<Int?> = arrayOfNulls<Int>(5) // [null, null, null, null, null]
    var arr3: Array<Int> = Array(5) { 0 } // [0, 0, 0, 0, 0]
    var arr4 = IntArray(5) { i -> i * 2 } // [0, 2, 4, 6, 8]
}

fun fun3(data: Array<Int>, fn: (Int) -> Int): IntArray {
    var temp = IntArray(data.size)
    for (i in data.indices) {
        temp[i] = fn(data.get(i))
    }
    return temp
}
fun main() {
    val array = _Array()
    println("arr0: ${array.arr0.toList()}")
    println("arr0: ${array.arr1.toList()}")
    println("arr0: ${array.arr2.toList()}")
    println("arr0: ${array.arr3.toList()}")
    println("arr0: ${array.arr4.toList()}")
}