The task of this problem is simple: insert a sequence of distinct positive integers into a hash table, and output the positions of the input numbers. The hash function is defined to be *H*(*k**e**y*)=*k**e**y*%*T**S**i**z**e* where *T**S**i**z**e* is the maximum size of the hash table. Quadratic probing (with positive increments only) is used to solve the collisions.

Note that the table size is better to be prime. If the maximum size given by the user is not prime, you must re-define the table size to be the smallest prime number which is larger than the size given by the user.

### Input Specification:

Each input file contains one test case. For each case, the first line contains two positive numbers: *M**S**i**z**e* (≤104) and *N* (≤*M**S**i**z**e*) which are the user-defined table size and the number of input numbers, respectively. Then *N* distinct positive integers are given in the next line. All the numbers in a line are separated by a space.

### Output Specification:

For each test case, print the corresponding positions (index starts from 0) of the input numbers in one line. All the numbers in a line are separated by a space, and there must be no extra space at the end of the line. In case it is impossible to insert the number, print "-" instead.

### Sample Input:

```in
4 4
10 6 4 15

      
    
```

### Sample Output:

```out
0 1 4 -
```

### 代码

```java
package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1078
 * @Description: 最后一个测试点超时 
 *              这里要注意的是正向探测法 
 *              二次方探测法是 +1^2  -1^2  +2^2  -2^2  正向探测法就只是考虑正的 
 * @author Administrator
 * @date 2020-04-06 10:14:43
 */
public class PATA1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tSize = sc.nextInt();
		int numNumber = sc.nextInt();
		while (!isPrime(tSize)) {
			tSize++;
		} // 找到第一个比其大的素数

		boolean[] hashTable = new boolean[tSize];
		for (int i = 0; i < numNumber; i++) {
			int temp = sc.nextInt();
			int M = temp % tSize;
			if (hashTable[M] == false) {
				hashTable[M] = true;
				if (i == 0) {
					System.out.print(M);
				} else {
					System.out.print(" " + M);
				}
			} else {
				int step = 1;
				for (step = 1; step < tSize; step++) {
					M = (temp + step * step) % tSize;
					if (hashTable[M] == false) {
						hashTable[M] = true;
						if (i == 0) {
							System.out.print(M);
						} else {
							System.out.print(" " + M);
						}
						break;
					}
				}
				if (step >= tSize) {
					if (i > 0) {
						System.out.print(" ");
					}
					System.out.print("-");
				}
			}
		}

		sc.close();
	}

	static boolean isPrime(int n) {
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

```

