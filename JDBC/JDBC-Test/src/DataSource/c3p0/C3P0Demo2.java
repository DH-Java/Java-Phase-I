package DataSource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo2 {
    public static void main(String[] args) {
        //获取数据库连接池，使用默认配置
        DataSource db = new ComboPooledDataSource();
        for (int i = 1; i <=11 ; i++) {
            //获取连接对象
            try {
                Connection connection = db.getConnection();
                System.out.println(i+":"+connection);
                if (i==5){
                    connection.close();//归还连接到数据池中
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
