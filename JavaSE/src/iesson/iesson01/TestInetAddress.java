package iesson.iesson01;
//测试IP

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) {
        try {
            //查询本机地址
            InetAddress byName = InetAddress.getByName("127.0.0.1");

            System.out.println(byName);
            //查询网站ip地址
            InetAddress byName1 = InetAddress.getByName("www.baidu.com");

            System.out.println(byName1);

            InetAddress byName2 = InetAddress.getByName("localhost");

            System.out.println(byName2);

            InetAddress byName3 = InetAddress.getLocalHost();

            System.out.println(byName3);

            System.out.println("===========================================");

            //常用方法
            System.out.println(byName1.getAddress());
            System.out.println(byName1.getCanonicalHostName());//规范的名字
            System.out.println(byName1.getHostAddress());//ip
            System.out.println(byName1.getHostName());//域名，或者自己电脑的名字

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
