package com.dx;
//实际开发中不建议把连接数据库的信息写到java程序中。
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

//将连接数据库中的所有信息配置到配置文件中
public class JDBCTest04 {
    public static void main(String[] args) {
        //使用资源绑定器绑定属性配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("JDBC");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");



        Statement statement = null;
        Connection root = null;
        try {
            Class.forName(driver);
            try {
                root = DriverManager.getConnection(url, user,password);
                statement = root.createStatement();
                int i = statement.executeUpdate("delete from xs.students where stu_sex='女'");//删除
                System.out.println(i==1?"保存成功":"保存失败");

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (statement !=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (root!=null){
                try {
                    root.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
