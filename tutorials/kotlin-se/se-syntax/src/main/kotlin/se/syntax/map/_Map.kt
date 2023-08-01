package se.syntax.map

class _Map {}

/**
 * @see _Array.class
 */
fun main() {

    // 1.创建: 数组转换为map @see _Array.kt (associate)
    val mapOf1 = mapOf<String, Int>(Pair("zack", 18), Pair("tim", 19)) // LinkedHashMap
    val mapOf2 = mapOf(
        "zack" to (18), "tim" to (19)
    )// tuple

    val mutableMapOf1 = mutableMapOf<String, Int>(Pair("zack", 18))
    val mutableMapOf2 = mutableMapOf<String, Int>("tim" to (19))

    val toMutableSet = mapOf1.toMutableMap()

    //2.取值: [] 没有则返回 null
    val age: Int? = mapOf2["zack"]
    val getAge: Int? = mapOf2.get("zack")
    // val value: Int = mapOf2.getValue("zaccc") // will panic

    val orDefault: Int = mapOf2.getOrDefault("zackq", -1)
    val orElse = mapOf2.getOrElse("zzz") { -1 }

    // 3. 修改
    mutableMapOf1 += "tim" to (2)
    mutableMapOf1["zack"] = 17
    mutableMapOf1.put("alice", 89)
    mutableMapOf1.getOrPut("fff") { -1 }

    // 4.travel
    for ((key, value) in mutableMapOf1) {
        println("$key -> $value")
    }

    for (entry in mutableMapOf1.entries) {
        val key: String = entry.component1()
        val value: Int = entry.component2()
    }
}