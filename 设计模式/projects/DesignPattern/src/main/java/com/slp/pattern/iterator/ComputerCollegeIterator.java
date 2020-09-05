package com.slp.pattern.iterator;

import java.util.Iterator;

/**
 * @ClassName ComputerCollegeIterator
 * @Description TODO
 * @Author sanglp
 * @Date 2020/9/3 8:25
 * @Version 1.0
 **/
public class ComputerCollegeIterator implements Iterator {
    //这里我们需要知道Department是以怎样的方式存储
    Department[] departments;
    int position = 0;//遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个
    @Override
    public boolean hasNext() {
        if(position>=departments.length||departments[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departments[position++];
    }

    @Override
    public void remove() {

    }
}
