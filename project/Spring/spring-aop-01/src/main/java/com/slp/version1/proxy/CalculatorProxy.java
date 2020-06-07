package com.slp.version1.proxy;

import com.slp.version1.inter.Calculator;
import com.slp.version1.utils.LogUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 */
public class CalculatorProxy {
    /**
     *
     * @param calculator  被代理对象
     * @return 返回的是代理对象
     */
    public static Calculator getProxy(final Calculator calculator){
        //执行器  帮助目标对象执行目标方法
        InvocationHandler h = new InvocationHandler() {
            /**
             *
             * @param proxy  代理对象 给jdk使用，任何时候都不要动这个对象
             * @param method  我们当前将要执行的目标对象的方法
             * @param args  方法调用是外界传入的参数值
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //利用反射执行目标方法
                //目标方法执行后的返回值
               // System.out.println("["+method.getName()+"]方法开始执行，用的参数列表是【"+ Arrays.toString(args));
                LogUtils.logStart(method,args);
               Object  invoke = method.invoke(calculator,args);
                LogUtils.logEnd(method,invoke);
                //System.out.println("["+method.getName()+"]方法执行完成，计算结果是【"+ invoke);
                //返回值必须返回出去外界才能拿到
                return invoke;
            }
        };
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        ClassLoader loader =calculator.getClass().getClassLoader();
        return (Calculator) Proxy.newProxyInstance(loader,interfaces,h);
    }
}
