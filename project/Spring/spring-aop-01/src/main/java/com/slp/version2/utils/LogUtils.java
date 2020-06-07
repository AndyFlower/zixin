package com.slp.version2.utils;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogUtils {

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
    @Before("execution(public int com.slp.version2.inter.impl.MyCalculator.*(int,int))")
    public static void logStart(){
        System.out.println("[]方法开始执行，用的参数列表是【");

    }

    /**
     *  在执行目标方法之后运行
     *  切入点表达式的写法：
     *  固定格式：execution（访问权限符  返回值类型  方法全类名（参数表））
     *  通配符：
     *  *：匹配一个或多个字符  execution(public int com.slp.version2.inter.impl.My*.*(int,int))
     *      匹配任意一个参数  第一个是int  第二个是任意，且只有两个参数
     *              execution(public int com.slp.version2.inter.impl.My*.*(int,*))
     *      *放在路径上只能匹配一层
     *      *不能放在权限的位置 权限位置不写public可选
     *  .. :匹配任意多个参数，任意类型 execution(public int com.slp.version2.inter.impl.My*.*(..))
     *      匹配任意多层路径 execution(public int com.slp..MyCalculator.*(int,int))
     *
     *  记住两种：
     *      最精确的 execution(public int com.slp.version2.inter.impl.MyCalculator.add(int,int))
     *      最模糊的execution(* *(..)) 不要这样写
     *
     *  &&  ||   |
     *   && :我们切入的位置满足这两个表达式
     *   ||：满足任意一个表达式即可
     *   |：不满足的都切
     */
    @AfterReturning("execution(public int com.slp.version2.inter.impl.MyCalculator.*(int,int))")
    public static void logEnd(){
        System.out.println("[]方法执行完成，计算结果是【】");

    }
}
