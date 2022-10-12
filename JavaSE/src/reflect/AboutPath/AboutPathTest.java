package reflect.AboutPath;

import java.io.FileNotFoundException;
import java.io.FileReader;

//研究一下文件路径的问题
public class AboutPathTest {
    public static void main(String[] args) throws Exception {
        //这种方式的路径缺点是：移植性差，在idea中默认的当前路径是project的根。
        //这个代码假如离开了idea，换到其他位置，可能当前的路径就不是project的跟了，这时这个路径就无效了。
        //FileReader reader = new FileReader("src/classinfo.properties");

        /*
        * 接下来说一种比较通用的一种路径，即使代码换位置了，这样编写仍然是通用的。
        * 注意：使用以下通用方式的前提是：这个文件必须在类路径下。
        * 什么是类路径？凡是在src下的都是类路径。
        * src是类的根路径
        * */

        /*
        * Thread。currenThread()当前线程对象
        * getContextClassLoader()是线程对象的方法，可以获取当前线程的类加载器对象
        * getResource()【获取资源】这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源。
        * */


        String s = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo.properties").getPath();
        //采用以上代码可以拿到一个文件的绝对路径。
        ///F:/idea/Demo_01/out/production/Demo_01/classinfo.properties
        System.out.println(s);

        String s1 = Thread.currentThread().getContextClassLoader().getResource("userinfo.properties").getPath();
        System.out.println(s1);
    }
}
