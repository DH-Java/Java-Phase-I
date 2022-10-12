package IO.src.String字符类;
/*
* StringBuffer和StringBuilder的区别？
* SStringBuffer中的方法都有：synchronized关键字修饰。表示StringBuffer在多线程环境下运行是安全的。
* SStringBuilder中的方法都没有：synchronized关键字修饰。表示StringBuilder在多线程环境下运行是不安全的。
* */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.append("b");
        stringBuilder.append("c");
        stringBuilder.append("d");
        stringBuilder.append("e");
        System.out.println(stringBuilder);
    }
}
