package com.zixin.learn.easy.day01;


import java.util.Arrays;
/**
 * 
 * @ClassName: InsertionSort
 * @Description: 插入排序 0位置上一开始不动 相当于说0上的数排好了   第二趟将1位置上的数插入到已排好的数据中   第三趟  位置2上的数插入到 已排好的01位置中间
 * 相当于是将一个新的数插入到之前已经排好序的序列中
 * 时间复杂度：最好情况初始有序则O(N)
 *            最坏情况原始逆序O(N^2)
 *            
 * @author Administrator
 * @date 2020-03-01 15:17:04
 */
public class InsertionSort {

    public static void insertionSort(int[] sourceArray) {
        if (sourceArray == null || sourceArray.length < 2) {
            return;
        }
        //从1开始 每次加加  因为0位置上的数是不需要动的
        for (int end = 1; end < sourceArray.length; end++) {
            for (int cur = end - 1; cur >= 0 && sourceArray[cur] > sourceArray[cur + 1]; cur--) {
                swap(sourceArray, cur, cur + 1);
            }
        }
    }

    /**
     * 
     * @Title: swap
     * @Description: 交换数据
     * @author Administrator
     * @date 2020-03-01 15:20:43
     * @param @param sourceArray
     * @param @param left
     * @param @param right 参数
     * @return void 返回类型
     * @throws
     */
    public static void swap(int[] sourceArray, int left, int right) {
        sourceArray[left] = sourceArray[left] ^ sourceArray[right];
        sourceArray[right] = sourceArray[left] ^ sourceArray[right];
        sourceArray[left] = sourceArray[left] ^ sourceArray[right];
    }

    // for test
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // for test
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    // for test
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // for test
    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            insertionSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
    }

}

