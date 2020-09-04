package com.slp.leetcode;

/**
 * @ClassName MedianOfTwoSortedArrays
 * @Description TODO
 * @Author sanglp
 * @Date 2020/9/4 17:11
 * @Version 1.0
 **/
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        //1、测试思路1
        int[] nums1 = {1,2};
        int[] nums2 = {2,3};
        double result = findMedianSortedArraysv1(nums1,nums2);
        System.out.println(result);
    }

    /**
     * @desc 解题思路1 使用暴力将数组合并
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArraysv1(int[] nums1, int[] nums2) {
        int[] nums;
        int m = nums1.length;//获得数组1的长度
        int n = nums2.length;//获得数组2的长度
        nums = new int[m + n];//确定合并后数组的长度
        if (m == 0) {//数组1的长度为0 那么只需要考虑数组2的中位数
            if (n % 2 == 0) {//如果是偶数
                return (nums2[n / 2 - 1] + nums2[n / 2]) / 2.0;
            } else {//如果是奇数就正好是数组中间的位置
                return nums2[n / 2];
            }
        }
        if (n == 0) {//同理当数组2的长度为0的时候处理数组1
            if (m % 2 == 0) {
                return (nums1[m / 2 - 1] + nums1[m / 2]) / 2.0;
            } else {
                return nums1[m / 2];
            }
        }

        int count = 0;
        int i = 0, j = 0; //定义两个变量 分别指向数组1和数组2的第一个元素
        while (count != (m + n)) {
            if (i == m) {//如果i已经到m说明数组1已经复制完了 将数组二的数组继续复制进去
                while (j != n) {
                    nums[count++] = nums2[j++];
                }
                break;
            }
            if (j == n) {//如果j已经到n说明数组2已经复制完了 将数组一的数组继续复制进去
                while (i != m) {
                    nums[count++] = nums1[i++];
                }
                break;
            }

            if (nums1[i] < nums2[j]) {//如果数组1的数字比数组2的小 那么将数组1的数组复制进去，反之则复制数组2
                nums[count++] = nums1[i++];
            } else {
                nums[count++] = nums2[j++];
            }
        }
        //复制完之后对新数组处理
        if (count % 2 == 0) {
            return (nums[count / 2 - 1] + nums[count / 2]) / 2.0;
        } else {
            return nums[count / 2];
        }
    }

    public double findMedianSortedArraysv2(int[] nums1, int[] nums2) {
        int m = nums1.length;//数组1的长度
        int n = nums2.length;//数组2的长度
        int len = m + n;//总长度
        int left = -1, right = -1;
        int aStart = 0, bStart = 0;
        for (int i = 0; i <= len / 2; i++) {//总共需要移动的次数是len/2+1
            left = right;
            //如果数组1还没走完 并且在数组2没有越界的情况下 数组1的元素小于数组2的元素 则数组1向前
            if (aStart < m && (bStart >= n || nums1[aStart] < nums2[bStart])) {
                right = nums1[aStart++];
            } else {
                right = nums2[bStart++];
            }
        }
        if ((len & 1) == 0) {//如果长度是偶数
            return (left + right) / 2.0;
        }else {
            return right;
        }
    }

}
