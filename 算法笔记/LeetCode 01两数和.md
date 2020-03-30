### 题目 LeetCode 01 两数之和

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

### 代码

```java
package com.zixin.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC01 {

	public static void main(String[] args) {
		int []nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums,target)));

	}
	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	 * @Desc 1、使用暴力循环可以解决，时间复杂度为O(n^2)  此处省略
	 *       2、做一层循环，时间复杂度为O(n) 使用一个map,比如a+b=target  循环到a的时候此时map中是不可能有b的，就把a放入mao中
	 *       循环到b之后，此时map中已经存在a数据了，则直接返回
	 */
	public static int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
      for(int i=0;i<nums.length;i++) {
    	  int value = target-nums[i];
    	  if(map.containsKey(value)) {
    		  return new int[] {map.get(value),i};
    	  }
    	  map.put(nums[i], i);
      }
      return null;
    }
}

```

> 作者信息
> 姓名：梓莘
> qq交流群：1027372701