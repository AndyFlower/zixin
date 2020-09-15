package com.slp.leetcode;

/**
 * @ClassName ShuZuZhongZhongFuDeShuZiLcof
 * @Description 数组中的重复数字
 * @Author sanglp
 * @Date 2020/9/15 15:26
 * @Version 1.0
 **/
public class ShuZuZhongZhongFuDeShuZiLcof {
    public static void main(String[] args) {
        int  arr[] = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(arr));
    }
    public static int findRepeatNumber(int[] nums) {
        int [] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]==0){
                arr[nums[i]]=1;
            }else{
                return nums[i];
            }
        }
        return -1;
    }

    /**
     * 使用鸽槽原理：
     * “如果每个抽屉代表一个集合，每一个苹果就可以代表一个元素，假如有n+1个元素放到n个集合中去，其中必定有一个集合里至少有两个元素。” 抽屉原理有时也被称为鸽巢原理。它是组合数学中一个重要的原理 [1]  。
     * 这样子的话我们可以将数字放在属于自己的顺序位置上，这样如果一个数据已经归位 ，并且另一个相同的数字也要放在这个位置 那么这个数字就是重复的
     * @param nums
     * @return
     */
    public int findRepeatNumberVersion2(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            while(nums[i] != i) {
                if(nums[i] == nums[nums[i]]) return nums[i];
                swap(nums, i, nums[i]);
            }
        }
        return -1;
    }
    private void swap1(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    private void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
