package com.dx;

import com.dx.config.TxConfig;
import com.dx.entity.Account;
import com.dx.service.AccountService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;


/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/31/16:41
 * @Description:
 */

public class test {
    private static final Logger log = LoggerFactory.getLogger(test.class);

    @Test
    public void Log4(){
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }

    //测试转账功能

    /**
     * @Description: 通过注解操作实现事务操作
     * @Param: []
     * @return: []
     * @Date: 2022/4/7
     */
    @Test
    public void AccountTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.account();
    }

    /**
     * @Description: 通过xlm配置实现事务操作
     * @Param: []
     * @return: []
     * @Date: 2022/4/7
     */
    @Test
    public void AccountXmlTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-config1.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.account();
    }

    /**
     * @Description: 通过配置类实现事务操作
     * @Param: []
     * @return: []
     * @Date: 2022/4/7
     */
    @Test
    public void ConfigTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.account();
    }

    //函数式风格创建对象，交给Spring进行管理
    @Test
    public void GenericApplicationContextTest() {
        //1、创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2、调用context方法进行对象注册
        context.refresh();
        context.registerBean("account", Account.class, () -> new Account());
        //3、获取在Spring注册的对象
        Object account = context.getBean("account");
        System.out.println(account);
    }

}
