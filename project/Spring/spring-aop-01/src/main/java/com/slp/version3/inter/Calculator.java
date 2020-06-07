package com.slp.version3.inter;

/**
 * 接口不加在容器中
 * 实际上可以加；加了也不创建，只要一个组件是一个接口相当于告诉Spring ioc容器中可能有这种类型的组件
 */
public interface Calculator {
    public int add(int i,int j);
    public int sub(int i,int j);
}
