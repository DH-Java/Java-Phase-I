package DataSource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo3 {
    public static void main(String[] args) {
        //获取数据库连接池,使用指定的配置
        DataSource ds = new ComboPooledDataSource("otherc3p0");
        for (int i = 1 ; i<=15; i++){
            //获取连接对象
            try {
                Connection connection = ds.getConnection();
                System.out.println(i+":"+connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
