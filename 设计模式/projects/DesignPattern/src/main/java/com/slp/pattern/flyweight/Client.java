package com.slp.pattern.flyweight;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("Tom");
        //创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        //客户需要一个新闻方式发布的网站
        WebSite webSite = webSiteFactory.getWebSiteCategory("新闻");
        webSite.use(user);
        user.setUserName("Jack");
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(user);
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        user.setUserName("Min");
        webSite3.use(user);
        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
