Given a stack which can keep *M* numbers at most. Push *N* numbers in the order of 1, 2, 3, ..., *N* and pop randomly. You are supposed to tell if a given sequence of numbers is a possible pop sequence of the stack. For example, if *M* is 5 and *N* is 7, we can obtain 1, 2, 3, 4, 5, 6, 7 from the stack, but not 3, 2, 1, 7, 5, 6, 4.

### Input Specification:

Each input file contains one test case. For each case, the first line contains 3 numbers (all no more than 1000): *M* (the maximum capacity of the stack), *N* (the length of push sequence), and *K* (the number of pop sequences to be checked). Then *K* lines follow, each contains a pop sequence of *N* numbers. All the numbers in a line are separated by a space.

### Output Specification:

For each pop sequence, print in one line "YES" if it is indeed a possible pop sequence of the stack, or "NO" if not.

### Sample Input:

```in
5 7 5
1 2 3 4 5 6 7
3 2 1 7 5 6 4
7 6 5 4 3 2 1
5 6 4 3 7 2 1
1 7 6 5 4 3 2

      
    
```

### Sample Output:

```out
YES
NO
NO
YES
NO
```

### 代码

```java
package com.zixin.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class PATA1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();//最大容量
		int n=sc.nextInt();//几个数
		int k=sc.nextInt();//几个例子
		Stack<Integer> stack= new Stack<Integer>();
		int arr [] = new int[n+1];//
		for(int i=0;i<k;i++) {
			while(!stack.isEmpty()) {
				stack.pop();//如果栈不空  清空栈
			}
			for(int j=1;j<=n;j++) {
				arr[j]=sc.nextInt();//读入数据
			}
			int  current=1;//指向出栈元素的待出栈元素 
			boolean flag = true;
			for(int m1=1;m1<=n;m1++) {
				stack.push(m1);
				if (stack.size() > m) {//容量超过 则No
					flag = false;
					break;
				}
				while(!stack.isEmpty()&&stack.peek()==arr[current]) {//不为空   且栈顶元素是待出栈元素
					stack.pop();//出栈
					current++;
				}
			}
			
			if(stack.isEmpty()&& flag) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

}

```

### 提交

![PATA1051提交](image\PATA1051提交.png)