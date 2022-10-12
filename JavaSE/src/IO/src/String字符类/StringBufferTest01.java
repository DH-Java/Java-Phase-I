package IO.src.String字符类;
/*
* 我们在实际的开发中，如果需要进行字符串的频繁拼接，会有什么问题
* 因为java中的字符串是不可变的，每一次拼接都会产生新的字符串
* 这样会产生大量的方法区内存。造成内存空间的浪费
* 当需要进行字符串的大量拼接，建议使用
* java.lang.StringBuffer
* java.lang.StringBuilder
*
* 如何优化StringBuffer的性能。
* */
public class StringBufferTest01 {

    public static void main(String[] args){
        //创建一个初始化容量为16的byte [] 数组。（字符串缓冲区对象）
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        stringBuffer.append("d");

        //拼接字符串，以后拼接字符串统一调用append（）方法
        StringBuffer stringBuffer1 = stringBuffer.append("a");
        StringBuffer stringBuffer2 = stringBuffer.append("b");
        StringBuffer stringBuffer3 = stringBuffer.append("c");
        StringBuffer stringBuffer4 = stringBuffer.append("d");
        StringBuffer stringBuffer5 = stringBuffer.append("e");
        //append()方法底层在进行追加的时候，如果byte数组满了，会自动扩容。
        System.out.println(stringBuffer);
        System.out.println("=================");
        StringBuffer stringBuffer6 = new StringBuffer(100);
        stringBuffer6.append("hello");
        stringBuffer6.append("word");
        stringBuffer6.append("hello");
        stringBuffer6.append("kikty");
        System.out.println(stringBuffer6);


    }
}
