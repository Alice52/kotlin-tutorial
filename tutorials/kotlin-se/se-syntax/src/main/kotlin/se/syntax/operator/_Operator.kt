package se.syntax.operator

class _Operator {}

data class Person(var name: String, var age: Int) {
    // 解构: data 默认有
    // operator fun component1() = name
    // operator fun component2() = age

    operator fun times(p: Person): Int = this.age + p.age
    operator fun plusAssign(p: Person) {
        this.age = this.age + p.age
    }

    operator fun unaryMinus(): Person = Person(name, -age)
    operator fun get(str: String): Any {
        return when (str) {
            "age" -> age
            "name" -> name
            else -> throw IndexOutOfBoundsException("Invalid prop $str")
        }
    }

    operator fun set(prop: String, value: Any) {
        when (prop) {
            "age" -> this.age = value as Int
            "name" -> this.name = value.toString()
            else -> throw IndexOutOfBoundsException("Invalid prop $prop")
        }
    }
}

// 2. 定义运算数类型不同的运算符
operator fun Person.times(scale: Double): Person {
    return Person(name, (age * scale).toInt())
}


fun main() {

    val zack = Person("zack", 18);
    // 1. 常见运算符重载
    val totalAge = zack * Person("tim", 12)
    println("totalAge: $totalAge") // 30

    // 2. 扩展运算符
    val newPerson = zack.times(10.0)
    println("newPerson: $newPerson") // newPerson: Person(name=zack, age=180)

    // 3. 复合运算符
    zack += Person("tim", 12)
    println("zack: $zack") // newPerson: Person(name=zack, age=30)


    // 4. 重载一元运算符: -
    println(-zack) // Person(name=zack, age=-30)

    // 5. 重载比较运算符: ==

    // 6. 下标运算符: []
    println(zack["age"]) // 30
    println(zack["name"]) // zack
    zack["name"] = "ZACK"
    zack["age"] = 18
    println(zack) // Person(name=ZACK, age=18)


    // 7.in: contains

    // 8.rangeTo
    // operator fun <T: Comparable<T>> T.rangeTo(that: T): ClosedRange<T>

    // 9.解构声明和组件函数
    var (name, age) = zack
}
