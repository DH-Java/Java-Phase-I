package com.dx;

import utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
* 这个程序两个任务：
*       第一：测试DBUtils是否好用
*       第二：模糊查询怎么写
* */

public class JDBCTest12 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {
            //获取连接
            connection = DBUtil.getConnection();
            //获取预编译的数据库操作对象
            String sql = "select * from db_test01.students";
            ps=connection.prepareStatement(sql);
            resultSet = ps.executeQuery();
            while (resultSet.next()){
                String stu_num = resultSet.getString("stu_num");
                String stu_name = resultSet.getString("stu_name");
                String gender = resultSet.getString("stu_gender");
                int stu_age = resultSet.getInt("stu_age");
                int cid = resultSet.getInt("cid");
                System.out.println(stu_num+"\t"+stu_name+"\t"+gender+"\t"+stu_age+"\t"+cid+"\t");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //释放资源
            DBUtil.Close(connection,ps,resultSet);
        }
    }
}
