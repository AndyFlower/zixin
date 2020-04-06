A **reversible prime** in any number system is a prime whose "reverse" in that number system is also a prime. For example in the decimal system 73 is a reversible prime because its reverse 37 is also a prime.

Now given any two positive integers *N* (<105) and *D* (1<*D*≤10), you are supposed to tell if *N* is a reversible prime with radix *D*.

### Input Specification:

The input file consists of several test cases. Each case occupies a line which contains two integers *N* and *D*. The input is finished by a negative *N*.

### Output Specification:

For each test case, print in one line `Yes` if *N* is a reversible prime with radix *D*, or `No` if not.

### Sample Input:

```in
73 10
23 2
23 10
-2

      
    
```

### Sample Output:

```out
Yes
Yes
No

      
    
```

作者: CHEN, Yue

单位: 浙江大学

时间限制: 400 ms

内存限制: 64 MB

代码长度限制: 16 KB

### 代码

```java
package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1015
 * @Description: 这个题的重点是进制转换和素数的判断
 * @author Administrator
 * @date 2020-04-05 23:38:49
 */
public class PATA1015 {

	public static void main(String[] args) {
		int[] arr = new int[111];
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n < 0) {
				break;
			}
			int r = sc.nextInt();
			if (isPrim(n) == false) {
				System.out.println("No");
			} else {
				int len = 0;
				do {
					arr[len++] = n % r;
					n = n / r;
				} while (n != 0);
				for (int i = 0; i < len; i++) {
					n = n * r + arr[i];
				}
				if (isPrim(n)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
		sc.close();
	}

	static boolean isPrim(int n) {
		if (n <= 1) {
			return false;
		}
		int sqrt = (int) Math.sqrt(n);
		for (int i = 2; i <= sqrt; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

}

```

