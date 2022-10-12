package com.dx;

import com.dx.Dao.Crud;
import com.dx.aopanno.User;
import com.dx.aopxml.Book;
import com.dx.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void AopXmlTest() {
        //1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的文件
        Book book = context.getBean("book", Book.class);

        book.buy();


    }

    @Test
    public void AopAnnoTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
    @Test
    public void AopAnnoTest1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        Crud crud = context.getBean(Crud.class);
        int num = crud.select(100);
        System.out.println(num);
    }
}
