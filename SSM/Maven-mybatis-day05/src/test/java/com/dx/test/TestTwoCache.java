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

public class TestTwoCache {
    private InputStream in;
    private SqlSessionFactory factory;


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
    }

    /**
     * 提交事务
     * 关闭资源
     *
     * @throws IOException
     */
    @After//测试方法执行之后执行
    public void display() throws IOException {
        in.close();
    }
    //测试二级缓存
    @Test
    public void TwoCacheTest(){
        SqlSession sqlSession1 = factory.openSession();
        UserDao dao1 = sqlSession1.getMapper(UserDao.class);
        UserMybatis id1 = dao1.findById(20);
        System.out.println(id1);
        //二级缓存必须在SqlSession关闭或提交之后有效
        sqlSession1.commit();

        SqlSession sqlSession2 = factory.openSession();
        UserDao dao2 = sqlSession1.getMapper(UserDao.class);
        UserMybatis id2 = dao1.findById(20);
        System.out.println(id2);
        System.out.println(id1==id2);
        sqlSession2.commit();

    }
}




