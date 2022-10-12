package DataSource.druid;

import utils.DruidUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo2 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //利用工具类获取对象
            connection = DruidUtil.getConn();
            String sql = "insert into xs.t_act (actno,balance,t_name) values (520,50000,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"老邓");
            int i = preparedStatement.executeUpdate();
            System.out.println(i==1? "保存成功":"保存失败");

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //利用工具类释放资源
            DruidUtil.close(null,preparedStatement,connection);
        }
    }
}
