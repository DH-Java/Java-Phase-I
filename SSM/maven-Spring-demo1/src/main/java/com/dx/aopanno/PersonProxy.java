package com.dx.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *增强类
 * @Date: 2022/03/29/16:35
 * @Description:
 */
@Component   //创建这个类的对象
@Aspect     //生产代理对象
@Order(1)   //设置增强类优先级
public class PersonProxy {
    //前置通知
    //@Before 注解表示作为前置通知
    @Before(value = "execution(* com.dx.aopanno.User.add())")
    public void before() {
        System.out.println("before PersonProxy 前置通知...");
    }
}
