package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class PATA1097 {

	static int MAXN=100005;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int head = sc.nextInt();
		int num  =sc.nextInt();
		Node97[]  arr = new Node97[MAXN];
		//for(int i=0;i<100005;i++) {
			//Node97 node = new Node97();
			//node.flag=MAXN*2;
			//arr[i]=node;
		//}
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		for(int i=0;i<num;i++) {
			Node97 node = new Node97();
			int address = sc.nextInt();
			node.address=address;
			int data = sc.nextInt();
			node.data=data;
			int next = sc.nextInt();
			node.next=next;
			arr[address]=node;
		}
		sc.close();
		int p=head;
		int countValid =0;
		int countRemoved=0;
		while(p!=-1) {
			int data = arr[p].data;
			if(!map.containsKey(Math.abs(data))) {
				arr[p].flag=countValid++;
				map.put(Math.abs(data), Math.abs(data));
			}else {
				arr[p].flag=MAXN+countRemoved++;
				
			}
			p=arr[p].next;
		}
		Arrays.sort(arr, new Compa97());
		int count = countValid+countRemoved;
		for(int i=0;i<count;i++) {
			if(i!=countValid-1&&i!=count-1) {
				System.out.printf("%05d %d %05d\n",arr[i].address,arr[i].data,arr[i+1].address);
			}else {
				System.out.printf("%05d %d -1\n",arr[i].address,arr[i].data);
			}
		}
		
	}

}

class Node97{
	int address;
	int data;
	int next;
	int flag;//有效1  无效2   无效节点3
}


class Compa97 implements Comparator<Node97> {

	@Override
	public int compare(Node97 o1, Node97 o2) {
		if(null==o1) {
			o1 = new Node97();
			o1.flag=200010;
		}
		if(null==o2) {
			o2 = new Node97();
			o2.flag=200010;
		}
		return o1.flag-o2.flag;
	}

}