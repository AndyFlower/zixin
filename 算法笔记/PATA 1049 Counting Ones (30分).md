The task is simple: given any positive integer *N*, you are supposed to count the total number of 1's in the decimal form of the integers from 1 to *N*. For example, given *N* being 12, there are five 1's in 1, 10, 11, and 12.

### Input Specification:

Each input file contains one test case which gives the positive *N* (≤230).

### Output Specification:

For each test case, print the number of 1's in one line.

### Sample Input:

```in
12

      
    
```

### Sample Output:

```out
5
```

### 代码

```java
package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1049 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int a=1;
		int ans=0;
		int left=0;
		int right=0;
		int now;
		while(n/a!=0) {
			left=n/(a*10);
			now=n/a%10;
			right=n%a;
			if(now==0) {
				ans+=left*a;
			}else if(now==1) {
				ans+=left*a+right+1;
			}else {
				ans+=(left+1)*a;
			}
			a=a*10;
		}
		
		System.out.println(ans);

	}

}

```

