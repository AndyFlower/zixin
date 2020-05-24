package com.slp.springboot02config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class PersonNew {
    /**
     * <bean class="Person2">
     *     <propertu name="lastName" value="sang"></propertu>
     *     </bean>
     *     person.last-name :对应的是配置文件中的名称
     */
    @Value("person.last-name")
    private String lastName;
    @Value("#{11*2}")
    private int age;
    @Value("true")
    private Boolean boss;
    private List<Object> lists;
    private Map<String,Object> maps;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
