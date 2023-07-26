package se.syntax.array

class _ArrayOps {
    var arr0 = intArrayOf(1, 2, 3, 4, 5) // [1, 2, 3, 4, 5]

}

fun main() {
    val obj = _ArrayOps()

    // 1. read ops
    val indexValue = obj.arr0[1]
    val getValue = obj.arr0.get(1)

    // 2. write ops
    obj.arr0[1] = 7
    obj.arr0.set(1, 7)
}