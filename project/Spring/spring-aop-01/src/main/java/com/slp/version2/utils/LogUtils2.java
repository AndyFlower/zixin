package com.slp.version2.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogUtils2 {


    /**
     * 提取可重用的切入点表达式
     * 1.随便申明一个没有实现和返回的方法
     * 2.给方法标注@Pointcut注解
     *
     */
    @Pointcut("execution(public int com.slp.version2.inter.impl.MyCalculator2.*(int,int))")
    public void MyPoint(){

    }

    @Before(value = "MyPoint()")
    public static void logStartReference(JoinPoint jp){

    }
    /**
     * 告诉Spring每个方法都什么时候运行
     * try{
     * @Before
     *      method.invoke(obj,args)
     * @AfterReturning
     * }catch(e){
     * @AfterThrowing
     * }finally{
     * @After
     * }
     *
     * 在执行目标方法之前运行
     *
     * @Before  前置通知
     * @After 目标方法运行结束之后  后置通知
     * @AfterReturning 目标方法返回之后  返回通知
     * @AfterThrowing 目标方法抛出异常之后  异常通知
     * @Around ：环绕通知
     */

    //想在执行目标方法执行之前运行，写切入点表达式
    //execution(访问权限  返回类型  方法签名)
    @Before("execution(public int com.slp.version2.inter.impl.MyCalculator2.*(int,int))")
    public static void logStart(JoinPoint jp){
      Object[] args =   jp.getArgs();//获取目标方法运行时使用的参数
       Signature signature =  jp.getSignature();//获取方法签名
        String name = signature.getName();//方法名称
        System.out.println("log["+name+"]方法开始执行，用的参数列表是【"+ Arrays.asList(args)+"】");

    }

    /**
     *  在执行目标方法之后运行
     *
     *  在方法执行的时候拿到目标方法的详细信息
     *  1)只需要为通知方法的参数列表上写一个参数JoinPoint
     *      JoinPoint joinPoint:封装了当前目标方法的详细信息
     */
    @AfterReturning("execution(public int com.slp.version2.inter.impl.MyCalculator2.*(int,int))")
    public static void logEnd(JoinPoint jp){
        Signature signature =  jp.getSignature();//获取方法签名
        String name = signature.getName();//方法名称
        System.out.println("log["+name+"]方法执行完成");

    }

    /**
     * 高速Spring这个result用来接收返回值returning = "result"
     * @param jp
     * @param result
     */
    @AfterReturning(returning = "result",value="execution(public int com.slp.version2.inter.impl.MyCalculator2.*(int,int))")
    public static void logAfterReturning(JoinPoint jp,Object result){
        Signature signature =  jp.getSignature();//获取方法签名
        String name = signature.getName();//方法名称
        System.out.println("log["+name+"]方法执行完成，计算结果是【"+result+"】");

    }

    /**
     * 告诉Spring哪个参数来接收异常
     * throwing = "exception"
     * Spring对通知方法要求不严格
     * 唯一要求的是方法的参数列表一定不能乱写
     * 参数表上的每一个参数，Spring都得知道是什么
     * JpinPoint:Spring知道
     * 不知道的参数一定要知道
     * Exception exception:指定可以接收的异常类型  如果范围小的话 只会接收指定的异常
     * @param jp
     * @param
     */
    @AfterThrowing(throwing = "exception",value="execution(public int com.slp.version2.inter.impl.MyCalculator2.*(int,int))")
    public static void logAfterThrowing(JoinPoint jp,Exception exception){
        Signature signature =  jp.getSignature();//获取方法签名
        String name = signature.getName();//方法名称
        System.out.println("log["+name+"]方法执行完成，异常是【"+exception.getMessage()+"】");

    }

    /**
     * @Around 环绕 是Spring最强大的通知
     * @Around 环绕：动态代理
     * try{
     *     前置
     *     method.invoke
     *     返回通知
     * }catch(e){
     *     异常通知
     * }finally{
     *     后置通知
     * }
     *
     * 四合一就是环绕通知：
     * 环绕通知中有一个参数
     * 环绕通知优先于普通通知执行，执行顺序
     *  （环绕前置）    普通前置  目标方法执行  环绕正常返回/出现异常  环绕后置 普通后置  普通返回
     */

    @Around("MyPoint()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕");
        Object[] args = proceedingJoinPoint.getArgs();
        Object procees  =  proceedingJoinPoint.proceed(args);//利用反射推进目标方法运行
        return procees;
    }
}
