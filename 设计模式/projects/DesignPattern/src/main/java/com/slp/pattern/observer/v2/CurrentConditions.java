package com.slp.pattern.observer.v2;

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
