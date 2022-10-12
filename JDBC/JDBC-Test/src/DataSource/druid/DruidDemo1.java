package DataSource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo1 {
    public static void main(String[] args) {
        //1、导入jar包
        //2、定义配置文件
        //3、加载配置文件
        Properties properties = new Properties();
        InputStream resourceAsStream = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            properties.load(resourceAsStream);

            try {
                //4、获取连接池对象
                DataSource ds = DruidDataSourceFactory.createDataSource(properties);
                //5、获取连接
                Connection connection = ds.getConnection();
                System.out.println(connection);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
