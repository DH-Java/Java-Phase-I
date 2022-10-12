package com.dx.Test;

import com.dx.SpringConfig.Springconfig;
import com.dx.add.AddImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddTest {
    @Test
    public void getAdd(){
//        //1、加载spring配置文件
//        ApplicationContext context = new ClassPathXmlApplicationContext("appSpring.xml");
//
//        //2、获取配置创建的文件
//        AddImpl Add = context.getBean("addImpl", AddImpl.class);
//
//        System.out.println(Add);
//        Add.add();

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Springconfig.class);
        AddImpl bean = annotationConfigApplicationContext.getBean(AddImpl.class);
        System.out.println(bean);
    }
}
