package se.syntax.`class`

class _6ClassInherit


open class Person(open var name: String, var age: Int)
class Student(override var name: String, private var school: String) : Person(name, 18)


fun main() {
    val person: Person = Student("zack", "nt")
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