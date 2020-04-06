package com.zixin.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class PATA1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();//最大容量
		int n=sc.nextInt();//几个数
		int k=sc.nextInt();//几个例子
		Stack<Integer> stack= new Stack<Integer>();
		int arr [] = new int[n+1];//
		for(int i=0;i<k;i++) {
			while(!stack.isEmpty()) {
				stack.pop();//如果栈不空  清空栈
			}
			for(int j=1;j<=n;j++) {
				arr[j]=sc.nextInt();//读入数据
			}
			int  current=1;//指向出栈元素的待出栈元素 
			boolean flag = true;
			for(int m1=1;m1<=n;m1++) {
				stack.push(m1);
				if (stack.size() > m) {//容量超过 则No
					flag = false;
					break;
				}
				while(!stack.isEmpty()&&stack.peek()==arr[current]) {//不为空   且栈顶元素是待出栈元素
					stack.pop();//出栈
					current++;
				}
			}
			
			if(stack.isEmpty()&& flag) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

}
