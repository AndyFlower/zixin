package com.slp.pattern.composite;

/**
 * 抽象构建角色：定义参加组合对象的公有属性和方法，可以定义一些默认的行为或实现
 */
public  abstract class OrganizationComponent {
    private String name;//名字
    private String des ;//说明

    //默认实现
    protected  void add(OrganizationComponent  organizationComponent){
        throw  new UnsupportedOperationException();
    }

    //默认实现
    protected  void remove(OrganizationComponent  organizationComponent){
        throw  new UnsupportedOperationException();
    }

    //构造器
    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    //方法print 做成抽象的，子类都需要实现
    protected  abstract void print();
}
