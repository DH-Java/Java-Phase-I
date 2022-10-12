package com.example.SpringBoot;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 67636
 */
@Slf4j
@SpringBootApplication
public class SpringBootIniApplication {
    /**
     * @Description: 声明日志记录器
     * @Param:
     * @return:
     * @Date: 2022/10/11
     */
    static Logger logger = LoggerFactory.getLogger(SpringBootIniApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootIniApplication.class, args);
        logger.trace("跟踪");
        logger.debug("调试");
        //springboot默认日志级别就是INFO
        logger.info("信息");
        logger.warn("警告");
        logger.error("异常");
    }



}
