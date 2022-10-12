package com.dx;

import utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//悲观锁
public class JDBCTest13 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            connection=DBUtil.getConnection();
            connection.setAutoCommit(false);
            String sql = "select actno , balance from xs.t_act where t_name like ? for update ";
            ps = connection.prepareStatement(sql);
            ps.setString(1,"老%");
            resultSet = ps.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("actno")+"  =  "+resultSet.getString("balance"));
            }
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            DBUtil.Close(connection,ps,resultSet);
        }
    }
}
