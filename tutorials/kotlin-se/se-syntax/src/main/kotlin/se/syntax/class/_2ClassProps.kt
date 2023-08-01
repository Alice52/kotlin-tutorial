package se.syntax.`class`

class _2ClassProps() {

    val number: Int = 0 // 成员属性 + 防止竞态条件
    val number2: Int // 计算属性
        get() = (0..1000).shuffled().first()
}


fun main() {
    val obj = _2ClassProps()
    val number = obj.number
    val number2 = obj.number2

    println("number: $number, number2: $number2")
}/*
public final class _2ClassProps {
    private final int number;

    public final int getNumber() {
        return this.number;
    }

    public final int setNumber(int number) {
        this.number = number;
    }

    public final int getNumber2() {
        byte var1 = 0;
        return ((Number)CollectionsKt.first(CollectionsKt.shuffled((Iterable)(new IntRange(var1, 1000))))).intValue();
    }
}
 */