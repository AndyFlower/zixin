package com.zixin.algorithm;

public class LC860 {

	public static void main(String[] args) {

	}

	public boolean lemonadeChange(int[] bills) {
		int fives = 0, tens = 0;// 两个变量来记录5元和10元的数量
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				fives += 1;
			} else if (bills[i] == 10) {
				if (fives > 0) {
					fives--;
					tens++;
				} else {
					return false;
				}
			} else {
				int t = 15;
				if (tens > 0) {
					t = t - 10;
					tens--;
				}
				while (t > 0 && fives > 0) {
					t = t - 5;
					fives--;
				}
				if (t > 0) {
					return false;
				}
			}
		}
		return true;
	}
}
