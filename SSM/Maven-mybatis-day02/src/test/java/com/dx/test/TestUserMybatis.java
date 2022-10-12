package com.dx.test;

import com.dx.Dao.AccountDao;
import com.dx.Dao.UserDao;
import com.dx.User.Account;
import com.dx.User.AccountUser;
import com.dx.User.UserMybatis;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestUserMybatis {
    private InputStream in;
    private SqlSession sqlSession;
    private UserDao userDao;

    /**
     * 初始化操作
     *
     * @throws IOException
     */
    @Before//测试方法执行之前执行
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.使用工厂生产sqlSession对象
        sqlSession = factory.openSession();
        //4.使用sqlSession创建Dao接口的代理对象
        userDao = sqlSession.getMapper(UserDao.class);
    }

    /**
     * 提交事务
     * 关闭资源
     *
     * @throws IOException
     */
    @After//测试方法执行之后执行
    public void display() throws IOException {
        //事务提交
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
        in.close();
    }

    /**
     * @Description: 测试查询所有用户和账户操作,
     * @Param: []
     * @return: []
     * @Date: 2022/3/28
     */
    @Test
    public void findAllTest() {
        List<UserMybatis> userMybatis = userDao.findAll();
        for (UserMybatis user : userMybatis
        ) {
            System.out.println("=========每个account的信息========");
            System.out.println(user);
            System.out.println(user.getAccounts());
        }
    }
}




