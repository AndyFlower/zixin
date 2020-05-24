package com.slp.springboot03logging;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot03LoggingApplicationTests {

    Logger log = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        //日志的级别  由低到高  可以调整输出的日志级别  日志就只会在这个级别和以后的高级别生效
        log.trace("这是trace日志");
        log.debug("这是debug日志");
        //springboot默认给我们的是info级别   如果指定了就按照指定的来 如果没指定就按照默认的方式来
        log.info("这是info日志");
        log.warn("这是warn日志");
        log.error("这是error日志");

    }

}
