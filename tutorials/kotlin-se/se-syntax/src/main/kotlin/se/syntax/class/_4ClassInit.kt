package se.syntax.`class`

class _4ClassInit(var age: Int?) {

    val age2 = age // 此时如果在 init 后面则 age2 不可见: init 和类成员同时顺序生成

    init { // 相关代码会补充金 构造函数 最后
        val age3 = age2
        println(age3)
    }
}


fun main() {

}

/*

public final class _4ClassInit {
   @Nullable private final Integer age2;
   @Nullable private Integer age;

   @Nullable
   public final Integer getAge2() {
      return this.age2;
   }

   @Nullable
   public final Integer getAge() {
      return this.age;
   }

   public final void setAge(@Nullable Integer var1) {
      this.age = var1;
   }

   public _4ClassInit(@Nullable Integer age) {
      this.age = age;
      this.age2 = this.age;
      Integer var2 = this.age2;
      // init code
      Integer age3 = this.age2;
      System.out.println(age3);
   }
}
 */