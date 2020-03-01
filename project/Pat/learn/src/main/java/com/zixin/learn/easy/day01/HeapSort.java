package com.zixin.learn.easy.day01;

import java.util.Arrays;
/**
 * 
 * @ClassName: HeapSort
 * @Description:堆排序
 * @author Administrator
 * @date 2020-03-01 21:59:46
 */
public class HeapSort {

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 首先将数组转化为大根堆；0 到  i 之间形成大根堆
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }

        // 不断将堆顶的元素和最后一个元素交换然后进行 heapify 过程
        int size = arr.length;
        swap(arr, 0, --size);
        while (size > 0) {
            heapify(arr, 0, size);
            swap(arr, 0, --size);
        }
    }

    /**
     * 
     * @Title: heapInsert
     * @Description: 构建大根堆  一个元素一个元素插入  插入和父级比较  如果比父大 则交换
     * @author Administrator
     * @date 2020-03-01 22:00:37
     * @param @param arr
     * @param @param index 参数
     * @return void 返回类型
     * @throws
     */
    public static void heapInsert(int[] arr, int index) {
        // 如果插入的新节点值大于其父结点大小
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    
    /**
     * 
     * @Title: heapify
     * @Description: size - 1 到 length - 1 位置上已经排好  如果一个变了 找到其左右孩子中最大值 和其交换  继续和你左右孩子比较  
     * @author Administrator
     * @date 2020-03-01 22:06:07
     * @param @param arr 要排序的数组
     * @param @param index 哪个节点位置上元素发生了变化，传入的初始值一直为0
     * @param @param size 参数 还没有排好序的数组长度
     * @return void 返回类型
     * @throws
     */
    public static void heapify(int[] arr, int index, int size) {
        // size 表示当前堆上节点数
        int left = index * 2 + 1;//左孩子
        // 越界表示已经是叶子结点了
        while (left < size) {//保证不越界
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;//left+1是右孩子  比较左孩子和右孩子那个大  大的是largest
            largest = arr[largest] > arr[index] ? largest : index;//较大的和我自己比较
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;//你变成了较大孩子的下标
            left = index * 2 + 1;
        }
    }

    public static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
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
            heapSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        heapSort(arr);
        printArray(arr);
    }

}
