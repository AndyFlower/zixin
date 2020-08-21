package com.slp.pattern.facade;

/**
 * @ClassName HomeTheaterFacade
 * @Description 门面类
 * @Author sanglp
 * @Date 2020/8/21 8:29
 * @Version 1.0
 **/
public class HomeTheaterFacade {
    //定义各个子系统的对象
    private TheaterLight theaterLight;
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Stereo stereo;
    private Screen screen;

    //构造器
    public HomeTheaterFacade(TheaterLight theaterLight, DVDPlayer dvdPlayer, Popcorn popcorn, Projector projector, Stereo stereo, Screen screen) {
        this.theaterLight = theaterLight;
        this.dvdPlayer = dvdPlayer;
        this.popcorn = popcorn;
        this.projector = projector;
        this.stereo = stereo;
        this.screen = screen;
    }

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.stereo = Stereo.getInstance();
        this.screen = Screen.getInstance();
    }
    //操作分为四步
    public void ready(){
        popcorn.on();
        popcorn.off();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        screen.up();
        projector.off();
        theaterLight.bright();
        stereo.off();
        dvdPlayer.off();

    }
    public static void main(String[] args) {

    }
}
