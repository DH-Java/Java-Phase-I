package com.dx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
* 重点三行代码
*       connection.setAutoCommit(false);停止事务提交
*       connection.commit();//提交事务
*       connection.rollback();回滚
* */
public class JDBCTest11 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement PS = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL","root","020903");
            connection.setAutoCommit(false);//开启事务
            String sql = "update xs.t_act set balance = ? where actno = ?";
            PS = connection.prepareStatement(sql);
            PS.setDouble(1,10000);
            PS.setInt(2,111);
            int count = PS.executeUpdate();

//            String s = null;
//            s.toString();


            PS.setDouble(1,10000);
            PS.setInt(2,222);
            count += PS.executeUpdate();

            connection.commit();//程序能走到这，说明以上程序没有异常，事务结束，手动提交数据
        } catch (Exception e) {
            //回滚事务
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
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
