Eva loves to collect coins from all over the universe, including some other planets like Mars. One day she visited a universal shopping mall which could accept all kinds of coins as payments. However, there was a special requirement of the payment: for each bill, she could only use exactly two coins to pay the exact amount. Since she has as many as 105 coins with her, she definitely needs your help. You are supposed to tell her, for any given amount of money, whether or not she can find two coins to pay for it.

### Input Specification:

Each input file contains one test case. For each case, the first line contains 2 positive numbers: *N* (≤105, the total number of coins) and *M* (≤103, the amount of money Eva has to pay). The second line contains *N* face values of the coins, which are all positive numbers no more than 500. All the numbers in a line are separated by a space.

### Output Specification:

For each test case, print in one line the two face values *V*1 and *V*2 (separated by a space) such that *V*1+*V*2=*M* and *V*1≤*V*2. If such a solution is not unique, output the one with the smallest *V*1. If there is no solution, output `No Solution` instead.

### Sample Input 1:

```in
8 15
1 2 8 7 2 4 11 15

      
    
```

### Sample Output 1:

```out
4 11

      
    
```

### Sample Input 2:

```in
7 14
1 8 7 2 4 11 15

      
    
```

### Sample Output 2:

```out
No Solution
```

### 代码

```java
package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @ClassName: PATA1048
 * @Description: 3 4测试点均超时   Scanner和BufferedReader一样
 * @author Administrator
 * @date 2020-04-04 19:32:41
 */
public class PATA1048 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int m=Integer.parseInt(s[1]);
		Map<Integer,Integer> map =new HashMap<Integer,Integer>();
		String tempArr[] = br.readLine().split(" ");
		for(int i=0;i<n;i++) {
			int c= Integer.parseInt(tempArr[i]);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		br.close();
		boolean flag = false;
		for(int i=0;i<(m+5)/2;i++) {//这里只循环一半的数据 也还是3 4 超时
			if(map.containsKey(i)&&map.containsKey(m-i)) {
				if(i==m-i&&map.get(i)>1) {
					
					System.out.println(i+" "+(m-i));
					flag=true;
					break;
				}else if(i!=m-i) {
					System.out.println(i+" "+(m-i));
					flag=true;
					break;
				}
			}
		}
		if(!flag) {
			System.out.println("No Solution");
		}
		

	}
	
}

```

