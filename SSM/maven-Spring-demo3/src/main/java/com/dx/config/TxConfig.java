package com.dx.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.dx.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/07/17:23
 * @Description:完全注解配置类
 */
@Configuration//配置类
@ComponentScan(basePackages = "com.dx")//组件扫描
@EnableTransactionManagement//开启事务
public class TxConfig {
    @Bean
    public AccountService getAccountService(){
        AccountService accountService = new AccountService();
        return accountService;
    }
    @Bean
    public DataSource getDruidDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
        dataSource.setUsername("root");
        dataSource.setPassword("020903");
        return dataSource;
    }
    @Bean
    public JdbcTemplate getjdbcTemplate(DataSource dataSource){
        //到ioc容器种根据类型找到dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        //注入dataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
