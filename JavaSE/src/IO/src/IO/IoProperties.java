package IO.src.IO;

import java.io.FileReader;
import java.util.Properties;

//IO+Properties的联合使用。
//非常好的一个设计理念：
//以后经常改变的数据，可以单独写到一个文件中，使用程序动态读取
//将来只需要修改这个文件的内容，java代码不需要改动，不需要重新编译，服务器也不需要重启。就可以拿到动态的信息
//类似于以上机制的这种文件被称为配置文件。
//并且当配置文件中的内容模式是：
//key1 = vlaue
// key2 = value
//的时候，我们把这种配置文件叫做属性配置文件。
//Java规范中有要求，属性配置文件建议以.properties结尾，但这不是必须的。
//这种以properties结尾的文件在java中被称为：属性配置文件。
//其中properties是专门存放属性配置文件内容的一个类
public class IoProperties {
    public static void main(String[] args) throws Exception {
        /*
         * Properties是一个Map集合，key和value都是String类型。
         * 想将userinfo文件中的数据加载到Properties对象当中。
         * */

        //新建一个输入流对象
        FileReader fileReader = new FileReader("F:/idea/Demo_01/src/userinfo.properties");

        //新建一个Map集合
        Properties pro = new Properties();

        //调用Properties对象的Load方法将文件中的数据加载到Map集合中。
        pro.load(fileReader);//文件中的数据顺着管道加载到Map集合当中，等号左边是key，右边做value

        //通过key来获取value
        String s = pro.getProperty("username");
        System.out.println(s);

        String s1 = pro.getProperty("password");
        System.out.println(s1);
    }

}
