Given any permutation of the numbers {0, 1, 2,..., *N*−1}, it is easy to sort them in increasing order. But what if `Swap(0, *)` is the ONLY operation that is allowed to use? For example, to sort {4, 0, 2, 1, 3} we may apply the swap operations in the following way:

```
Swap(0, 1) => {4, 1, 2, 0, 3}
Swap(0, 3) => {4, 1, 2, 3, 0}
Swap(0, 4) => {0, 1, 2, 3, 4}

      
    
```

Now you are asked to find the minimum number of swaps need to sort the given permutation of the first *N* nonnegative integers.

### Input Specification:

Each input file contains one test case, which gives a positive *N* (≤105) followed by a permutation sequence of {0, 1, ..., *N*−1}. All the numbers in a line are separated by a space.

### Output Specification:

For each case, simply print in a line the minimum number of swaps need to sort the given permutation.

### Sample Input:

```in
10
3 5 7 2 6 4 9 0 8 1

      
    
```

### Sample Output:

```out
9
```

### 代码

```java
package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1067
 * @Description:  解题思路：贪心算法
 *             			  如果0在i位，则找到i将i归0  0到i目前所在的位置，  这种会有一个特殊情况就是有可能中间某一次交换0回到0位置但是还有其余数据未归位
 *             这种情况下需要0和相邻的第一个没有归位的数据进行交换 然后在继续上一次操作
 *             
 *             问题：2个超时   待改进
 * @author Administrator
 * @date 2020-04-05 14:24:08
 */
public class PATA1067 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int left = n-1;//left存放除0以外不在本位上的数的个数
		
		int [] pos  = new int [n];
		for(int i=0;i<n;i++) {
		   int  num = sc.nextInt();	
          pos[num]=i;//num所处的位置为i
          if(num==i&&num!=0) {
        	  left--;//在原位left-1
          }
		}
		sc.close();
		int ans =0;//交换次数
		int k=1;//k用于存放除0以外不在本位上的最小的数
		while(left>0) {//只要有数不在本位上
			if(pos[0]==0) {//如果0已经归位  要将0和最近的不在本位的进行交换
				while(k<n) {
					if(pos[k]!=k) {
						int temp = pos[0];
						pos[0]=pos[k];
						pos[k]=temp;
						ans++;
						break;
					}
					k++;//看k+1是否在本位
				}
			}
			while(pos[0]!=0) {//只要0不在本位  0就和当前0位置上的数的位置进行交换
				int temp=pos[0];
				pos[0]=pos[pos[0]];
				pos[temp]=temp;
				ans++;
				left--;
			}
		}

		System.out.println(ans);
	}

}

```

