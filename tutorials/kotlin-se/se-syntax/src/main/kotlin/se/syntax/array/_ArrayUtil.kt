package se.syntax.array

class _ArrayUtil

fun main() {

    val array = arrayOf(1, 2)
    // 1.数组打印内容
    println(array.contentToString())

    // 2.数组转换列表
    array.asList()

    //3.获取数值型数组的平均值
    val average = array.average()

    // 4.获取数组的最大值和最小值
    val max = array.max()
    val min = array.minOrNull()

    // 5.是否包含
    val result = array.contains(1)

    //6.去重
    val unique = array.distinct()

    // 7.复制数组: 长度为4, 超出的部分填充 null
    val copy = array.copyOf(4)

    // 8.对原数组排序
    array.sort()

    // 9.获取元素在数组中的索引
    val index = array.indexOf(1)

    // 10.转换 map
    val map1: Map<String, Int> = array.associate { Pair("key$it", it) } // {key1=1, key2=2}
    val map2: Map<String, Int> = array.associateTo(hashMapOf()) { Pair("key$it", it) } // {key1=1, key2=2}
    val map3 = array.associateBy { "key$it" } // {key1=1, key2=2}
    val map4 = array.associateByTo(hashMapOf()) { "key$it" } // {key1=1, key2=2}
}