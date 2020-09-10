package com.slp.leetcode;

import java.util.Arrays;

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

    /**
     * @Desc 解题思路2 不做合并
     * @param nums1
     * @param nums2
     * @return
     */
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

    /**
     * @Desc 使用求第k小数的思路 来解决时间复杂度
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left) + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
    }

    /**
     *
     * @param nums1 数组1
     * @param start1  数组1的起始位置
     * @param end1  数组1的结束位置
     * @param nums2 数组2
     * @param start2 数组2的起始位置
     * @param end2  数组2的结束位置
     * @param k 求第k小数
     * @return
     */
    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1; //数组1剩余需处理数据的长度
        int len2 = end2 - start2 + 1; //数组2剩余需处理数据的长度
        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1 方便统一处理
        if (len1 > len2) {
            return getKth(nums2, start2, end2, nums1, start1, end1, k);
        }
        if (len1 == 0) {//如果数组1已经没有数据了 那么直接返回数组2中的第k个数 也就是起始加k再减1
            return nums2[start2 + k - 1];
        }

        if (k == 1) {//如果k=1那么说明寻找的是第1小的数 也就是最小数，那么返回两个数组的起始位置的最小值即可
            return Math.min(nums1[start1], nums2[start2]);
        }
        //寻找数组1的需处理的数据的结束位置
        int i = start1 + Math.min(len1, k / 2) - 1;
        //寻找数组2的需处理的数据的结束位置
        int j = start2 + Math.min(len2, k / 2) - 1;
        //如果数组1的大于数组2的那么数组2的这一部分要丢弃 也就是start2要后移 这里需要注意k的处理
        if (nums1[i] > nums2[j]) {
            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
        }else {
            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
        }
    }

    /**
     * @Desc 解法四
     * @param A
     * @param B
     * @return
     */
    public double findMedianSortedArraysVersion4(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) {
            return findMedianSortedArraysVersion4(B,A); // 保证 m <= n
        }
        int iMin = 0, iMax = m;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = (m + n + 1) / 2 - i;
            if (j != 0 && i != m && B[j-1] > A[i]){ // i 需要增大
                iMin = i + 1;
            }
            else if (i != 0 && j != n && A[i-1] > B[j]) { // i 需要减小
                iMax = i - 1;
            }
            else { // 达到要求，并且将边界条件列出来单独考虑
                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; } // 奇数的话不需要考虑右半部分

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0; //如果是偶数的话返回结果
            }
        }
        return 0.0;
    }

}
