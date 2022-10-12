package IO.src.day4Java数组和其他类;

public class day4hashCode {
    /*
    * hashCode方法
    * public native int hashCode（）；
    * 这个方法不是抽象方法，带有native关键字，底层调用c++程序。
    * hasaCode返回的是哈希码：
    * 实际就是一个Java对象的内存地址，经过哈希算法，得出的一个值。
    * */
    public static void main(String[] args) {
        Object o = new Object();
        int hashCode = o.hashCode();
        System.out.println(hashCode);
    }
}
