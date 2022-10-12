package com.dx.aopanno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/29/21:50
 * @Description:
 */
@Component
@Aspect
public class CrudAop {

    @Pointcut("execution(int com.dx.Dao.Crud.select())")
    public void pt(){}


    @Before("pt()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
    }

    @Around("pt()")
    public Object method(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //获取执行签名信息
        Signature signature = proceedingJoinPoint.getSignature();
        //通过签名获取执行类型(类名)
        System.out.println(signature.getDeclaringTypeName());
        System.out.println(signature.getDeclaringType());
        //通过签名获取执行操作名称(方法名)
        System.out.println(signature.getName());
        System.out.println("AOP环绕通知");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("AOP环绕通知");
        return proceed;
    }
}
