package IO.src.reflect;

import java.util.ResourceBundle;

//java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容。
//使用这种文件的时候，属性配置文件xxx.properties必须放到类路径下。
public class ResourceBundleTest {
    public static void main(String[] args) {
        //资源绑定器，只能绑定xxx。properties文件，并且这个文件必须在类路径下。文件拓展名也必须是properties
        //并且再写路径的时候，路径后面的拓展名不能写。
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo");
        String s = bundle.getString("className");
        System.out.println(s);
    }
}
