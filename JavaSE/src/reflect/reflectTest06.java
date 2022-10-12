package reflect;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class reflectTest06 {
    public static void main(String[] args) throws Exception {
        /*String path =Thread.currentThread().getContextClassLoader()
                .getResource("classinfo.properties").getPath();
        FileReader reader = new FileReader(path);*/
        //直接以流的形式返回。
        InputStream reader = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo.properties");
        Properties pro =new Properties();
        pro.load(reader);
        reader.close();
        String s = pro.getProperty("className");
        System.out.println(s);
    }
}
