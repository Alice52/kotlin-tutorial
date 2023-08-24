package se.syntax.func.lambda

class _Function {
    val a = UndertowBuilderCustomizer { x ->
        x.addHttpListener(1, "0.0.0.0")
    }

}
// java
//UndertowBuilderCustomizer a = x -> {
//        x.addHttpListener(1, "0.0.0.0");
//    };

fun interface UndertowBuilderCustomizer {
    fun customize(builder: UnderBuilder)
}

interface UnderBuilder {
    fun addHttpListener(port: Int, ip: String)
}


