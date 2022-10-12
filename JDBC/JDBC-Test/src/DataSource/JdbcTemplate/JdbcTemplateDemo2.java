package DataSource.JdbcTemplate;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.DBUtil;
import utils.DruidUtil;

import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo2 {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUtil.getDataSource());
    @Test
    public void test1(){
        //1、修改actno=520数据的balance为1314
        String sql = "update xs.t_act set balance = ? where actno = ?";
        int update = jdbcTemplate.update(sql, 1314, 520);
        System.out.println(update==1?"修改成功":"修改失败");
    }

    @Test
    public void test2(){
        //2、添加一条记录
        String sql = "insert into xs.t_act (actno,balance,t_name) values (?,?,?)";
        int insert = jdbcTemplate.update(sql, 1314, 25000, "老李");
        System.out.println(insert==1?"添加成功":"添加失败");
    }
    @Test
    public void test3(){
        //3、删除一条记录
        String sql = "delete from xs.t_act where actno = ?";
        int delete = jdbcTemplate.update(sql, 1314);
        System.out.println(delete==1?"删除成功":"删除失败");
    }
    @Test
    public void test4(){
        //4、查询id为520的记录，将其封装为Map集合
        String sql = "select * from xs.t_act where actno = ?";
        Map<String, Object> Map = jdbcTemplate.queryForMap(sql, 520);
        //{actno=520, balance=1314.0, t_name=老邓}
        System.out.println(Map);
    }
    @Test
    public void test5(){
        //5、查询所有记录，将其封装为List集合
        String sql = "select * from xs.t_act";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        //{actno=171, balance=10000.0, t_name=老李}
        //{actno=282, balance=10000.0, t_name=老邓}
        //{actno=393, balance=22222.0, t_name=老杜}
        //{actno=520, balance=1314.0, t_name=老邓}
        for (Map<String,Object> List:list) {
            System.out.println(List);
        }
    }
    @Test
    public void test6(){
        //6、查询所有记录，将其封装为Emp对象的list集合
        String sql = "select * from xs.t_act";
        List<Emp> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp list:query
             ) {
            System.out.println(list);
        }
    }
    @Test
    public void test7(){
        //7、查询总记录数
        String sql = "select count(actno) from xs.t_act";
        Integer integer = jdbcTemplate.queryForObject(sql, int.class);
        System.out.println(integer);
    }

}
