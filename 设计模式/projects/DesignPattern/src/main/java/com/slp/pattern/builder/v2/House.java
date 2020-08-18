package com.slp.pattern.builder.v2;

/**
 * @ClassName House
 * @Description 产品 也就是房子
 * @Author sanglp
 * @Date 2020/8/18 16:56
 * @Version 1.0
 **/
public class House {
    private String basic;
    private String wall;
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
