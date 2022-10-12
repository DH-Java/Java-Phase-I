package com.dx;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ResourceBundle;

//处理查询结果集
public class JDBCTest05 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("JDBC");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");


        Statement statement = null;
        Connection connection = null;
        ResultSet rs = null;
        //1、注册驱动
        try {
            Class.forName(driver);
            try {
                //2、获取连接
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("数据库连接成功"+connection);
                //3、获取数据库操作对象
                statement = connection.createStatement();
                //4、执行SQL对象
                // int  executeUpdate(insert/delete/update)
                // ResultSet executeQuery专门执行DQL语句的方法
                 rs = statement.executeQuery("select stu_name,stu_age from xs.students");

                //5、处理查询结果集
              while (rs.next()){
                  String stu_name = rs.getString("stu_name");
                  int stu_age = rs.getInt("stu_age");
                  System.out.println(stu_name+stu_age);
              }


            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //6、释放资源
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement!=null){
                try {
                    statement.close();
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
}
