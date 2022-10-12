package com.dx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest03 {
    public static void main(String[] args) {
        try {
//            try {
//                这是注册驱动的第一种写法
//               DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
            //第二种注册驱动的方式：常用的。
            //为什么这种方式常用？因为参数是一个字符串，字符串可以写到xxx.properties文件中。
            //以下方法不需要接收返回值，因为我们只想用他的类加载动作。
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL", "DH", "020903");
                System.out.println("连接到数据库"+root);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
