package com.slp.springboot04web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName MyMvcConfig
 * @Description 使用WebMvcConfigurer可以扩展SpringMvc的功能
 * @Author slp
 * @Date 2020/5/25 9:33
 * @Version 1.0
 **/

//@EnableWebMvc
@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送hello请求也来到success页面
        registry.addViewController("/slp").setViewName("success");
    }
}
