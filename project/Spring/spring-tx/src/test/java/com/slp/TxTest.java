package com.slp;

import com.slp.service.BookService;
import com.slp.service.MultService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test(){
        BookService bookService = context.getBean(BookService.class);
        bookService.checkout("zhang","isbn01");;

    }

    /**
     * multc(){
     *     //Required
     *     A(){
     *          //REQUIRES_NEW
     *         B(){}
     *         //REQUIRED
     *         C(){}
     *     }
     *     //REQUIRES_NEW
     *     D(){
     *     DDDD()//REQUIRES_NEW 不崩  required崩
     *     //REQUIRED
     *         E(){
     *             //REQUIRED_NEW
     *             F(){
     *                 10/0 ；E崩 G崩 A崩 C崩
     *             }
     *         }
     *         //REQUIRED_NEW
     *         G(){}
     *
     *     }
     *
     *     int i=10/0; B成功 D成功
     *
     *     任何处崩已经执行的REQUIRES_NEW都会成功
     *
     *     如果是REQUIRED事务的属性都是继承与大事务的
     *     而REQUIRES_NEW 可以调整自己的属性
     *
     *     默认REQUIRED
     *
     *     REQUIRED:将之前事务用的connection传递给这个方法使用
     *     REQUIRES_NEW这个方法直接使用新的connection
     * }
     */
    @Test
    public void testMult(){
        MultService multService = context.getBean(MultService.class);
        multService.mulTx2();
        //如果是MulService--mulTx 调用bookService两个方法
        //BookService --mulTx --直接调用两个方法
        /**
         * MultServiceProxy.mulTx(){
         *     bookServiceProxy.checkout();//代理对象能进行事务控制
         *     bookServiceProxy.updatePrice()
         * }
         * //本类方法的嵌套调用就只是一个事务
         * MBookServiceProxy.mulTx(){
         *        checkout();//这里直接调用方法  相当于是将方法中的语句整合在一起
         *        updatePrice()
         *    }
         *
         */
    }
}
