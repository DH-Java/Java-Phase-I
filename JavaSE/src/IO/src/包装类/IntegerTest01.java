package IO.src.包装类;

/*
 * java中为8种基本数据类型又对应准备了8种包装类型。8种包装类型属于引用数据类型。父类是Object。
 *因为8种基本数据类型不够用
 * 8种基本数据类型对应的包装类型名是什么？
 * 基本数据类型                     包装类型
 *=======================================================
 * byte                                  java.lang.Byte(父类Number)
 * short                                 java.lang.Short(父类Number)
 * int                                   java.lang.Integer(父类Number)
 * long                                  java.lang.Long(父类Number)
 * float                                 java.lang.Float(父类Number)
 * double                                java.lang.Double(父类Number)
 * boolean                               java.lang.Boolean（父类Object）
 * char                                  java.lang.Character（父类Object）
 * */
public class IntegerTest01 {
    public static void main(String[] args) {
        MyInt myint = new MyInt(100);
        doSome(myint);

    }

    public static void doSome(Object obj) {
        System.out.println(obj);
    }
}

class MyInt {
    int value;

    public MyInt() {
    }

    public MyInt(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyInt{" +
                "value=" + value +
                '}';
    }
}