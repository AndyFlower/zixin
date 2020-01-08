## CountDownLatch

做减法

```
package com.zixin;


public enum CountryEnum {
    ONE(1,"齐"),
    TWO(2,"楚"),
    THREE(3,"燕"),
    FOUR(4,"韩"),
    FIVE(5,"赵"),
    SIX(6,"魏"),
    SEVEN(7,"秦");


    private Integer retCode;
    private String retMessage;

    public Integer getRetCode() {
        return retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    CountryEnum(Integer retCode, String retMessage) {
        this.retCode = retCode;
        this.retMessage = retMessage;
    }

    public static CountryEnum forEach(int index){
        CountryEnum[] myArray = CountryEnum.values();
        for (CountryEnum element:myArray) {
            if(index ==element.retCode){
                return element;
            }
        }
        return null;
    }
}

```
```

package com.zixin;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountDownLatchDemo
 * @Description CountDownLatch
 * @Author zishen
 * @Date 2019/12/30 13:17
 * @Version 1.0
 **/
public class CountDownLatchDemo {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for(int i=1;i<=6;i++){

            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"国，被灭");
                countDownLatch.countDown();
            },CountryEnum.forEach(i).getRetMessage()).start();
        }
        try {
            //Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted.
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" 一统华夏");
    }

    public static void countDown(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for(int i=1;i<=6;i++){

            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"购物完成，离开商城");
                countDownLatch.countDown();
            },String.valueOf(i)).start();
        }
        try {
            //Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted.
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" 商城关门");
    }

}

```

## CyclicBarrier

做加法

可循环使用的屏障，它要做的事情是让一组线程到达一个屏障时被阻塞，直到最后一个线程到达屏障时，屏障才会开门，所有被屏障拦截的线程才能继续执行，线程进入屏障通过CyclicBarrier的await()方法。

```
package com.zixin;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName CyclicBarrierDemo
 * @Description CyclicBarrier
 * @Author zishen
 * @Date 2019/12/30 13:42
 * @Version 1.0
 **/
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("召唤神龙");

        });

        for(int i=1;i<=7;i++){

            final int tempInt = i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"收集到第："+tempInt+"龙珠");
                try {
                    //Waits until all parties have invoked await on this barrier.
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            },String.valueOf(i)).start();
        }
    }

}

```

## Semaphore

信号量主要用于两个目的，一个是用于多个共享资源的互斥使用，另一个用于并发线程数的控制。

```
package com.zixin;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName SemaphoreDemo
 * @Description Semaphore
 * @Author zixin
 * @Date 2019/12/30 13:51
 * @Version 1.0
 **/
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i <6 ; i++) {
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"获得机会");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(Thread.currentThread().getName()+"释放机会");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            },String.valueOf(i)).start();
        }
    }

}

```