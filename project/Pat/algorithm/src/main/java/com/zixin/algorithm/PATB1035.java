package com.zixin.algorithm;

import java.util.Scanner;
/**
 * 
 * @author sangliping
 * 来自网络  要重看
 */
public class PATB1035 {
	static int flag = 0;
	static int[] print;

	// 数组一致性判断 检查两个数组元素是否一致
	public static boolean check(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;

	}

    /**
     * 
     * @param a
     * @param b
     * @param start
     * @param end
     * @param length
     * @desc //插入排序1  递归
     */
	public static void insert(int[] a, int[] b, int start, int end, int length) {
		if (end < length) {
			// 是否找完
			int index = end; // 从后往前找
			int temp = 0;
			// 查找最后一个元素应该插入到哪个位置，找到则退出循环
			for (int i = start; i < end; i++) {
				if (a[end] < a[i]) {
					index = i;
					temp = a[end];
					// 找到位置后记住位置和需要挪动的数据
					break;
				}
			}
			// 如果找到指定位置，则指定位置元素开始集体向后挪动一个单位，否则不变
			if (index != end) {
				for (int i = end - 1; i > index - 1; i--) {
					a[i + 1] = a[i];
				}
				a[index] = temp;
			}
			end++;

			if (flag == 1) {
				System.out.println("Insertion Sort");
				for (int i = 0; i < a.length; i++) {
					if (i < a.length - 1)
						System.out.print(a[i] + " ");
					else
						System.out.print(a[i]);
				}
				flag = 0;
				return;
			}

			// 与b串对比验证
			if (check(a, b))
				flag = 1;
			insert(a, b, start, end, length);
		}
	}

	// 插入排序2 非递归 从前往后
	// 从第二个元素开始，每个元素只找他前面的，保证这个数一定比前面的大，
	public static void insertSort(int[] a) {
		int i, j;
		int n = a.length;
		int target;
		// 假定第一个元素被放到了正确的位置上
		// 这样，仅需遍历1 - n-1
		for (i = 1; i < n; i++) {
			j = i;
			target = a[i];

			while (j > 0 && target < a[j - 1]) {// 每比较一次就和前面的元素换一个位置
				a[j] = a[j - 1];
				j--;
			}
			a[j] = target;
			// 与b串对比验证
			for (int k = 0; k < a.length; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println();
		}
	}

	// 题意归并排序
	// 根据题意自制
	public static void mergeSort(int[][] a, int[] b) {
		int times = 0;// 递归最大次数

		for (int i = 1; i < a.length; i *= 2)
			times++;// 求次数

		int k = 0;// 赋值次数
		// 判断迭代次数是否正确即是否为最后一次
		if (times > 0) {
			for (int i = 0, j = 0; i < a.length; i += 2, j++) {
				// System.out.println("i="+i+" j="+j);
				if (i < a.length - 1) {// 判断是否能够两个合成一个
					a[j] = mergeArray1(a[i], a[i + 1]);
				} else {// 不可以合成的话直接赋值
					a[j] = a[i];
				}
				// 每次赋值完成都代表多添加一行
				k++;
			}
			int[][] temp = new int[k][];
			for (int i = 0; i < temp.length; i++) {
				// 添加完以后截断源数组；改由新数组存储
				temp[i] = a[i];
			}

			// 输出本次迭代完毕后的数列

			for (int i = 0, p = 0; i < temp.length; i++) {
				for (int j = 0; j < temp[i].length; j++, p++) {
					print[p] = temp[i][j];
				}
			}

			if (flag == 1) {
				System.out.println("Merge Sort");
				for (int i = 0; i < print.length; i++) {
					if (i < print.length - 1)
						System.out.print(print[i] + " ");
					else
						System.out.print(print[i]);
				}
				System.out.println();
				flag = 0;
				return;
			}
			if (check(print, b))
				flag = 1;

			// 迭代进行下次数列组合
			mergeSort(temp, b);
		}
	}

	// 归并排序任意长度的数组
	public static int[] mergeArray(int[] a, int[] b) {
		// temp存放结果
		int[] temp = new int[a.length + b.length];
		// temp插入的次数
		int k = 0;
		int k1 = 0;
		temp[0] = a[0];
		k++;

		for (int i = 1; i < a.length; i++) {
			// 放a
			k1 = k;
			for (int j = 0; j < temp.length; j++) {
				if (temp[j] > a[i]) {
					// 后挪一位
					System.arraycopy(temp, j, temp, j + 1, temp.length - j - 1);
					temp[j] = a[i];
					k++;
					break;
				}
			}
			if (k1 == k) {
				temp[k] = a[i];
				k++;
			}
		}

		for (int i = 0; i < b.length; i++) {
			// 放b
			k1 = k;
			for (int j = 0; j < temp.length; j++) {
				if (temp[j] > b[i]) {
					// 后挪一位
					System.arraycopy(temp, j, temp, j + 1, temp.length - j - 1);
					temp[j] = b[i];
					k++;
					break;
				}
			}
			if (k1 == k) {
				temp[k] = b[i];
				k++;
			}
		}
		return temp;
	}

	// 归并排序任意长度的两个数组改进
	public static int[] mergeArray1(int[] a, int[] b) {
		// temp存放结果
		int[] temp = new int[a.length + b.length];
		int i = 0; // a的索引
		int j = 0; // b的索引
		int k = 0; // temp的索引
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				temp[k] = a[i];
				i++;
				k++;
			} else {
				temp[k] = b[j];
				j++;
				k++;
			}
		}
		while (i < a.length) {
			temp[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			temp[k] = b[j];
			k++;
			j++;
		}
		return temp;
	}

	// 普通归并排序,不符合题意
	public static void mergeSort(int[] array, int low, int high) {
		int mid = low + (high - low);
		if (high - low > 1)
			mid = (int) (low + Math.sqrt(high - low)); // mid = (high + low)/2的另一种算法,避免溢出
		if (high - low == 1)
			mid = low;

		if (low < high) {
			mergeSort(array, low, mid); // 对array[low…mid]归并排序
			mergeSort(array, mid + 1, high); // 对array[mid+1…high]归并排序
			mergeArray(array, low, mid, high);// 融合
		}

		return;
	}

	// 普通归并迭代方法，不符合题意
	public static void mergeArray(int[] array, int low, int mid, int high) {
		int[] temp = new int[mid - low + 1]; // 创建临时数组,只需要创建前一半即可
		for (int i = 0, j = low; i < temp.length; i++, j++) {
			temp[i] = array[j]; // 对临时数组进行赋值
		}
		int i = 0, j = mid + 1, m = low;
		while (i < temp.length && j <= high) { // 将两个有序数组归并
			if (temp[i] <= array[j]) { // 小于等于是为了维持稳定性
				array[m] = temp[i];
				i++;
				m++;
				continue;
			} else {
				array[m] = array[j];
				m++;
				j++;
				continue;
			}
		}
		while (i < temp.length) // 最后将剩余的元素填充
			array[m++] = temp[i++];

		/*
		 * while(j <= high) array[m++] = array[j++]; 这一步其实可以不用做,因为此时array[j]==array[m]
		 */
		for (int r = low; r <= high; r++) {
			System.out.print(array[r] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] a = new int[num];
		int[] b = new int[num];
		int[][] aa = new int[num][1];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < num; i++) {
			aa[i][0] = a[i];
		}

		print = new int[num];

		insert(a, b, 0, 1, num);
		mergeSort(aa, b);

	}

}