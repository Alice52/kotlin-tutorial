package se.syntax.`class`

interface _8Interface {
    var name: String

    fun onCall()
}

class _8InterfaceImpl : _8Interface {
    override var name: String = "zack"

    override fun onCall() {
        println("zack")
    }
}

fun main() {
    // 1. 接口实现
    val value1: _8Interface = object : _8Interface {
        override var name: String = "zack"

        override fun onCall() {
            println("zack")
        }
    }

    // 2. 函数接口实现
    val runnable2 = Runnable() {
        println("zack")
    }
}
/*
public interface _8Interface {
   @NotNull String getName();
   void setName(@NotNull String var1);
   void onCall();
}

@Getter @Setter
public final class _8InterfaceImpl implements _8Interface {
   @NotNull private String name = "zack";

   public void onCall() {
      String var1 = "zack";
      System.out.println(var1);
   }
}

@Getter @Setter
public static final void main() {
  _8Interface value1 = (_8Interface)(new _8Interface() {
     @NotNull private String name = "zack";
     public void onCall() {
        String var1 = "zack";
        System.out.println(var1);
     }
  });
  Runnable runnable2 = (Runnable)null.INSTANCE;
}
 */