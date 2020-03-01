package com.zixin.algorithm;

import java.util.Arrays;

/**
 * @Desc 全排列就是从第一个数字起每个数分别与它后面的数字交换。我们先尝试加个这样的判断——如果一个数与后面的数字相同那么这二个数就不交换了。如122，第一个数与后面交换得212、221。然后122中第二数就不用与第三个数交换了，但对212，它第二个数与第三个数是不相同的，交换之后得到221。与由122中第一个数与第三个数交换所得的221重复了。所以这个方法不行。
 * 
 * 
 *       换种思维，对122，第一个数1与第二个数2交换得到212，然后考虑第一个数1与第三个数2交换，此时由于第三个数等于第二个数，所以第一个数不再与第三个数交换。再考虑212，它的第二个数与第三个数交换可以得到解决221。此时全排列生成完毕。
 *       这样我们也得到了在全排列中去掉重复的规则——去重的全排列就是从第一个数字起每个数分别与它后面非重复出现的数字交换。
 * @author Administrator
 *
 */
public class DirectorySortRecursive {

	public static void main(String[] args) {

		permutate("aac");

	}

	public static void permutate(String input) {
		if (input == null)
			throw new IllegalArgumentException();
		char[] data = input.toCharArray();
		permutation(data, 0);
	}

	public static void permutation(char chs[], int start) {
		if (start == chs.length - 1) {
			Arrays.toString(chs);
			System.out.println(chs);
			// 如果已经到了数组的最后一个元素，前面的元素已经排好，输出。
		}
		for (int i = start; i <= chs.length - 1; i++) {
			if (isUnique(chs, start, i)) {
				// 把第一个元素分别与后面的元素进行交换，递归的调用其子数组进行排序
				Swap(chs, i, start);
				permutation(chs, start + 1);
				Swap(chs, i, start);
				// 子数组排序返回后要将第一个元素交换回来。
				// 如果不交换回来会出错，比如说第一次1、2交换，第一个位置为2，子数组排序返回后如果不将1、2
				// 交换回来第二次交换的时候就会将2、3交换，因此必须将1、2交换使1还是在第一个位置
			}

		}

	}

	public static void Swap(char chs[], int i, int j) {
		char temp;
		temp = chs[i];
		chs[i] = chs[j];
		chs[j] = temp;
	}

	private static boolean isUnique(char[] data, int begin, int end) {
		for (int i = begin; i < end; i++)
			if (data[i] == data[end])
				return false;
		return true;
	}

}
