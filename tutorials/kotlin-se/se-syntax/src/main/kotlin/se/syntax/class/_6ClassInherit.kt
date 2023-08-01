package se.syntax.`class`

class _6ClassInherit


open class Person(open var name: String, var age: Int)
class Student(override var name: String, private var school: String) : Person(name, 18) {
    // 1.生成的 tostring 和 hash 等只管主构造函数
    override fun toString(): String {
        return "Student(name='$name', school='$school')"
    }

    // 2.定义解构赋值: 必须是1开始
    operator fun component1() = school
    operator fun component2() = age
    operator fun component3() = age
}


fun main() {
    val person: Person = Student("zack", "nt")

    val (name, _, age) = person as Student

    println()
}/*
@Getter @Setter @AllArgConstrutor
public class Person {
   @NotNull
   private String name;
   private int age;
}

@Getter @Setter
public final class Student extends Person {
   @NotNull
   private String name;
   private String school;

   public Student(@NotNull String name, @NotNull String school) {
      super(name, 18);
      this.name = name;
      this.school = school;
   }
}
 */