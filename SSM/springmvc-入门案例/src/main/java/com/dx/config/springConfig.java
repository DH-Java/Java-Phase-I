package com.dx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/02/20:43
 * @Description:
 */
@Configuration
//扫描所以包，出来带有controller注解的类
@ComponentScan(value = "com.dx" ,excludeFilters =@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class))
public class springConfig {
}
