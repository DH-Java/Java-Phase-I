package IO.src.包装类;

public class IntegerTest2 {
    public static void main(String[] args) {
        //123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换。
        //基本数据类型 = （转换为）->引用数据类型（装箱）
        Integer integer = new Integer(123);
        //将引用数据类型==（转换为）->基本数据类型（拆箱）
        double d = integer.doubleValue();
        System.out.println(d);

        //将引用数据类型==（转换为）->基本数据类型（拆箱）
        int retValue = integer.intValue();
        System.out.println(retValue);

        Integer integer1 = new Integer(100);
        System.out.println(integer1);
        //把String类型的数字，转换成Integer包装类型。（String-->Integer）
        Integer integer2 = new Integer("123");
        System.out.println(integer2);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

    }
}
