package IO.src.包装类;

public class IntegerTest03 {
    public static void main(String[] args) {
        //基本数据类型--（自动转换）-->包装类型：自动装箱
        Integer x = 900;
        System.out.println(x);
        int y = x.intValue();
        System.out.println(y);

        Integer z = 1000;
        System.out.println(z + 1);

        //static int parseInt(String s)
        //静态方法，传参String，返回int
        int retValue = Integer.parseInt("123");
        System.out.println(retValue + 223);

        //static String toBinaryString(int i)
        //静态的：将十进制转换成二进制字符串。
        String b = Integer.toBinaryString(3);
        System.out.println(b);

        //static String toHexString(int i)
        //静态的：将十进制转换成十六进制字符串。
        String b1 = Integer.toHexString(16);
        System.out.println(b1);

        //static String toOctalString(int i)
        //将十进制转换成八进制字符串。
        String b2 = Integer.toOctalString(16);
        System.out.println(b2);

        String s1 = String.valueOf("10");
        System.out.println(s1);


    }
}
