package DataSource.JdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.DruidUtil;

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        //导入jar包
        //创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUtil.getDataSource());
        //调用方法
        String  sql = "update xs.t_act set balance=52000 where actno = ?";
        int update = jdbcTemplate.update(sql,520);
        System.out.println(update==1 ? "保存成功":"保存失败");
    }
}
