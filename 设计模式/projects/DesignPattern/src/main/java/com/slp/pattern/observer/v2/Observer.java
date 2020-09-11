package com.slp.pattern.observer.v2;

/**
 * 观察者的接口 由观察者来实现
 */
public interface Observer {
    public void update(float temperature,float pressure,float humodity);

}
