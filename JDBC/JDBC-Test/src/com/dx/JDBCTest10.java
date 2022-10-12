package com.dx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
*@Author:DH
*@Date:2021/11/16 23:01
*@Description:TODO
** @param null
*@return:
* JDBC事务机制：
*       1、JDBC的事务是自动提交的，什么是自动提交？
*           只要执行任意一条DML语句，则自动提交一次。这是JDBC默认的事务行为。
*           但是在实际的业务当中，通常都是n条DML语句共同联合才能完成的，必须
*           保证他们这些DML语句在同一个事务中同时成功或同时失败
*       2、以下程序先来验证一下JDBC的事务是否是自动提交机制！
*/
public class JDBCTest10 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement PS = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL","root","020903");
            //删除数据
            String sql = "update xs.students set user = ? where name = ?";
            PS = connection.prepareStatement(sql);
            PS.setString(1,"去你妈的");
            PS.setString(2,"老李");
            int count = PS.executeUpdate();
            System.out.println(count==1? "保存成功":"保存失败");

            PS.setString(1,"操你妈");
            PS.setString(2,"老杜");
            count = PS.executeUpdate();
            System.out.println(count==1? "保存成功":"保存失败");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (PS!=null){
                try {
                    PS.close();
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
