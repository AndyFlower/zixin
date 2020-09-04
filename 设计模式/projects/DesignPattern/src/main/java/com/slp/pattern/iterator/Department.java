package com.slp.pattern.iterator;

/**
 * @ClassName Department
 * @Description TODO
 * @Author sanglp
 * @Date 2020/9/3 8:23
 * @Version 1.0
 **/
public class Department {
    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
