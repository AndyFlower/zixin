package com.zixin;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class Data{//Data.java ===> Data.class===>JVM字节码
    /*主内存设置默认为0*/
    //1.1 不添加volatile 一直卡在main处 因为虽然修改了但是没人通知main
    //1.2 添加volatile关键字之后 就可以验证我们的要求
    volatile int number =0;
    public void add(){
        this.number = 10;
    }

    //注意 此时number前面加了volatile关键字的 volatile不保证原子性
    public void addPlus(){
        number++;
    }

    //注意 此时number前面加了volatile关键字的 volatile不保证原子性但是加了synchronized就可以保证
    public synchronized void addPlusSyn(){
        number++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();

    public void atomicAdd(){
        atomicInteger.getAndIncrement();
    }
}

/**
 *1、验证volatile的可见性
 * 1.1 加入int number=0; number变量之前没有添加volatile关键字修饰
 * 1.2 添加了volatile可以解决可见性问题
 *
 * 2、验证volatile不保证原子性
 *  2.1原子性指的是什么
 *     不可分割，完整性，也就是某个现场正在做某个业务时，中间不允许插队或分割，需要整体完整要么同时成功，要么同时失败。可以参考数据库中的原子性来理解。
 *  2.2 volatile不保证原子性验证
 *
 *  2.3 字节码解释原因
 *
 *  2.4 如果解决
 *     2.4.1 加sync
 *     2.4.2 使用juc下的Atomic
 */
public class VolatileDemo {

    /**
     * volatile可以保证可见性，及时通知其他线程，主物理内存的值已经被修改
     * @param args
     */
    public static void verifySee(String[] args) {
        Data data = new Data();
        new Thread(()->{
           System.out.println(Thread.currentThread().getName()+"\t come in");
            try {
                //暂停一会线程
                TimeUnit.SECONDS.sleep(3);
                data.add();
                System.out.println(Thread.currentThread().getName()+": upate number value"+data.number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"ZISHEN").start();

        //第二个就是我们的main线程
        while(data.number==0){
          //main线程一直等待，直到number值不再等于0
        }

        System.out.println(Thread.currentThread().getName()+"\t mission is over");
    }


    public static void main(String[] args) {
        Data data = new Data();
        for(int i=0;i<20;i++){
            new Thread(()->{
                for(int j=0;j<100000;j++){
                    data.addPlus();
                    //data.addPlusSyn();
                    data.atomicAdd();
                }
            },String.valueOf(i)).start();

        }
        //需要等待上面20个线程都执行完成之后，再用main线程取得最终的值
        //为啥是2 一个main 一个GC 所以最少是2
        while(Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"int type,finally number value "+data.number);
        System.out.println(Thread.currentThread().getName()+"atomicinteger type,finally number value "+data.atomicInteger);

    }
}
