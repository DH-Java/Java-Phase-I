package com.dx.test;

import com.dx.Dao.UserDao;
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
    private SqlSessionFactory factory;
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
        factory = new SqlSessionFactoryBuilder().build(in);
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
    * @Description: 测试一级缓存
    * @Param: []
    * @return: []
    * @Date: 2022/4/2
    */
    @Test
    public void TestFirstLevenCache() {
        UserMybatis id = userDao.findById(20);
        System.out.println("第一次" + id);
        //清理缓存
        sqlSession.clearCache();
/*        sqlSession.close();
        再次获取sqlSession对象
        SqlSession sqlSession1 = factory.openSession();
        UserDao mapper = sqlSession1.getMapper(UserDao.class);*/
        UserMybatis byId = userDao.findById(20);
        System.out.println("第二次" + byId);
        System.out.println(id == byId);

    }
    @Test
    public void TestCloseCache(){
        //根据id查询用户
        UserMybatis user = userDao.findById(20);
        System.out.println("第一次"+user);
        //更新用户信息
        user.setUsername("老邓");
        user.setAddress("渝北区");
        userDao.updateUser(user);
        UserMybatis dao = userDao.findById(20);
        System.out.println("第二次"+dao);
        System.out.println(userDao==userDao);
    }
}




