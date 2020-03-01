package com.zixin.learn.easy.day01;

/**
 * 
 * @ClassName: NetherlandsFlag
 * @Description: 荷兰国旗问题
 * @author Administrator
 * @date 2020-03-01 17:51:25
 */
public class NetherlandsFlag {
    /**
     * @param sourceArray：要分割的数组
     * @param left  ：数组左边界
     * @param right：数组右边界
     * @param tagNum：用于分割的参考数字
     * @return
     * @Desc 在L到R上解决荷兰国旗问题
     */
    public static int[] partition(int[] sourceArray, int left, int right, int tagNum) {
        // less 表示小于 tagNum 区域最右边数，more 是大于 tagNum 区域最左边数
        int less = left - 1;//最开始less停在left-1的地方
        int more = right + 1;
        int current  = left;
        while (current < more) {
            if (sourceArray[current] < tagNum) {
                swap(sourceArray, ++less, current++); //less的下一个位置 和原位置交换 相当于小于区域的下一个交换  current跳一个
            } else if (sourceArray[current] > tagNum) {
                // 从大于区域换过来的值还需要再次判断
                swap(sourceArray, --more, current);//大于区域的前一个位置和当前交换  当前位置不换
            } else {//等于的时候大于区域小于区域都不变  直接++
            	current++;
            }
        }
        return new int[]{less + 1, more - 1};//返回的是等于区域的下标
    }

    public static void swap(int[] sourceArray, int left, int right) {
        int tmp = sourceArray[left];
        sourceArray[left] = sourceArray[right];
        sourceArray[right] = tmp;
    }


    // for test
    public static int[] generateArray() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
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

    public static void main(String[] args) {
        int[] test = generateArray();
        System.out.println("测试数据为：");
        printArray(test);

        int[] res = partition(test, 0, test.length - 1, 5);
        System.out.println("划分之后数据为：值为原地修改");
        printArray(test);

        System.out.println("等于区域的开始下标为：");
        System.out.println(res[0]);
        System.out.println("等于区域的结束下标为：");
        System.out.println(res[1]);
    }
}
