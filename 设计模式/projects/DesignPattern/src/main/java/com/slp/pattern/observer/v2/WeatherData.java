package com.slp.pattern.observer.v2;

import com.slp.pattern.observer.v1.CurrentConditions;
import org.omg.CORBA.Object;

import java.util.ArrayList;

/**
 * 核心类
 * 1、包含最新的天气情况信息
 * 2.包含了观察集合，
 * 3、当数据有更新时，就遍历所有的并去通知
 */
public class WeatherData implements Observer {
    private float temperature;
    private float pressure;
    private float humodity;

    private ArrayList<CurrentConditions> observes;

    public WeatherData() {
        observes = new ArrayList<>();
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

    @Override
    public void update(float temperature, float pressure, float humodity) {

    }
}
