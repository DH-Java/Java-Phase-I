package com.dx;

import java.sql.*;

public class JDBCTest09 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement PS = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL","root","020903");
//            添加数据
//            String sql = "insert into xs.table_user (id,user ,password,name ) values (?,?,?,?)";
//            PS = connection.prepareStatement(sql);
//            PS.setInt(1,20902090);
//            PS.setString(2,"做梦做到手起茧");
//            PS.setString(3,"123456");
//            PS.setString(4,"老李");
//            修改数据
//            String sql = "update xs.table_user set user = ? , password = ? where id = ?";
//            PS = connection.prepareStatement(sql);
//            PS.setString(1,"草泥马");
//            PS.setString(2,"987654");
//            PS.setInt(3,30303030);
//            删除数据
            String sql = "delete from xs.table_user where id=?";
            PS = connection.prepareStatement(sql);
            PS.setInt(1,20902090);
            int count = PS.executeUpdate();
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
