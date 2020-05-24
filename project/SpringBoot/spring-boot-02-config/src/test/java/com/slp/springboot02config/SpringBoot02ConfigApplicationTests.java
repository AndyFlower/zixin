package com.slp.springboot02config;

import com.slp.springboot02config.bean.Person;
import com.slp.springboot02config.bean.PersonPropertySource;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 可以在测试期间自动注入
 * RunWith 指定使用Spring处理器而不是junit
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    Person person;
    @Autowired
    PersonPropertySource personPropertySource;
    @Autowired
    ApplicationContext ioc ;
    @Test
    void contextLoads() {

       // System.out.println(personPropertySource);
        System.out.println(ioc.containsBean("helloService"));
    }

}
