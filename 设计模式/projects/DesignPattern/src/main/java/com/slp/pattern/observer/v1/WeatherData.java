package com.slp.pattern.observer.v1;

/**
 * 核心类
 * 1、包含最新的天气情况信息
 * 2.包含了CurrentCondition对象，
 * 3、当数据有更新时，就主动的调用current的update方法
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humodity;

    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumodity() {
        return humodity;
    }

    public void setHumodity(float humodity) {
        this.humodity = humodity;
    }

    public CurrentConditions getCurrentConditions() {
        return currentConditions;
    }

    public void setCurrentConditions(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public void dataChange(){
       //调用接入方的update进行推送
        currentConditions.update(getTemperature(),getPressure(),getHumodity());
    }

    /**
     * 数据有更新的时候就调用setData对象
     * @param temperature
     * @param pressure
     * @param humodity
     */
    public void setData(float temperature,float pressure,float humodity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humodity=humodity;
        dataChange();
    }

}
