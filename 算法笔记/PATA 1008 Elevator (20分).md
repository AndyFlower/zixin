The highest building in our city has only one elevator. A request list is made up with *N* positive numbers. The numbers denote at which floors the elevator will stop, in specified order. It costs 6 seconds to move the elevator up one floor, and 4 seconds to move down one floor. The elevator will stay for 5 seconds at each stop.

For a given request list, you are to compute the total time spent to fulfill the requests on the list. The elevator is on the 0th floor at the beginning and does not have to return to the ground floor when the requests are fulfilled.

### Input Specification:

Each input file contains one test case. Each case contains a positive integer *N*, followed by *N* positive numbers. All the numbers in the input are less than 100.

### Output Specification:

For each test case, print the total time on a single line.

### Sample Input:

```in
3 2 3 1

      
    
```

### Sample Output:

```out
41
```

### 代码

```java
package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1008 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int to=0;
		int total=0;
		int now = 0;
		for(int i=0;i<n;i++) {
			to = sc.nextInt();
			if(to>now) {
				total+=((to-now)*6);
				
			}else {
				total +=((now-to)*4);
			}
			total+=5;
			now=to;
		}
		sc.close();
		System.out.println(total);
	}

}

```

