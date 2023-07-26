package se.syntax.variables

class Variable {

    val str1: String = "zack"     // private final String str1 = "zack";
    var str2: String = "zack"     // private String str2 = "zack";

    public fun String.log(vararg args: String) { // final void log(@NotNull String this, @NotNull String... args)
        if (args.size % 2 > 0) {
        }

        buryPoint(this, args)
        //注意这里: 可变参数在作为数组传递时需要使用伸展（spread）操作符（在数组前面加 *）
        buryPoint2(this, *args) // this.buryPoint2(args, (String[])Arrays.copyOf(args, args.length));
    }


}

fun String.log(vararg args: String) { // final void log(@NotNull String this, @NotNull String... args)
    if (args.size % 2 > 0) {
    }

    buryPoint(this, args)
    //注意这里: 可变参数在作为数组传递时需要使用伸展（spread）操作符（在数组前面加 *）
    buryPoint2(this, *args) // this.buryPoint2(args, (String[])Arrays.copyOf(args, args.length));
}

fun buryPoint2(s: String, vararg args: String) { // final void buryPoint2(String s, String... args)
    println("$s + ${args.asList()}")
}

fun buryPoint(s: String, args: Array<out String>) { // final void buryPoint(String s, String[] args)
    println("$s + ${args.asList()}")
}

fun main() {
    "str".log(*arrayOf("zas"))
    "str".log("a", "b", "c")
}