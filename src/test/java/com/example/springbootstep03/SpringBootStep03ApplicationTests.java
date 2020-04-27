package com.example.springbootstep03;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootStep03ApplicationTests {
    Logger logger = LoggerFactory.getLogger(SpringBootStep03ApplicationTests.class);
    @Test
    void contextLoads() {
        //日志的级别
        //由低到高trace<debug<info<warn<error
        //可以调整日志级别，日志就只会在这个级别以后的高级别生效
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //springboot默认配置级别为info
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }

}
