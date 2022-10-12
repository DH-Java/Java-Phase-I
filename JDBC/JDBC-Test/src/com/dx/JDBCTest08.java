package com.dx;

import java.sql.*;
import java.util.Scanner;
/*
*@Author:DH
*@Date:2021/11/16 20:34
*@Description:TODO
** @param null
*@return:
* 用户在控制台输入desc就是降序，输出asc就是升序
*/
public class JDBCTest08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输出asc/desc asc表示升序，desc表示降序");
        System.out.println("请输入");
        String s = scanner.nextLine();


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL","DH","020903");
            statement = connection.createStatement();
            String sql = "select * from db_test01.students order by cid "+s+"";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                String num = resultSet.getString("stu_num");
                String name = resultSet.getString("stu_name");
                String gender = resultSet.getString("stu_gender");
                String age = resultSet.getString("stu_age");
                String cid = resultSet.getString("cid");
                System.out.println(num+name+gender+age+cid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (resultSet!=null){
                try {
                    resultSet.close();
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
