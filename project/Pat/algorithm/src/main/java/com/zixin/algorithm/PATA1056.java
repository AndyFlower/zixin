package com.zixin.algorithm;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * 
 * @ClassName:  PATA1056   
 * @Description:
 * 				思路：
 * 					1、开一个结构体mouse 记录老鼠的质量和排名   定义一个队列，用来在算法过程中按顺序处理每轮的老鼠
 * 					2、分成group组 当前参加的有temp只  
 * 					3、每组晋级一只  因此当前轮晋级的总老鼠数等于group,且改轮未晋级的排名为group+!
 * 				问题：最后两个测试店超时
 * @author: Sanglp
 * @date:   2020年4月7日 上午9:14:56      
 * @Copyright:
 * 
 */
public class PATA1056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int np = sc.nextInt();
		int ng = sc.nextInt();
		Mouse[] order = new Mouse[np];
		for(int i=0;i<np;i++) {
			Mouse m = new Mouse();
			m.weight=sc.nextInt();
			order[i]=m;
					
		}
		Queue<Integer> q =new LinkedBlockingQueue<Integer>();
		for(int i=0;i<np;i++) {
			int s = sc.nextInt();
			//System.out.println(s);
			q.add(s);
		}
		
		sc.close();
		int temp=np;
		int group=0;
		while(q.size()!=1) {
			if(temp%ng==0) {
				group=temp/ng;
			}else {
				group=temp/ng+1;
			}
			for(int i=0;i<group;i++) {
				int k= q.peek();
				for(int j=0;j<ng;j++) {
					if(i*ng+j>=temp) {
						break;
					}
					int front = q.peek();
					if(order[front].weight>order[k].weight) {
						k=front;//找出质量最大的
					}
					order[front].rank=group+1;//未晋级的排名为group+!
					q.remove();//处理过的从队列中移除
				}
				q.add(k);//将最大的重新添加到队尾
			}
			temp=group;//group只老鼠晋级 因此下一次需要处理的老鼠的数量是group
		}
		order[q.peek()].rank=1;
		for(int i=0;i<np;i++) {
			System.out.print(order[i].rank);
			if(i<np-1) {
				System.out.print(" ");
			}
		}
	}
	
}

class Mouse{
	int weight;
	int rank;
}