package com.slp.version1.utils;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogUtils {

    public static void logStart(Method method,Object... args){
        System.out.println("["+method.getName()+"]方法开始执行，用的参数列表是【"+ Arrays.toString(args));

    }
    public static void logEnd(Method method,Object invoke){
        System.out.println("["+method.getName()+"]方法执行完成，计算结果是【"+ invoke+"】");

    }
}
