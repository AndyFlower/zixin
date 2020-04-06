The magic shop in Mars is offering some magic coupons. Each coupon has an integer *N* printed on it, meaning that when you use this coupon with a product, you may get *N* times the value of that product back! What is more, the shop also offers some bonus product for free. However, if you apply a coupon with a positive *N* to this bonus product, you will have to pay the shop *N* times the value of the bonus product... but hey, magically, they have some coupons with negative *N*'s!

For example, given a set of coupons { 1 2 4 −1 }, and a set of product values { 7 6 −2 −3 } (in Mars dollars M$) where a negative value corresponds to a bonus product. You can apply coupon 3 (with *N* being 4) to product 1 (with value M$7) to get M$28 back; coupon 2 to product 2 to get M$12 back; and coupon 4 to product 4 to get M$3 back. On the other hand, if you apply coupon 3 to product 4, you will have to pay M$12 to the shop.

Each coupon and each product may be selected at most once. Your task is to get as much money back as possible.

### Input Specification:

Each input file contains one test case. For each case, the first line contains the number of coupons *N**C*, followed by a line with *N**C* coupon integers. Then the next line contains the number of products *N**P*, followed by a line with *N**P* product values. Here 1≤*N**C*,*N**P*≤105, and it is guaranteed that all the numbers will not exceed 230.

### Output Specification:

For each test case, simply print in a line the maximum amount of money you can get back.

### Sample Input:

```in
4
1 2 4 -1
4
7 6 -2 -3

      
    
```

### Sample Output:

```out
43
```

### 代码

```java
package com.zixin.algorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1037
 * @Description:  解题思路：贪心策略
 *                将元素按从小到大的顺序排序，对每一个集合按两部分正数和负数来处理， 0不考虑 因为0不影响结果对于正数肯定是大的乘以大的，
 *                对于负数肯定是小的乘以小的。  负负得正  越小的数乘积之后会越大  所以分两步从两头处理
 * @author Administrator
 * @date 2020-04-05 13:51:33
 */
public class PATA1037 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m= sc.nextInt();
		int arr2[] = new int[n];
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		int res=0;
		while( i<n&&j<m&&arr[i]<0&&arr2[j]<0) {
			res+=arr[i]*arr2[j];
			i++;j++;
		}
		i=n-1;
		j=m-1;
		while(i>=0&&j>=0&&arr[i]>0&&arr2[j]>0) {
			res+=arr[i]*arr2[j];
			i--;
			j--;
		}
		System.out.println(res);
       
	}

}

```

