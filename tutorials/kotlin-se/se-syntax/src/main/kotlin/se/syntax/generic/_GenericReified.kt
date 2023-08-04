package se.syntax.generic

class _GenericReified

inline fun <reified T> randomOrDefault(default: () -> T): T {
    val listOf: List<Person> = listOf(Person("zack", 18), Student("tim", "nt"))
    val first = listOf.shuffled().first()
    return first.takeIf { it is T } as T? ?: default()
}

fun main() {
    val randomOrDefault1: Person = randomOrDefault {
        Person("zack", 18)
    }

    val randomOrDefault2: Person = randomOrDefault {
        Student("zack", "nt")
    }
}


