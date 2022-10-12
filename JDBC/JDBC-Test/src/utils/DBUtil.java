package utils;

import java.sql.*;

//JDBC工具类，简化JDBC编程
public class DBUtil {

    /**
     * 工具类的构造方法都是私有的。
     *因为工具类当中的方法都是静态的，不需要new对象，直接采用类名调用。
    **/
    private DBUtil() {
    }
    //静态代码块在类加载的时候执行，并且只执行一次。
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //获取数据库连接对象
    //return 连接对象
    public static Connection getConnection() throws SQLException {
             return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MySQL","DH","020903");
    }
    //释放资源
    public static void Close(Connection connection , Statement ps , ResultSet resultSet){
        if (resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps!=null){
            try {
               ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
