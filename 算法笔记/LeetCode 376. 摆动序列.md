## [376. 摆动序列](https://leetcode-cn.com/problems/wiggle-subsequence/)

如果连续数字之间的差严格地在正数和负数之间交替，则数字序列称为**摆动序列。**第一个差（如果存在的话）可能是正数或负数。少于两个元素的序列也是摆动序列。

例如， `[1,7,4,9,2,5]` 是一个摆动序列，因为差值 `(6,-3,5,-7,3)` 是正负交替出现的。相反, `[1,4,7,2,5]` 和 `[1,7,4,5,5]` 不是摆动序列，第一个序列是因为它的前两个差值都是正数，第二个序列是因为它的最后一个差值为零。

给定一个整数序列，返回作为摆动序列的最长子序列的长度。 通过从原始序列中删除一些（也可以不删除）元素来获得子序列，剩下的元素保持其原始顺序。

### **示例 1:**

```
输入: [1,7,4,9,2,5]
输出: 6 
解释: 整个序列均为摆动序列。
```

### **示例 2:**

```
输入: [1,17,5,10,13,15,10,5,16,8]
输出: 7
解释: 这个序列包含几个长度为 7 摆动序列，其中一个可为[1,17,10,13,10,16,8]。
```

### **示例 3:**

```
输入: [1,2,3,4,5,6,7,8,9]
输出: 2
```

### **进阶:**
你能否用 O(*n*) 时间复杂度完成此题?

### 代码

```java
package com.zixin.algorithm;

public class LC376 {
	  public int wiggleMaxLength(int[] nums) {
          //需要去除重复的元素
		  if(nums.length<2) {
			  return nums.length;
		  }
		  int res = 2;
		  for(int i=1;i+1<nums.length;i++) {
			  int a=nums[i-1];
			  int b=nums[i];
			  int c=nums[i+1];
			  if(a<b&&b>c) {
				  res++;
			  }else if(a>b&&b<c) {
				  res++;
			  }		  
		  }
		  return res;
	   }
	  
	  /**
	   * 贪心算法

　　举一个例子来说，2,1,4,5,6,3,3,4,8,4

　　  (1)第一个数2来说，由于后面一个数不等于2，所以当前序列为2,1

　　  (2)对于当前序列，我们需要一个比1大的数，而4>1,所以当前序列为2,1,4

　　  (3)现在我们需要一个比4小的数，但是5>4,所以这里用5替代4，这里使用的贪心规则（使用5肯定比用4容易遇到更小的数，所以用大的数代替小的数，需要一个比当前数大时和这个类似），所以序列为2,1,5

　　  (4)同(3)这里变成2,1,6

　　  (5)这里需要比6小，3比6小所以这里变为2,1,6,3

　　  (6)需要比3大的，而3=3，所以序列还是为2,1,6,3

　　  (7)需要比3大的，而4>3，所以序列2,1,6,3,4

　　　......

　　  最后得到序列为2,1,6,3,8,4，返回值为6
	   * @Title: wiggleMaxLength2
	   * @Description: TODO(这里用一句话描述这个方法的作用)
	   * @author Administrator
	   * @date 2020-03-20 23:38:59
	   * @param @param nums
	   * @param @return 参数
	   * @return int 返回类型
	   * @throws
	   */
	  public int wiggleMaxLength2(int[] nums) {
	        if(nums==null||nums.length==0) return 0;
	        if(nums.length==1) return 1;
	        int res=0;
	        int i=0;
	         
	        while(i<nums.length-1){  //删除最开始 相同的数 ，如2,2,2,3,1
	            if(nums[i]==nums[i+1]){
	                i++;
	            }else{
	                break;
	            }
	        }
	        nums[res] = nums[i];
	        if(i==nums.length-1){  //给出的数组为2,2,2，2,2这种格式
	            return 1;
	        }else{
	            res++;
	            i++;
	            nums[res]=nums[i];  //得出前两个的值,并得出初始的flag
	            int flag=nums[1]-nums[0];       //大于0，==0，或者小于0
	            while(i<nums.length-1){
	                if(flag==0){
	                    i++;
	                }else if(flag>0){        //前面是递增，所以现在需要减
	                    if(nums[i+1]-nums[res]<0){       //确实是递减，加入即可
	                        flag=nums[i+1]-nums[res];
	                        res++;
	                        i++;
	                        nums[res]=nums[i];
	                    }else{
	                        i++;
	                        nums[res] = nums[i];        //将当前序列最后一个替换为后一个比较大的数
	                    }
	                }else if(flag<0){        //前面是递减，所以现在需要增
	                    if(nums[i+1]-nums[res]>0){       //确实是递减，加入即可
	                        flag=nums[i+1]-nums[res];
	                        res++;
	                        i++;
	                        nums[res]=nums[i];
	                    }else{          //需要一个高大的数，所以当前数更小的话，更加容易找到符合要求的数
	                        i++;
	                        nums[res] = nums[i];        //将当前序列最后一个替换为后一个比较小的数
	                    }
	                }
	            }
	        }
	         
	       
	        return res+1;
	    }
}

```

