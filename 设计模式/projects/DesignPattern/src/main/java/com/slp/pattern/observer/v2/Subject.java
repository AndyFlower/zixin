package com.slp.pattern.observer.v2;

/**
 * 接口 让weatherdata来实现
 */
public interface Subject {
    public void  registerObserver(Observer o);
    public void  removeObserver(Observer o);
    public void  notifyObservers();
}
