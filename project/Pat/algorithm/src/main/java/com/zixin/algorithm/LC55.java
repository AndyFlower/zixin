package com.zixin.algorithm;

public class LC55 {

	public boolean canJump(int[] nums) {
       int dist = 0;//最远跳到的位置
       for(int i=0;i<nums.length&&i<=dist;i++) {
    	   dist=Math.max(dist,nums[i]+i);//如果当前的格子可以跳到 就更新下可以跳到的最远距离
       }
       return dist>=nums.length-1;
    }
}
