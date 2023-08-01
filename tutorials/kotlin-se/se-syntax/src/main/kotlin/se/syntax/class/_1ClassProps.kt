package se.syntax.`class`

class _1ClassProps(var age: Int) {

    var name: String = "" // 默认就会有 setter/getter
        get() = field + "za"  // overwrite
    // set  overwrite

    override fun toString(): String {
        return "name: $name, age: $age" // $name will call method of getName()
    }
}


fun main() {
    val obj = _1ClassProps(18)

    obj.name = "zack"
    val age = obj.age

    println(obj) // name: zackza, age: 18
}/*
public final class _1ClassProps {
   @NotNull
   private String name;
   private int age;

   @NotNull
   public final String getName() {
      return this.name + "za";
   }

   public final void setName(@NotNull String var1) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.name = var1;
   }

   public final int getAge() {
      return this.age;
   }

   public final void setAge(int var1) {
      this.age = var1;
   }

   public _1ClassProps(int age) {
      this.age = age;
      this.name = "";
   }
}
 */