package com.slp.pattern.builder.v1;

/**
 * @ClassName CommonHouse
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/18 14:18
 * @Version 1.0
 **/
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房屋打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房屋砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房屋封顶");
    }
}
