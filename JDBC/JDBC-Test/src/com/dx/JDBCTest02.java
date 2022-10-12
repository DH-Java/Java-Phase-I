package com.dx;
//JDBC完成delete，update
import java.sql.*;
public class JDBCTest02 {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement = null;
        try {
            //1、注册连接
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //2、获取链接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL","root","020903");
            System.out.println("数据库连接成功");
            //3、获取数据库操作对象
            statement = connection.createStatement();
            //4、执行SQL语句
            int i = statement.executeUpdate("delete from xs.students where stu_sex='女'");//删除
            System.out.println(i==1?"保存成功":"保存失败");
            int j = statement.executeUpdate("update xs.students set stu_name='张杰' where stu_id ='20602061'");//修改
            System.out.println(j==1?"保存成功":"保存失败");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6、关闭资源
            if (statement != null){
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
