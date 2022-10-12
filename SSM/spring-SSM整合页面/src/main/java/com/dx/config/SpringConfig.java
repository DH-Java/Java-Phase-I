package com.dx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/06/13:34
 * @Description:
 */
@Configuration
@ComponentScan("com.dx.service")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
/**
 * @Description: 事务注解
 * @Param:
 * @return:
 * @Date: 2022/10/6
 */
@EnableTransactionManagement
public class SpringConfig {
}
