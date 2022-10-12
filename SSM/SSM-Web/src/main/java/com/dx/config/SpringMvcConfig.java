package com.dx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/06/13:47
 * @Description:
 */
@Configuration
@ComponentScan({"com.dx.controller","com.dx.config"})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {



}
