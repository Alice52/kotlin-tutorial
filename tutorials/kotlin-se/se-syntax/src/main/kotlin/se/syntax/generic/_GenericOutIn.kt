package se.syntax.generic

class _GenericOutIn

fun test(ps: MutableList<out Person>) {
    ps.forEach {
        println(it)
    }
}

class Out {
    interface Producer<out T> {
        fun produce(): T
    }

    class StringProducer : Producer<Person> {
        override fun produce(): Student {
            return Student("zack", "nt")
        }
    }
}

class In {
    interface Consumer<in T> {
        fun consume(item: T)
    }

    // 定义一个具体的消费者实现
    class AnyConsumer : Consumer<Person> { // class AnyConsumer : Consumer<? super Person> {
        override fun consume(item: Person) {
            item.age = 18
            println("Consuming: $item")
        }
    }
}

fun main() {
    val person = Person("zack", 18)
    val student = Student("zack", "nt")

    // 1.列表下的使用: java 中不行(典型错误)
    // List<? extends Person> persons = new ArrayList<Student>()
    var ps: MutableList<out Person> = mutableListOf<Student>()
    test(mutableListOf<Person>(student, person))

    // 2.out: 只能读取和返回 + 不能修改和做参数, 相等于 java 的 super
    val producer: Out.Producer<Person> = Out.StringProducer()
    val result: Person = producer.produce()

    // 3.in: 只能做参数(可被修改), 相等于 java 的 super
    val consumer1: In.Consumer<Student> = In.AnyConsumer()
    val a1: Unit = consumer1.consume(Student("zack", "nt")) // ok

    val consumer2: In.Consumer<Person> = In.AnyConsumer()
    val a2: Unit = consumer2.consume(Student("zack", "nt")) // ok
}


