package com.zixin.algorithm;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

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
			q.add(sc.nextInt());
		}
		
		int temp=np;
		int group=0;
		while(q.size()!=1) {
			if(temp%ng==0) {
				group=temp%ng;
			}else {
				group=temp%ng+1;
			}
			for(int i=0;i<group;i++) {
				int k= q.peek();
				for(int j=0;j<ng;j++) {
					if(i*ng+j>=temp) {
						break;
					}
					int front = q.peek();
					if(order[front].weight>order[k].weight) {
						k=front;
					}
					order[front].rank=group+1;
					q.remove();
				}
				q.add(k);
			}
			temp=group;
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