package com.slp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序，说明这是一个springboot程序
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    /**
     * 启动程序
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
