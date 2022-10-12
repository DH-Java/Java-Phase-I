package com.dx.test;

import com.dx.Admin.User;
import com.dx.Dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/04/14:33
 * @Description:
 */
public class AnnotationTest {
    private InputStream in;
    private SqlSession session;
    private UserDao user;

    //初始化操作
    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("MyBatis-Config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        session = sqlSessionFactory.openSession(true);
        user = session.getMapper(UserDao.class);
    }

    //使用注解开发获取所有用户操作
    @Test
    public void TestFindAll() {
        List<User> userAll = user.findAll();
        for (User All : userAll) {
            System.out.println(All);
        }
    }

    //使用注解开发添加用户操作
    @Test
    public void TestInsertUser() {
        User u = new User();
        u.setUsername("老代");
        u.setUsersex("女");
        u.setUseraddress("四川省");
        u.setUserbirthday(new Date());
        user.insertUser(u);
    }

    //使用注解开发修改用户操作
    @Test
    public void TestUpdateUser() {
        User object = new User();
        object.setUsername("老周");
        object.setUseraddress("北碚区");
        object.setUserid(25);
        user.updateUser(object);
    }

    //使用注解开发删除用户操作
    @Test
    public void TestDeleteUser() {
        user.deleteUser(26);
    }

    //使用注解开发根据id查询用户信息
    @Test
    public void TestFindById() {
        List<User> id = user.findById(20);
        for (User u : id) {
            System.out.println(u);
        }
    }

    //使用注解开发根据用户名模糊查询用户信息
    @Test
    public void TestFindByName() {
        //第一种模糊查询
        //List<User> byName = user.findByName("%老%");
        List<User> byName = user.findByName("老");
        for (User u : byName) {
            System.out.println(u);
        }
    }
    //使用注解开发查询总记录数
    @Test
    public void TestCount(){
        Integer count = user.selectCount();
        System.out.println(count);
    }
    //注销操作
    @After
    public void display() throws IOException {
        //事务提交
        session.commit();
        session.close();
        in.close();
    }
}
