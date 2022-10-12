package com.dx.test;

import com.dx.Dao.UserDao;
import com.dx.User.QueryVo;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestMybatis {
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
        in = Resources.getResourceAsStream("mybatis-config1.xml");
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

    @Test
    public void selectFindAllTest() throws IOException {
        //5.使用代理对象执行方法
        List<UserMybatis> userMybatis = userDao.findAll();
        for (UserMybatis all : userMybatis
        ) {
            System.out.println(all);
        }
    }

    /**
     * 测试保存操作
     */
    @Test
    public void insertUserTest() {
        UserMybatis userMybatis = new UserMybatis();
        userMybatis.setUsername("老邓");
        userMybatis.setBirthday(new Date());
        userMybatis.setAddress("渝中区");
        userMybatis.setSex("女");
        System.out.println("保存操作之前" + userMybatis);
        //保存用户信息
        userDao.insertUser(userMybatis);
        System.out.println("保存操作之后" + userMybatis);
    }

    /**
     * 测试修改用户操作
     */
    @Test
    public void updateUserTest() {
        UserMybatis userMybatis = new UserMybatis();
        userMybatis.setId(21);
        userMybatis.setUsername("老李");
        userMybatis.setBirthday(new Date());
        userMybatis.setAddress("两江区");
        userMybatis.setSex("女");
        //修改用户信息
        userDao.updateUser(userMybatis);
    }

    /**
     * 测试删除用户操作
     */
    @Test
    public void deleteUserTest() {
        //删除用户信息
        userDao.deleteUser(21);
    }

    /**
     * 测试根据id获取用户信息操作
     */
    @Test
    public void findByIdTest() {
        //根据id查询用户信息
        UserMybatis user = userDao.findById(20);
        System.out.println(user);
    }

    /**
     * 测试根据用户名称模糊查询操作
     */
    @Test
    public void findByNameTest() {
        //根据用户名字模糊查询用户信息
        List<UserMybatis> byName = userDao.findByName("%老%");
        for (UserMybatis user : byName) {
            System.out.println(user);
        }
    }

    /**
     * 测试用户记录总数量
     */
    @Test
    public void findCountTest() {
        //用户记录总数量
        Integer count = userDao.findCount();
        System.out.println(count);
    }

    /**
     * 测试使用QueryVo作为查询条件
     */
    @Test
    public void findByVoTest() {
        //根据用户名字模糊查询用户信息
        QueryVo vo = new QueryVo();
        UserMybatis userMybatis = new UserMybatis();
        userMybatis.setUsername("%老%");
        vo.setUserMybatis(userMybatis);
        List<UserMybatis> byName = userDao.findByVo(vo);
        for (UserMybatis user : byName) {
            System.out.println(user);
        }
    }

    /**
     * 测试根据条件查询
     */
    @Test
    public void findByConditionTest() {
        //测试根据条件查询
        UserMybatis userMybatis = new UserMybatis();
        userMybatis.setUsername("老邓");
        userMybatis.setSex("男");
        List<UserMybatis> byName = userDao.findByCondition(userMybatis);
        for (UserMybatis user : byName) {
            System.out.println(user);
        }
    }

    /**
     * 根据QueryVo中的id集合查询用户列表
     */
    @Test
    public void findByIdsTest() {
        QueryVo queryVo = new QueryVo();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(22);
        list.add(23);
        queryVo.setIds(list);
        List<UserMybatis> byIds = userDao.findByIds(queryVo);
        for (UserMybatis user : byIds) {
            System.out.println(user);
        }
    }
}

