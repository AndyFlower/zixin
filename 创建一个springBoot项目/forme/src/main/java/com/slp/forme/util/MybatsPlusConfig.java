package com.slp.forme.util;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName MybatsPlusConfig
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/14 14:31
 * @Version 1.0
 **/
@Configuration
@EnableTransactionManagement
public class MybatsPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
