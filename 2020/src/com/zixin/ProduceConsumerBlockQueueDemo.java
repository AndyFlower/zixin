package com.zixin;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

class MyData{
    Logger logger= Logger.getLogger(MyData.class.getName());
    private volatile boolean FLAG = true;//默认开启 进行生产消费

    private AtomicInteger atomicInteger = new AtomicInteger();

    BlockingQueue<String> blockingQueue = null;

    public MyData(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
        System.out.println(blockingQueue.getClass().getName());
    }

    public  void myProduct() throws Exception{
        String data = null ;
        boolean returnval;
        while (FLAG){
            data = atomicInteger.incrementAndGet()+"";
            returnval = blockingQueue.offer(data,2L, TimeUnit.SECONDS);
            if(returnval){
                logger.info(Thread.currentThread().getName()+" 插入队列"+data+"成功");
               // System.out.println(Thread.currentThread().getName()+" 插入队列"+data+"成功");
            }else {
                logger.info(Thread.currentThread().getName()+" 插入队列"+data+"失败");
                //System.out.println(Thread.currentThread().getName()+" 插入队列"+data+"失败");
            }
            TimeUnit.SECONDS.sleep(1);

        }
        //System.out.println(Thread.currentThread().getName()+"叫停 FLAG=FALSE");
        logger.info(Thread.currentThread().getName()+"叫停 FLAG=FALSE");
    }

    public void myConsum()throws Exception{
        String result = null;
        while (FLAG){
            result =  blockingQueue.poll(2L,TimeUnit.SECONDS);
            if(null == result||result.equalsIgnoreCase("")){
                FLAG=false;
                //System.out.println(Thread.currentThread().getName()+"超过2秒没有取到数据，消费退出");
                logger.info(Thread.currentThread().getName()+"超过2秒没有取到数据，消费退出");
                //System.out.println();
                //System.out.println();
                return;
            }

            logger.info(Thread.currentThread().getName()+" 消费队列"+result+"成功");
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public void stop(){
        this.FLAG=false;
    }


}
/**
 * @ClassName ProduceConsumerBlockQueueDemo
 * @Description
 * @Author zixin
 * @Date 2019/12/31 11:44
 * @Version 1.0
 **/
public class ProduceConsumerBlockQueueDemo {

    public static void main(String[] args) {
        MyData data = new MyData(new ArrayBlockingQueue<>(10));
        new Thread(()->{

            System.out.println(Thread.currentThread().getName()+"生产线程启动");
            try {
                data.myProduct();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"Product").start();

        new Thread(()->{

            System.out.println(Thread.currentThread().getName()+"消费线程启动");
            try {
                data.myConsum();
                System.out.println();
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"Consume").start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Thread.currentThread().getName()+"叫停");
        data.stop();
    }

}
