package com.dx.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * 增强的类
 *
 * @Date: 2022/03/29/15:22
 * @Description:
 */
@SuppressWarnings("all")
@Component  //创建这个类的对象
@Aspect  //生产代理对象
@Order(3)   //设置增强类优先级
public class UserProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* com.dx.aopanno.User.add())")
    public void pointDemo() {

    }

    //前置通知
    //@Before 注解表示作为前置通知
    @Before(value = "pointDemo()")
    public void before() {
        System.out.println("before 前置通知...");
    }

    //正常返回后执行通知
    //@AfterReturning 注解表示作为正常返回后执行通知
    @AfterReturning(value = "execution(* com.dx.aopanno.User.add())")
    public void afterReturning() {
        System.out.println("afterReturning 正常返回后执行...");
    }

    //最终通知
    //@After 注解表示作为后置通知
    @After(value = "execution(* com.dx.aopanno.User.add())")
    public void after() {
        System.out.println("after 最终通知...");
    }

    //异常通知
    //@AfterThrowing 注解表示作为异常通知
    @AfterThrowing(value = "execution(* com.dx.aopanno.User.add())")
    public void afterThrowing() {
        System.out.println("AfterThrowing 异常通知");
    }

    //环绕通知
    //@Around 注解表示作为环绕通知
    @Around("pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知之前...");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知之后...");
    }
}
