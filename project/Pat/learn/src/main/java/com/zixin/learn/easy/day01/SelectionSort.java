package com.zixin.learn.easy.day01;

import java.util.Arrays;
/**
 * 
 * @ClassName: SelectionSort
 * @Description: 选择排序  每次选一个最小的放在最前面   0~n-1  1~n-1  2~n-1  
 * @author Administrator
 * @date 2020-03-01 12:52:37
 * 时间复杂度O(N^2)  严格O(N^2)
 */
public class SelectionSort {

    public static void selectionSort(int[] sourceArray) {
        if (sourceArray == null || sourceArray.length < 2) {
            return;
        }
        //从0到n-1 
        for (int start = 0; start < sourceArray.length - 1; start++) {
            int minIndex = start;//先将第一个设置为最小的
            // 从 i + 1 位置到最后的最小的数下标
            for (int cur = start + 1; cur < sourceArray.length; cur++) {
            	//如果有更小的 则更小最小数
                minIndex = sourceArray[cur] < sourceArray[minIndex] ? cur : minIndex;
            }
            swap(sourceArray, start, minIndex);
        }
    }

    // 下面两种交换程序均可
//    public static void swap(int[] sourceArray, int left, int right) {
//        int tmp = sourceArray[left];
//        sourceArray[left] = sourceArray[right];
//        sourceArray[right] = tmp;
//    }

    public static void swap(int[] sourceArray, int left, int right) {
        if (left == right){
            return;
        }
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
    	//生成长度随机的数组
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
            selectionSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }

}
