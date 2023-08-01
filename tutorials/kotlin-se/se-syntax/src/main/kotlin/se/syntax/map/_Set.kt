package se.syntax.map

class _Set {}

fun main() {
    // 1.创建
    val setOf = setOf<String>("zack", "zack", "tom") // LinkedHashSet
    val mutableSetOf = mutableSetOf<String>("zack", "zack")
    val toMutableSet = setOf.toMutableSet()

    //2.取值
    val elementAt = setOf.elementAt(0) // zack
    val elementAtOrElse: String = setOf.elementAtOrElse(3) {
        "tim"
    } // tim
    val elementAtOrNull = setOf.elementAtOrNull(4) // null

    // 3.修改
    mutableSetOf += "tim"
    val add: Boolean = mutableSetOf.add("tim")
}


