package se.syntax.`class`

class _9Inner {

    companion object {
        open val outFiledStatic: String = "";
    }

    open val outFiled: String = "";
    fun asd() {
        println("outFiled: $outFiled")
    }


    // 1. 内部类: 可以使用外部类的所有属性
    inner class Inner {

        open val innerFiled: String = "";

        fun asd() {
            println("outFiled: $outFiled, and innerFiled: $innerFiled, and outFiledStatic: $outFiledStatic")
        }
    }

    // 2. 嵌套类: 不能使用外部类的非静态属性
    class Nest {

        open val innerFiled: String = "";

        fun asd() {
            println("innerFiled: $innerFiled, and outFiledStatic: $outFiledStatic")
        }
    }

}