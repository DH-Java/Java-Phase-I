package String_;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.rmi.server.UID;
import java.util.Arrays;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/15/19:28
 * @Description:
 */
@SuppressWarnings("all")
public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String test = "存放在常量池";//存放在常量区
        String test1 = "存放在常量池";//这两个的地址是一样的,并没有重新生成一个字符串

        String test2 = new String("存放在堆中");//放在堆区
        String test3 = new String("这两个是两个单独的字符串");//这两个是两个单独的字符串

        String test5 = new String("bcd");

        //返回字符串长度,不带结束符
        System.out.println(test.length());
        //判断字符串是否为空//false
        System.out.println(test.isEmpty());
        //判断字符串以XX开头
        System.out.println(test.startsWith("存"));
        //判断字符串以XX结尾
        System.out.println(test.endsWith("池"));
        //将字符串英文全部改为大写并返回 ,不改变原有的值
        System.out.println(test5.toUpperCase());
        //将字符串英文全部改为小写并返回
        System.out.println(test5.toLowerCase());
        //获得字符串的第1个字符;java的数是从0开始的
        System.out.println(test.charAt(1));
        //查找字符串第一次出现的位置
        System.out.println(test.indexOf("在"));
        //从指定位置查找字符串第一次出现的位置
        System.out.println(test.indexOf("在",1));
        //从后往前查找字符串第一次出现的位置
        System.out.println(test.lastIndexOf("在"));
        //从指定位置截取字符串
        System.out.println(test.substring(1));
        //截取中间某处的字符串
        System.out.println(test.substring(1,3));
        //生成随机ID
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        //截取并生成新的文件名
        System.out.println(uuid+test5.substring(test.lastIndexOf("在")));
        System.out.println("---------------字符串转化方法------------------------");
        String test6 = "zhong国";
        //将字符串转化为字节
        byte[] bytes = test6.getBytes();
        //将字符串转化为字节后再转换字符编码,各平台支持的中文编码可能不一样,所以要进行转换
        System.out.println(new String(bytes,"GBK"));
        //给指定字符串重新编码
        System.out.println(new String(test6.getBytes(),"UTF-8"));
        System.out.println(new String(test6.getBytes(StandardCharsets.UTF_8)));
        System.out.println("---------------字符串拼接、替换、是否含有    ------------------------");
        String test7 = "  aac ";
        //查看是否含有指定字符串
        System.out.println(test.contains("在"));
        //拼接字符串到结尾
        System.out.println(test.concat("在"));
        //替换指定字符为指定字符
        System.out.println(test.replace("在","邓"));
        //按指定字符串分割字符串
        String[] split = test.split("-");
        System.out.println(Arrays.toString(split));
        //去字符串开头和结尾的空格
        System.out.println(test7.trim());
        System.out.println("---------------字符串比较 ------------------------");
        //判断字符串是否相等
        System.out.println(test.equals("在"));
        //判断字符串是否相等,区分大小写
        System.out.println(test5.compareTo("Bcd"));
        //判断字符串是否相等;不区分大小写
        System.out.println(test5.compareToIgnoreCase("BCD"));

    }
}
