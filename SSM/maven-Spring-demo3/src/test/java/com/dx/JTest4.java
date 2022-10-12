package com.dx;

import com.dx.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/12/19:54
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)//单元测试框架
@ContextConfiguration(locations = "classpath:Spring-config1.xml")//加载配置文件
public class JTest4 {

    @Autowired
    private AccountService accountService;

    @Test
    public void test1(){
        accountService.account();
    }
}
