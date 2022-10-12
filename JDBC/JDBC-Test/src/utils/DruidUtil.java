package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
//Druid工具类
public class DruidUtil {
    private static DataSource ds;

    static {
        //加载配置文件
        Properties properties = new Properties();
        InputStream resourceAsStream = DruidUtil.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            properties.load(resourceAsStream);
            try {
                //获取数据库连接池对象
                ds= DruidDataSourceFactory.createDataSource(properties);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取连接
    public static Connection getConn() throws SQLException {
            return ds.getConnection();
    }
    //释放资源
    public static void close(ResultSet resultSet , Statement statement , Connection connection){
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static DataSource getDataSource(){
        return ds;
    }
}
