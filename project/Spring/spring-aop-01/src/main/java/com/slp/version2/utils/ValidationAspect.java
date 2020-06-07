package com.slp.version2.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class ValidationAspect {

    @Before("com.slp.version2.utils.LogUtils2.MyPoint()")
    public  void logStart(JoinPoint joinPoint){

        Object[] args=joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        String name=signature.getName();
        System.out.println("Val["+name+"]方法开始执行，参数是"+ Arrays.toString(args));

    }

    @AfterReturning(value="com.slp.version2.utils.LogUtils2.MyPoint()",returning = "result")
    public  void logReturn(JoinPoint joinPoint,Object result){

        Object[] args=joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        String name=signature.getName();
        System.out.println("Val["+name+"]方法执行完成，返回值是"+result);

    }
    @AfterThrowing(value = "com.slp.version2.utils.LogUtils2.MyPoint()",throwing = "e")
    public  void logException(JoinPoint joinPoint,Exception e){

        Object[] args=joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        String name=signature.getName();
        System.out.println("Val["+name+"]方法执行完成，异常是是"+e.getMessage());

    }

    @After("com.slp.version2.utils.LogUtils2.MyPoint()")
    public  void logEnd(JoinPoint joinPoint){
        Object[] args=joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        String name=signature.getName();
        System.out.println("Val["+name+"]方法执行完成");

    }
}
