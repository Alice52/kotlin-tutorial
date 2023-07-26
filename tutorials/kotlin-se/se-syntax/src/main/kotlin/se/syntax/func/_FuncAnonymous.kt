package se.syntax.func

class _FuncAnonymous {

    // 具名函数: 详见 _FuncDefine
    var func: () -> Int = { 2 }
}

fun main() {
    val count = "Derry".count()

    "Derry".count() { x ->
        x == 'r'
    }
    "Derry".count { x ->
        x == 'r'
    }
    "Derry".count {
        it == 'r'
    }
}