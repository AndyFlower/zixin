package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @ClassName:  PATA1032   
 * @Description:最后一个点超时   
 * @author: Sanglp
 * @date:   2020年4月7日 上午9:52:24      
 * @Copyright:
 */
public class PATA1032 {
static int maxN = 100010;
	public static void main(String[] args) {
		Node32[] node = new Node32[maxN];
		Scanner sc = new Scanner(System.in);

		int s1 = sc.nextInt();//链表首地址
		int s2=sc.nextInt();//链表首地址
		int n=sc.nextInt();
		int address,next;//地址和下一个节点的位置
		String data;//数据
		for(int i=0;i<n;i++) {
			address = sc.nextInt();
			data=sc.next();
			next = sc.nextInt();
			Node32 no = new Node32();
			no.data=data;
			no.next=next;
			node[address]=no;
		}
		sc.close();
		int p=0;
		for( p =s1;p!=-1;p=node[p].next) {
			node[p].flag=true;
		}
		for( p=s2;p!=-1;p=node[p].next) {
			if(node[p].flag) {
				break;//找到第一个已经在第一条链表中出现的节点
			}
			
		}
		if(p!=-1) {
			System.out.printf("%05d",p);
		}else {
			System.out.println("-1");
		}
	}

}

class Node32{
	String data;
	int next;
	boolean flag;
}