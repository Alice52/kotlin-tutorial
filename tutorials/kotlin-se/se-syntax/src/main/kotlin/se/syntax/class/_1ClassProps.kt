package se.syntax.`class`

class _1ClassProps(val age: Int) {

    // 1. lazy load or init
    lateinit var lazyProp: String
    val dbConn: String by lazy { "zack" }

    // 2. member prop
    var name: String = "" // 默认就会有 setter/getter
        get() = field + "za"  // overwrite
        private set  // overwrite

    // 3. 没有getter/setter
    private val school: String = ""


    // for log
    override fun toString(): String {
        return "name: $name, age: $age" // $name will call method of getName()
    }
}


fun main() {
    val obj = _1ClassProps(18)

    // obj.name = "zack" // will compile error
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

   private final void setName(@NotNull String var1) {
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

   @NotNull
   public String toString() {
      return "name: " + this.getName() + ", age: " + this.age;
   }
}
 */