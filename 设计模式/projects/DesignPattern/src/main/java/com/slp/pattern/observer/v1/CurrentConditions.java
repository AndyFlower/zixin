package com.slp.pattern.observer.v1;

/**
 * 显示当前天气情况可以理解成是气象站自己的网站
 */
public class CurrentConditions {
    private float temperature;
    private float pressure;
    private float humidity;

    /**
     * 更新天气情况 是使用推送模式
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println(temperature);
        System.out.println(pressure);
        System.out.println(humidity);
    }
}
