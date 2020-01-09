package com.zixin.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author zishen
 * @Date 2020/1/9 17:45
 * @Version 1.0
 **/
public class Test1 {

    static class OOMObject{

    }
    public static void main(String[] args) {

        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
