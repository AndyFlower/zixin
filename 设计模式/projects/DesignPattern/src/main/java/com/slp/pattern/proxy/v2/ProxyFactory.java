package com.slp.pattern.proxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyFactory
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/24 8:45
 * @Version 1.0
 **/
public class ProxyFactory {
    //维护一个目标对象
    private Object target ;
    //构建构造器时 对target进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }


    /**
     * 给目标对象生成一个代理对象
     *     public static Object newProxyInstance(ClassLoader loader, //指定当前目标对象使用的类加载器 获取加载器的方法是固定的
     *                                           Class<?>[] interfaces,//目标对象实现的接口类型，使用泛型方式确认类型
     *                                           InvocationHandler h) //事件处理，执行目标对象的方法时会去触发事件处理器的方法，会把当前执行的目标对象方法作为一个参数传入
     * @return
     */
    public Object getProxyInstance(){
            return  Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("JDK代理开始");
                    //反射机制调用目标对象的方法
                    Object invoke = method.invoke(target,args);
                    return invoke;
                }
            });
    }

}
