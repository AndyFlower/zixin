**1065** **A+B and C (64bit)** (20分)

Given three integers *A*, *B* and *C* in [−263,263], you are supposed to tell whether *A*+*B*>*C*.

### Input Specification:

The first line of the input gives the positive number of test cases, *T* (≤10). Then *T* test cases follow, each consists of a single line containing three integers *A*, *B* and *C*, separated by single spaces.

### Output Specification:

For each test case, output in one line `Case #X: true` if *A*+*B*>*C*, or `Case #X: false` otherwise, where *X* is the case number (starting from 1).

### Sample Input:

```in
3
1 2 3
2 3 4
9223372036854775807 -9223372036854775808 0

      
    
```

### Sample Output:

```out
Case #1: false
Case #2: true
Case #3: false
```

### 代码 ac

```java
package com.zixin.algorithm;

import java.math.BigInteger;
import java.util.Scanner;

public class PATA1065 {

	public static void main(String[] args) {
		Scanner   sc= new Scanner(System.in);
		int num = sc.nextInt();
		int flag = 1;
		for(int i=0;i<num;i++) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger c = sc.nextBigInteger();
			if(a.add(b).compareTo(c)>0) {
				System.out.println("Case #"+flag+": true");
				flag++;
			}else {
				System.out.println("Case #"+flag+": false");
				flag++;
			}
		}

	}

}

```

