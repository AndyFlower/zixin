package com.slp.pattern.builder.v2;

/**
 * @ClassName HouseBuilder
 * @Description 抽象建造者
 * @Author sanglp
 * @Date 2020/8/18 16:56
 * @Version 1.0
 **/
public abstract class HouseBuilder {
    protected House house = new House();
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    //建造房子  建好之后将产品也就是房子返回
    public House buildHouse(){
        return house;
    }
}
