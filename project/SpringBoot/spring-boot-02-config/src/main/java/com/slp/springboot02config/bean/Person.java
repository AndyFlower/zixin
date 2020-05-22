package com.slp.springboot02config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ClassName Person
 * @Description 将配置文件中配置的每一个属性的值，映射到这个组件中
 * ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中的相关的配置进行绑定；
 * prefis = "person":配置文件中哪个下面的所有属性一一映射
 *
 * 只有这个组价是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
 * @Author zixin
 * @Date 2020/5/22 17:42
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private int age;
    private Boolean boss;
    private List<Object> lists;
    private Map<String,Object> maps;
    private Dog dog;

}
