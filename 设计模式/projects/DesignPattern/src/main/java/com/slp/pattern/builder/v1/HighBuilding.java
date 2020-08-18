package com.slp.pattern.builder.v1;

/**
 * @ClassName SuperbHouse
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/18 14:20
 * @Version 1.0
 **/
public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("豪华房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("豪华房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("豪华房子封顶");
    }
}
