Shopping in Mars is quite a different experience. The Mars people pay by chained diamonds. Each diamond has a value (in Mars dollars M$). When making the payment, the chain can be cut at any position for only once and some of the diamonds are taken off the chain one by one. Once a diamond is off the chain, it cannot be taken back. For example, if we have a chain of 8 diamonds with values M$3, 2, 1, 5, 4, 6, 8, 7, and we must pay M$15. We may have 3 options:

1. Cut the chain between 4 and 6, and take off the diamonds from the position 1 to 5 (with values 3+2+1+5+4=15).
2. Cut before 5 or after 6, and take off the diamonds from the position 4 to 6 (with values 5+4+6=15).
3. Cut before 8, and take off the diamonds from the position 7 to 8 (with values 8+7=15).

Now given the chain of diamond values and the amount that a customer has to pay, you are supposed to list all the paying options for the customer.

If it is impossible to pay the exact amount, you must suggest solutions with minimum lost.

### Input Specification:

Each input file contains one test case. For each case, the first line contains 2 numbers: *N* (≤105), the total number of diamonds on the chain, and *M* (≤108), the amount that the customer has to pay. Then the next line contains *N* positive numbers *D*1⋯*D**N* (*D**i*≤103 for all *i*=1,⋯,*N*) which are the values of the diamonds. All the numbers in a line are separated by a space.

### Output Specification:

For each test case, print `i-j` in a line for each pair of `i` ≤ `j` such that *D*`i` + ... + *D*`j` = *M*. Note that if there are more than one solution, all the solutions must be printed in increasing order of `i`.

If there is no solution, output `i-j` for pairs of `i` ≤ `j` such that *D*`i` + ... + *D*`j` >*M* with (*D*`i` + ... + *D*`j` −*M*) minimized. Again all the solutions must be printed in increasing order of `i`.

It is guaranteed that the total value of diamonds is sufficient to pay the given amount.

### Sample Input 1:

```in
16 15
3 2 1 5 4 6 8 7 16 10 15 11 9 12 14 13

      
    
```

### Sample Output 1:

```out
1-5
4-6
7-8
11-11

      
    
```

### Sample Input 2:

```in
5 13
2 4 5 7 9

      
    
```

### Sample Output 2:

```out
2-4
4-5
```

### 代码

```java
package com.zixin.algorithm;

import java.util.Scanner;
/**
 * 
 * @ClassName: PATA1044
 * @Description: 思路：令sums为1到i的和  这样的话一定是单调递增的   因此计算子序列的值只需要相应位置减去即可
 *                    因为数组严格单调递增   可以用二分法来查找
 *                    枚举左端点 因为S[j]-S[i-1]=S得S[j]=S[i-1]+S 就是找第一个超过所找值的位置
 *                    不一定有正好和相同的数字 因此需要进行两次遍历  第一次找出和值   第二次进行输出  
 * @author Administrator
 * @date 2020-04-05 15:44:59
 */
public class PATA1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sum = sc.nextInt();
		int sums[]=new int [num+1];
		for(int i=1;i<=num;i++) {
			int t =sc.nextInt();
			sums[i]=sums[i-1]+t;//求出sum数组
		}
		sc.close();
		int nearS=10000000;
		for(int i=1;i<=num;i++) {//枚举左端点
			int j=firstMore(i,num+1,sums[i-1]+sum,sums);//求右端点
			if(sums[j-1]-sums[i-1]==sum) {//查找乘号
				nearS=sum;//最接近的数就是sum
				break;
			}else if(j<=num&&sums[j]-sums[i-1]<nearS) {
				nearS=sums[j]-sums[i-1];//更新nearS
			}
		}
		for(int i=1;i<=num;i++) {
			int j=firstMore(i,num+1,sums[i-1]+nearS,sums);//求右端点
			if(sums[j-1]-sums[i-1]==nearS) {//查找成功
				System.out.println(i+"-"+(j-1));//输出左端点和右端点
			}
		}
 	}
	
	static int firstMore(int L,int R,int x,int sums[]) {
		int left =L;
		int right=R;
		int mid=0;
		while(left<right) {
			mid=(left+right)/2;
			if(sums[mid]>x) {
				right=mid;
			}else {
				left=mid+1;
			}
		}
		return left;
	}
}

```

