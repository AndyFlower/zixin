package com.zixin.learn.nnuo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @ClassName: JavaQueue
 * @Description: 队列：先进先出
                 JDK中提供了Queue接口，同时使得LinkedList实现了该接口（选择Linkedist实现Queue的原因在于Queue经常要进行添加和删除，linkedlist在这方面效率较高）
 * @author Administrator
 * @date 2020-03-29 21:47:09
 */
public class JavaQueue {

	
	public static void main(String[] args) {
		
			Queue<String> queue=new LinkedList<String>();
			queue.add("one");//add  添加元素
			queue.add("two");
			queue.add("three");
			queue.add("four");
			queue.add("five");
			System.out.println(queue);
			String str=queue.poll();//对象进行了出队操作，获取队列第一个元素  获取之后该元素就从队列中删除了
			System.out.println(str);
			System.out.println(queue);
			String str1=queue.peek();//指数引用队首元而不做出队操作     注意与poll的区别
			System.out.println(str1);
			while(queue.size()>0){
				String res=queue.poll();
				System.out.println(res);
			}
			System.out.println("遍历完毕，输出queue");
			System.out.println(queue);

	}

}
