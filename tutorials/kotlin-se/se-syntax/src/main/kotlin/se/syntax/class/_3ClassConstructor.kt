package se.syntax.`class`

class _3ClassConstructor(var age: Int?) {

    var name: String = ""

    // 1. 必须调用括号内的构造函数
    constructor(name: String) : this(null) {
        this.name = name
    }

    constructor(name: String, age: Int) : this(age) {
        this.name = name
    }
}


fun main() {
    val obj1 = _3ClassConstructor(18)
    val obj2 = _3ClassConstructor("zack")
    val obj3 = _3ClassConstructor("zack", 18)
}
/*
public _3ClassConstructor(@Nullable Integer age) {
  this.age = age;
  this.name = "";
}

public _3ClassConstructor(@NotNull String name) {
  Intrinsics.checkNotNullParameter(name, "name");
  this((Integer)null);
  this.name = name;
}

public _3ClassConstructor(@NotNull String name, int age) {
  Intrinsics.checkNotNullParameter(name, "name");
  this(age);
  this.name = name;
}
 */