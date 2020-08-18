package com.slp.pattern.builder.v2;

/**
 * @ClassName HighBuilding
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/18 17:03
 * @Version 1.0
 **/
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
