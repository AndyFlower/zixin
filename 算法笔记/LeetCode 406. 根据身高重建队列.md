## [406. 根据身高重建队列](https://leetcode-cn.com/problems/queue-reconstruction-by-height/)

假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对`(h, k)`表示，其中`h`是这个人的身高，`k`是排在这个人前面且身高大于或等于`h`的人数。 编写一个算法来重建这个队列。

### **注意：**
总人数少于1100人。

### **示例**

```
输入:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

输出:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
```

### 代码

```java
package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LC406 {
	  public int[][] reconstructQueue(int[][] people) {
		  if (0 == people.length || 0 == people[0].length)
	            return new int[0][0];
		  ////按照身高降序 K升序排序 
		  Arrays.sort(people, new Comparator<int[]>() {
	            @Override
	            public int compare(int[] o1, int[] o2) {
	                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
	            }
	        });
		  //身高一样的 K越大越排在后面
		  //List<int[]> list = new ArrayList<>();
		  List<int[]> list = new ArrayList<>();
		  for(int[] p:people) {
			  list.add(p[1],p);
			  
		  }
		  return list.toArray(new int[list.size()][]);
		  
	   }
	
	  
}

```

### 提交

![LC406](image/LC406.png)