package com.zixin.learn.easy.day01;


/**
 * 
 * @ClassName: QuickSort
 * @Description:随机快排
 * 经典快排不划分区域  每次只确定一个数字的位置  随机快排比经典快排要快一些
 * @author Administrator
 * @date 2020-03-01 18:09:28
 */
public class QuickSort {
    /**
     * 
     * @Title: quickSort 
     * @Description: 首先调用该方法，可以设置排序的区间，默认为 0 ~ length-1；  sourceArray需要排序的数组
     * @author Administrator
     * @date 2020-03-01 18:09:56
     * @param @param sourceArray 参数
     * @return void 返回类型
     * @throws
     */
    public static void quickSort(int[] sourceArray) {
        if (sourceArray == null || sourceArray.length < 2) {
            return;
        }
        quickSort(sourceArray, 0, sourceArray.length - 1);
    }

    /**
     * @param sourceArray：需要排序的数组
     * @param left：排序数组左边界，一般为：0
     * @param right：排序数组右边界，一般为：length - 1;
     * less：小于参照元素区域的最右边边界：less = p[0] - 1;
     * more：大于参照元素区域的最左边边界：more = p[1] + 1;
     * p[0]：等于参照元素区域的最左边边界；
     * p[1]：等于参数元素区域的最右边边界；
     * 小于参照元素区域：[Left ~ less];
     * 等于参照元素区域：[p[0] ~ p[1]]；
     * 大于参照元素区域：[more ~ right]；
     */
    public static void quickSort(int[] sourceArray, int left, int right) {
        if (left < right) {
            swap(sourceArray, left + (int) (Math.random() * (right - left + 1)), right);
            // p 数组中： p[0] 表示等于区域的左边界，p[1] 表示等于区域的右边界，
            // 左边区域：L ~ p[0] - 1;右边区域： p[1] + 1 ~ R;
            int[] p = partition(sourceArray, left, right);
            quickSort(sourceArray, left, p[0] - 1);
            quickSort(sourceArray, p[1] + 1, right);
        }
    }

    /**
     * 
     * @Title: partition
     * @Description: 以最后一个元素为基准 返回等于区域的范围
     * @author Administrator
     * @date 2020-03-01 18:11:48
     * @param @param sourceArray
     * @param @param left
     * @param @param right
     * @param @return 参数
     * @return int[] 返回类型
     * @throws
     */
    public static int[] partition(int[] sourceArray, int left, int right) {
        int less = left - 1;
        int more = right;
        while (left < more) {
            // 以数组最后一个元素为标准，将整个数组划分为 小于、等于、大于 三个部分
            if (sourceArray[left] < sourceArray[right]) {
                swap(sourceArray, ++less, left++);
            } else if (sourceArray[left] > sourceArray[right]) {
                swap(sourceArray, --more, left);
            } else {
                left++;
            }
        }
        swap(sourceArray, more, right);
        return new int[]{less + 1, more};
    }

    public static void swap(int[] sourceArray, int left, int right) {
        int tmp = sourceArray[left];
        sourceArray[left] = sourceArray[right];
        sourceArray[right] = tmp;
    }


    public static void main(String[] args) {
        int[] arr = {43, -31, 10, -38, -42, -2, 22, 29, 30, 15, -60, -50, -13, 26, 3, 22, 27, 24, 18, 18, 42, -40, 22, 8, 33, -52, -70, -55, 31, 42, 82, 19, -8, 8, 41, -35, 59, 65, -23, 3, -34, 65};
        System.out.println("原数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        quickSort(arr);
        System.out.println("\n排序后数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
