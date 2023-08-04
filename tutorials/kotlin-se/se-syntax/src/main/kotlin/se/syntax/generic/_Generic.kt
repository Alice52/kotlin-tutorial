package se.syntax.generic

class _Generic

open class Person(open var name: String, var age: Int)
data class Student(override var name: String, val school: String) : Person(name, 18)

class Human<T : Person>(private val input: T, val isR: Boolean = true) {
    fun getObj() = input.takeIf { isR }
}

class Box<T>(private val item: T) {
    fun getItem(): T {
        return item
    }
}

fun main() {
    val person = Person("zack", 18)
    val student = Student("zack", "nt")

    // 1. 基本使用
    val human1: Human<Person> = Human<Person>(student)
    val human2: Human<Person> = Human<Person>(person)
    val human3: Human<Student> = Human<Student>(student)

    // 2. nullable
    Box("Hello") // ok
    Box<String>("Hello") // ok
    Box<String?>("World") // ok
    Box<String?>(null) // ok
    // Box<String>(null) // error
    Box(null) // ok
}


