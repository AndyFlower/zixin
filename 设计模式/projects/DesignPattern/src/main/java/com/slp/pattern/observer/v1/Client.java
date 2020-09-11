package com.slp.pattern.observer.v1;

public class Client {
    public static void main(String[] args) {
        //创建接入方CurrentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        //创建weatherData
        WeatherData weatherData = new WeatherData(currentConditions);
        //更新天气情况
        weatherData.setData(30,150,20);
        System.out.println("天气发生变化");
        weatherData.setData(40,160,30);
    }
}
