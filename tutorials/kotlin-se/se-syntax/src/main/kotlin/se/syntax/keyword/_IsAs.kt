package se.syntax.keyword

import se.syntax.`class`.Person
import se.syntax.`class`.Student

class _IsAs {
}

fun main() {
    val person: Person = Student("zack", "nt")

    println("person is Student: ${person is Student}")

    if (person is Student) {
        val student = person as Student
    }
}