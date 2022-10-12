package String字符类;

/*
* 1、String s = new String (")
* String s ="";
* String s = new String(char数组)
* String s = new String(char数组,起始下标，长度)；
* String s = new String(byte数组)
* String s = new String(byte数组,起始下标，长度)；
* */
public class StringTest01 {
    public static void main(String[] args) {
        byte [] bytes = {97,98,99};
        String s1 = new String(bytes,1,2);
        System.out.println(s1);
    }
}
