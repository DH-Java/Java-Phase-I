package com.dx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/02/21:55
 * @Description:
 */
@Configuration
@ComponentScan({"com.dx.controller","com.dx.config"})
@EnableWebMvc
public class SpringMvcConfig {

}
