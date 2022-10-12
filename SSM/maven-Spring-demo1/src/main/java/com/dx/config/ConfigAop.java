package com.dx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *完全使用注解开发
 * @Date: 2022/03/29/16:46
 * @Description:
 */
@Component
//开启注解扫描
@ComponentScan (basePackages={"com.dx"})
//开启AspectJ生成代理对象
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
