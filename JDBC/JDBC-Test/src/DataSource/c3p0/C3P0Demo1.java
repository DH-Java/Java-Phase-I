package DataSource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo1 {
    public static void main(String[] args) {
        //获取数据库连接池
        DataSource ds = new ComboPooledDataSource();
        try {
            //获取连接对象
            Connection connection = ds.getConnection();

            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
