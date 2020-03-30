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
