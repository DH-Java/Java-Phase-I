package String字符类;

import java.nio.charset.StandardCharsets;

public class StringTest02 {
    public static void main(String[] args) {
        //String类中常用方法。
        //1、char charAt(in index)
        char c = "中国人".charAt(1);
        System.out.println(c);
        //2、compareTo比较字符串大小，首字母。
        int result = "abc".compareTo("dbc");
        System.out.println(result);

        //3、boolean contains(charSequence s)
        //判断前面的字符是否包含后面的子字符串。        System.out.println("HelloWorld.java".contains("java"));
        System.out.println("http://www.baidu.com".contains("https"));

        //4、Boolean endsWith(String suffix)
        //判断当前字符是否以某个字符串结尾。
        System.out.println("test.txt".endsWith(".java"));
        System.out.println("test.txt".endsWith(".txt"));


        //5、boolean equals （Object anObject）
        //比较两个字符串必须使用equals方法，不能使用==
        //equals方法有没有使用cimpareTo方法？
        System.out.println("abc".equals("abc"));

        //6、boolean equalsIgnoreCase(String anotherString)
        //判断两个字符串是否相等，并且同时忽略大小写。
        System.out.println("ABC".equalsIgnoreCase("abc"));

        //7、byte [] getBytes()
        //将字符串对象转换成字节数据。
        byte[] bytes = "abcdefg".getBytes();
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);
        }

        //8、int indexOf(String str)
        //判断某个字符串在当前字符串中第一次出现处的索引（下标）。
        System.out.println("dabicbieqbdiach".indexOf("bic"));

        //9、boolean isEmpty()
        //判断某个字符串是否为"空字符串”。底层源代码应该调用的是字符串的length（）方法。
        //String = " ";
        String s = "a";
        System.out.println(s.isEmpty());

        //10、int length()
        //判断数组长度是length属性，判断字符串长度是length（）方法。
        System.out.println("abc".length());

        //11、int lastIndexOf(String str)
        //判断某个字符串在当前字符串中最后一次出现的索引（下标）。
        System.out.println("abcdeee".lastIndexOf("e"));

        //12、String replace （CharSequence target ， CharSequence replacement）
        //替换
        //String的父接口就是：CharSequence
        String s1 = "http://www.baidu.com".replace("http://","https://");
        System.out.println(s1);
        String s2="name = zhangshan&password=age=20".replace("=",":");
        System.out.println(s2);

        //13、String [] split (String regex)
        //拆分字符串
        String [] s3 = "2002-09-03".split("-");
        for (int i = 0; i <s3.length ; i++) {
            System.out.print(s3[i]);
        }
        //14、Boolean startsWith （String prefix）
        //判断某个字符串是否以某个字符串开始。
        System.out.println("http://www.baidu.com".startsWith("http"));
        System.out.println("http://www.baidu.com".startsWith("https"));


        //15、String substring （int beginIndex）
        //截取字符串
        System.out.println("http://www.baicu.com".substring(4));


        //16、String substring （int beginIndex ，int endIndex）
        //beginIndex起始位置（包括）
        //endIndex起始位置（不包括）
        System.out.println("http://www.baicu.com".substring(4,8));

        //17、char [] ToCharArray()
        //将字符串转换成char数组
        char [] chars = "我是中国人".toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            System.out.println(chars[i]);
        }

        //18、String toLowerCase()
        //转换为小写
        System.out.println("ABCD".toLowerCase());

        //19、String toUpperCase();
        //转换成大写
        System.out.println("abcd".toUpperCase());

        //20、String trim（）；
        //去除字符串前后空白
        System.out.println("         hello          word           ".trim());


        //21、String中只有一个方法是静态的，不需要new对象
        //这个方法叫valueOf
        String s4 = String.valueOf(true);
        String s5 = String.valueOf(100);
        String s6 = String.valueOf(3.14);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        //这个静态的valueOf（）方法，参数是一个对象的时候，会自动调用该对象的toString（）方法吗
        String s7 = String.valueOf(new User());
        System.out.println(s7);//没有重写toString（）方法之前是对象内存地址
        System.out.println(s7.toString());
    }
}
class User{
    @Override
    public String toString() {
        return "我是vip客户";
    }
}
