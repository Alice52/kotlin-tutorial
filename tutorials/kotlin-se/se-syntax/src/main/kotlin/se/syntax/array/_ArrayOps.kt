package se.syntax.array

class _ArrayOps {
    var arr0 = intArrayOf(1, 2, 3, 4, 5) // [1, 2, 3, 4, 5]

}

fun main() {
    val obj = _ArrayOps()

    // 1. read ops
    val indexValue = obj.arr0[1]
    val getValue = obj.arr0.get(1)

    val elementAt = obj.arr0.elementAt(0) // 1
    val elementAtOrElse = obj.arr0.elementAtOrElse(9) { -1 } // -1
    val elementAtOrNull = obj.arr0.elementAtOrNull(9) // null


    // 2. write ops
    obj.arr0[1] = 7
    obj.arr0.set(1, 7)
}