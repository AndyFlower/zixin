package com.slp.pattern.facade;

/**
 * @ClassName Client
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/21 8:29
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
