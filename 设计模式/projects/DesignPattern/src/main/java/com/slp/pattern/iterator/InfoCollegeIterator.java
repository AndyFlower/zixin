package com.slp.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName InfoCollegeIterator
 * @Description TODO
 * @Author sanglp
 * @Date 2020/9/3 8:31
 * @Version 1.0
 **/
public class InfoCollegeIterator implements Iterator {
    List<Department> departments;//信息工程学院以list存放系

    int index = -1;//索引
    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size()-1){
            return false;
        }
        index +=1;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }
}
