package com.slp.pattern.builder.v2;

/**
 * @ClassName CommonHouse
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/18 17:02
 * @Version 1.0
 **/
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
