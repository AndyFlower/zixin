package com.slp.pattern.flyweight;

public class ConcreteWebSite  extends WebSite{
    //网站发布类型  共享的部分 是内部状态
    private String type = "";

    //构造器 创建网站的时候需要将类型传进来
    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getUserName()+"网站的发布形式为："+type);
    }
}
