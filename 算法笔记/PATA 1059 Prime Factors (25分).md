Given any positive integer *N*, you are supposed to find all of its prime factors, and write them in the format *N* = *p*1*k*1×*p*2*k*2×⋯×*p**m**k**m*.

### Input Specification:

Each input file contains one test case which gives a positive integer *N* in the range of **long int**.

### Output Specification:

Factor *N* in the format *N* `=` *p*1`^`*k*1`*`*p*2`^`*k*2`*`…`*`*p**m*`^`*k**m*, where *p**i*'s are prime factors of *N* in increasing order, and the exponent *k**i* is the number of *p**i* -- hence when there is only one *p**i*, *k**i* is 1 and must **NOT** be printed out.

### Sample Input:

```in
97532468

      
    
```

### Sample Output:

```out
97532468=2^2*11*17*101*1291
```

### 代码

```java
package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1059 {

	static int prim[] = new int[100010];
	static int pNum = 0;

	public static void main(String[] args) {
		findPrim();//填充素数表
		int num = 0;// 不同质因数的个数
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		factor fac[] = new factor[10];
		if (n == 1) {//1特殊处理
			System.out.println("1=1");
		} else {
			System.out.print(n + "=");
			int sqrt = (int) Math.sqrt(n * 1.0);
			for (int i = 0; i < pNum && prim[i] <= sqrt; i++) {//素数从前往后遍历 
				if (n % prim[i] == 0) {
					factor f = new factor();
					f.x = prim[i];
					f.cnt = 0;
					while (n % prim[i] == 0) {//如果可以相除的话 要判断可以处理几次
						f.cnt = f.cnt + 1;
						n /= prim[i];
					}
					fac[num++] = f;
				}
				if (n == 1) {
					break;
				}

			}
			if (n != 1) {
				factor f = new factor();
				f.x = n;
				f.cnt = 1;
				fac[num++] = f;
			}

			for (int i = 0; i < num; i++) {
				if (i > 0) {
					System.out.print("*");
				}
				System.out.print(fac[i].x);
				if (fac[i].cnt > 1) {
					System.out.print("^" + fac[i].cnt);
				}
			}
		}

	}

	static void findPrim() {
		for (int i = 1; i < 100010; i++) {
			if (isPrim(i)) {
				prim[pNum++] = i;
			}
		}
	}

	static boolean isPrim(int n) {
		if (n <= 1) {
			return false;
		}
		int seq = (int) Math.sqrt(n * 1.0);
		for (int i = 2; i <= seq; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

class factor {
	int x;// 素数
	int cnt;// 个数
}

```

### 提交

![PATA1059提交](image\PATA1059提交.png)

