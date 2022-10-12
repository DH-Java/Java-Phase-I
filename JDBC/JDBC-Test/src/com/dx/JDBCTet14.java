package com.dx;

import utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTet14 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;


        try {
            connection = DBUtil.getConnection();
            String sql = "update xs.t_act set actno = actno + 20 where t_name like ?";
            ps=connection.prepareStatement(sql);
            ps.setString(1,"%老%");
            int i = ps.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.Close(connection,ps,null);
        }
    }
}
