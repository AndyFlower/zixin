package com.slp.version1;

import com.slp.version2.inter.Calculator;
import com.slp.version2.inter.impl.MyCalculator;
import com.slp.version2.inter.impl.MyCalculator2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVersion2 {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");



    @Test
    public void test(){
        //从IOC容器获取目标对象，注意，如果想要用类型 一定要用他的接口
        Calculator myCalculator = applicationContext.getBean(Calculator.class);
        myCalculator.add(1,2);
        //细节1com.slp.version2.inter.impl.MyCalculator@1190200a
        //class com.sun.proxy.$Proxy15
        //AOP的底层就是动态代理  容器中国保存的组件是他的代理对象，$Proxy15 当然不是奔本类的类型 所以不能用本类获取
        System.out.println(myCalculator);//com.slp.version2.inter.impl.MyCalculator@1190200a
        System.out.println(myCalculator.getClass());//class com.sun.proxy.$Proxy15
    }

    @Test
    public void test2(){
        //从IOC容器获取目标对象，注意，如果想要用类型 一定要用他的接口  如果没有接口就用自己
        MyCalculator2 myCalculator = applicationContext.getBean(MyCalculator2.class);
        myCalculator.add(1,2);
        //细节1com.slp.version2.inter.impl.MyCalculator2@4d0f2471
        //class com.slp.version2.inter.impl.MyCalculator2$$EnhancerBySpringCGLIB$$2b7c9b9d
        //cglib帮我们创建好了代理对象
        System.out.println(myCalculator);//com.slp.version2.inter.impl.MyCalculator2@4d0f2471
        System.out.println(myCalculator.getClass());//class com.slp.version2.inter.impl.MyCalculator2$$EnhancerBySpringCGLIB$$2b7c9b9d

    }


    /**
     * 通知方法的执行顺序
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
     * 正常执行@Before   @After    @AfterReturning
     * 异常执行@Before @After   @AfterThrowing
     */

    /**
     * 不改变顺序的时候 以字典序为准
     * 也可以通过@Order来改变执行顺序
     * log[add]方法开始执行，用的参数列表是【[1, 2]】
     * Val[add]方法开始执行，参数是[1, 2]
     * Val[add]方法执行完成
     * Val[add]方法执行完成，返回值是3
     * log[add]方法执行完成，计算结果是【3】
     * log[add]方法执行完成
     */
    @Test
    public void test4(){
        MyCalculator2 myCalculator = applicationContext.getBean(MyCalculator2.class);
        myCalculator.add(1,2);

    }
}
