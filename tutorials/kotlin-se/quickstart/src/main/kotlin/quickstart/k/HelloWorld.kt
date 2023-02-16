package quickstart.j

import java.util.Arrays.asList
import java.util.concurrent.ConcurrentHashMap

object DbConstants {
    const val TABLE_USER_ATTRIBUTE_EMPID = "_id"
    const val TABLE_USER_ATTRIBUTE_DATA = "data"
}

class DbConstants2() {
    companion object {
        val TABLE_USER_ATTRIBUTE_EMPID = "_id"
        val TABLE_USER_ATTRIBUTE_DATA = "data"
    }
}


fun main(args: Array<String>) {
    println("Hello World")

    val i: Char = '5'
    val i1: Int = 156
    val aaa = arrayOf(1, 2, 3)
    val list = asList(-1, 0, *aaa, 4)
    list.forEach { x -> println(x)}


    print(i1)

    // [1, 2]
    val arrayOf: Array<Int> = arrayOf(1, 2)
    // [1, 2]
    val a: IntArray = intArrayOf(1, 2)


    // [null, null, null, null, null]
    val arrayOfNulls: Array<Int?> = arrayOfNulls<Int>(5)

    // ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }

    val books: ConcurrentHashMap<String, Int> = ConcurrentHashMap()
}