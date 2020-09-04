package com.slp.pattern.iterator;

import java.util.Iterator;

/**
 * @ClassName College
 * @Description TODO
 * @Author sanglp
 * @Date 2020/9/3 8:35
 * @Version 1.0
 **/
public interface College  {
    public String getName();
    //增加系的份上
    public void addDepartment(String name,String desc);
    //返回一个迭代器 遍历
    public Iterator createIterator();
}
