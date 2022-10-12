package Collection;
//位运算符>>
public class BinaryTest {
    public static void main(String[] args) {
        //>>1二进制右移一位。
        //>>2二进制右移两位。
        //10的二进制是00001010 【10】
        //10的二进制右移一位是00000101 【5】
        System.out.println(10>>1);//右移一位就是除以2

        //二进制左移一位
        //10的二进制位是00001010 【10】
        //10的二进制左移一位:00010100 【20】
        System.out.println(10<<1);
    }
}
