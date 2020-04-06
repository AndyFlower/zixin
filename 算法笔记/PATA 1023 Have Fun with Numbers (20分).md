Notice that the number 123456789 is a 9-digit number consisting exactly the numbers from 1 to 9, with no duplication. Double it we will obtain 246913578, which happens to be another 9-digit number consisting exactly the numbers from 1 to 9, only in a different permutation. Check to see the result if we double it again!

Now you are suppose to check if there are more numbers with this property. That is, double a given number with *k* digits, you are to tell if the resulting number consists of only a permutation of the digits in the original number.

### Input Specification:

Each input contains one test case. Each case contains one positive integer with no more than 20 digits.

### Output Specification:

For each test case, first print in a line "Yes" if doubling the input number gives a number that consists of only a permutation of the digits in the original number, or "No" if not. Then in the next line, print the doubled number.

### Sample Input:

```in
1234567899

      
    
```

### Sample Output:

```out
Yes
2469135798
```

### 代码

```java
package com.zixin.algorithm;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * 
 * @ClassName: PATA1023
 * @Description: 以字符串读入  然后开一个数组 记录0-9每一个出现的次数
 *               乘以2的结果  如果长度不同则不用继续   
 *               长度相同  遍历第二个 出现了则-1   最后遍历数组 ，如果都是0说明是成立的  反之则不成立
 *               2  5 输出答案错误  还没找到问题在哪
 *               
 * @author Administrator
 * @date 2020-04-06 12:19:41
 */
public class PATA1023 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int [] arr= new int[10];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'0']++;
		}
		String ne = new BigInteger(s).multiply(new BigInteger("2")).toString();
		if(s.length()!=ne.length()) {
			System.out.println("No");
			System.out.println(ne);
		}else {
			for(int i=0;i<ne.length();i++) {
				arr[ne.charAt(i)-'0']--;
			}
		}
		boolean flag = true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println("No");
				System.out.println(ne);
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Yes");
			System.out.println(ne);
		}
		

	}

}

```

### 代码

```java
package com.zixin.algorithm;

import java.math.BigInteger;
import java.util.Scanner;

public class PATA1024 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int step = sc.nextInt();
     sc.close();
      int k=0;
      char [] a = s.toCharArray();
      while(k<step&&!judge(a)) {
    	 s= new BigInteger(s).add(new BigInteger(new StringBuilder(s).reverse().toString())).toString();
    	// System.out.println(s);
    	 a=s.toCharArray();
    	 k++;
      }
      for(int i=0;i<a.length;i++) {
    	  System.out.print(a[i]-'0');
      }
      System.out.println();
      System.out.println(k);
		
	}

	/**
	 * 
	 * @Title: judge
	 * @Description: 判断是否是回文串
	 * @author Administrator
	 * @date 2020-04-06 12:39:54
	 * @param @param arr
	 * @param @return 参数
	 * @return boolean 返回类型
	 * @throws
	 */
	static boolean   judge(char[] arr) {
		for(int i=0;i<=arr.length/2;i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				return false;
			}
		}
		return true;
	}
}

```

### 提交

![PATA1024提交](image\PATA1024提交.png)