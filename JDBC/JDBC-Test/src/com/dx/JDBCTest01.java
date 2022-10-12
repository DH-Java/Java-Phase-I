package com.dx;

import java.sql.*;

public class JDBCTest01{
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            //1、注册驱动
            Driver driver = new com.mysql.jdbc.Driver();//多态，父类型引用指向子类型对象。
            //Driver driver= new oracle.jdbc.driver.OracleDriver();//oracle的驱动
            DriverManager.registerDriver(driver);
            //2、获取连接
            /*
            * URL:统一资源定位符（网络中某个资源的绝对路径）
            *jdbc:mysql://协议
            * 127.0.0.1 IP地址
            * 3306 mysql数据库端口号
            * MySQL 具体的数据库实例名
            *
            * 说明：localhost 和127.0.0.1都是本机ip地址
            *
            * 什么是通信协议，有什么用？
            *   通信协议是通信之前就提前定好的数据传送格式。
            *   数据包具体怎么传数据，格式都是提前定好的。
            * */
            String url = "jdbc:mysql://127.0.0.1:3306/MySQL";
            String user = "DH";
            String password = "020903";
            connection = DriverManager.getConnection(url,user,password);
            //com.mysql.cj.jdbc.ConnectionImpl@5123a213
            System.out.println("数据库连接对象="+connection);
            //3、获取数据库操作对象（Statement专门执行sql语句的）
            //创建一个Statement对象，用于将SQL语句发送到数据库。
            statement = connection.createStatement();
            //4、执行sql
            String sql = "insert into xs.students (stu_id,stu_name,stu_age,stu_sex) values('20602061','邓杰',19,'男')";
            //执行DML语句（insert delete update）执行给定的SQL语句，这可能是 INSERT ， UPDATE ，或 DELETE声明，或者不返回任何内容，如SQL DDL语句的SQL语句。
            int executeLargeUpdate = statement.executeUpdate(sql);
            System.out.println(executeLargeUpdate==1?"保存成功":"保存失败");
            //5、处理查询结果集
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6、释放资源
            //为了保证资源一定释放，在finally语句中关闭资源
            //并且要遵循从小到大依次关闭
            //分别对其try...catch
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection !=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
