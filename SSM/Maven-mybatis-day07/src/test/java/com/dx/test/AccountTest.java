package com.dx.test;

import com.dx.Admin.Account;
import com.dx.Admin.User;
import com.dx.Dao.AccountDao;
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
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/06/9:18
 * @Description:
 */
public class AccountTest {
    private InputStream in;
    private SqlSession session;
    private AccountDao account;
    //初始化操作
    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("MyBatis-Config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        session = sqlSessionFactory.openSession(true);
        account = session.getMapper(AccountDao.class);
    }
    //查询所有账户和其对应的用户信息
    @Test
    public void TestFindAll() {
        List<Account> accounts = account.findAll();
        for (Account All : accounts) {
            System.out.println("每个账号所对应的用户信息");
            System.out.println(All);
            System.out.println(All.getUser());
        }
    }
    @After
    public void display() throws IOException {
        //事务提交
        session.commit();
        session.close();
        in.close();
    }
}
