**Mice and Rice** is the name of a programming contest in which each programmer must write a piece of code to control the movements of a mouse in a given map. The goal of each mouse is to eat as much rice as possible in order to become a FatMouse.

First the playing order is randomly decided for *N**P* programmers. Then every *N**G* programmers are grouped in a match. The fattest mouse in a group wins and enters the next turn. All the losers in this turn are ranked the same. Every *N**G* winners are then grouped in the next match until a final winner is determined.

For the sake of simplicity, assume that the weight of each mouse is fixed once the programmer submits his/her code. Given the weights of all the mice and the initial playing order, you are supposed to output the ranks for the programmers.

### Input Specification:

Each input file contains one test case. For each case, the first line contains 2 positive integers: *N**P* and *N**G* (≤1000), the number of programmers and the maximum number of mice in a group, respectively. If there are less than *N**G* mice at the end of the player's list, then all the mice left will be put into the last group. The second line contains *N**P* distinct non-negative numbers *W**i* (*i*=0,⋯,*N**P*−1) where each *W**i* is the weight of the *i*-th mouse respectively. The third line gives the initial playing order which is a permutation of 0,⋯,*N**P*−1 (assume that the programmers are numbered from 0 to *N**P*−1). All the numbers in a line are separated by a space.

### Output Specification:

For each test case, print the final ranks in a line. The *i*-th number is the rank of the *i*-th programmer, and all the numbers must be separated by a space, with no extra space at the end of the line.

### Sample Input:

```in
11 3
25 18 0 46 37 3 19 22 57 56 10
6 0 8 7 10 5 9 1 4 2 3

      
    
```

### Sample Output:

```out
5 5 5 2 5 5 5 3 1 3 5
```



### 题意

给出NP只老鼠的质量，并给出他们的初始顺序，按这些顺序把老鼠按每NG只分为一组，最后剩的也单独作为一组，对每组老鼠，选出质量最大的一只晋级，这样晋级的数量等于分组数量，对于这些晋级的再按照每NG只一组进行比较，选出最大的晋级，。直到最后只剩下一只老鼠，把这些老鼠的排名按照原顺序输出。

### 代码

```java
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
```

### 提交

![PATA1056提交-21分](image\PATA1056提交-21分.png)