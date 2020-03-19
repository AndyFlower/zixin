package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATB1043 {

	// PATest
	// 三个超时
	public static void mainmin(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		br.close();
		int[] pa = new int[6];
		int valid = 0;
		char[] re = { 'P', 'A', 'T', 'e', 's', 't' };
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'P') {
				pa[0] = pa[0] + 1;
				valid += 1;
			} else if (s[i] == 'A') {
				pa[1] = pa[1] + 1;
				valid += 1;
			} else if (s[i] == 'T') {
				pa[2] = pa[2] + 1;
				valid += 1;
			} else if (s[i] == 'e') {
				pa[3] = pa[3] + 1;
				valid += 1;
			} else if (s[i] == 's') {
				pa[4] = pa[4] + 1;
				valid += 1;
			} else if (s[i] == 't') {
				valid += 1;
				pa[5] = pa[5] + 1;
			}
		}

		int i = 0;
		while (i < valid) {
			for (i = 0; i < pa.length; i++) {
				if (pa[i] > 0) {
					System.out.print(re[i]);
					pa[i] = pa[i] - 1;
				}

			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] chs = br.readLine().toCharArray();
		br.close();
		int[] flag = new int[128];
		for (int i = 0; i < chs.length; i++) {
			flag[chs[i]]++;
		}
		while (flag['P'] > 0 || flag['A'] > 0 || flag['T'] > 0 || flag['e'] > 0 || flag['s'] > 0 || flag['t'] > 0) {
			if (flag['P']-- > 0) {
				System.out.print("P");
			}
			if (flag['A']-- > 0) {
				System.out.print("A");
			}
			if (flag['T']-- > 0) {
				System.out.print("T");
			}
			if (flag['e']-- > 0) {
				System.out.print("e");
			}
			if (flag['s']-- > 0) {
				System.out.print("s");
			}
			if (flag['t']-- > 0) {
				System.out.print("t");
			}

		}
	}
}
