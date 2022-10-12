package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication

//配置文件读取，优先级第二低
@PropertySource("classpath:appSource.properties")
public class Application {

    public static void main(String[] args) throws IOException {

        SpringApplication app = new SpringApplication(Application.class);

        //创建properties对象
        Properties properties = new Properties();

        //通过当前类的ClassLoader
        InputStream is = Application.class.getClassLoader().getResourceAsStream("app.properties");

        //将输入流读取成properties
        properties.load(is);

        //配置文件读取，优先级最低
        app.setDefaultProperties(properties);

        app.run(args);
    }

}
