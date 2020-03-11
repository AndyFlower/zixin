package com.zixin.algorithm;

import java.util.Scanner;

public class PATB1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String da = sc.next();
		String b = sc.next();
		String db = sc.next();
		sc.close();
		String s = "";
		String t = "";
		for (int i = 0; i < a.length(); i++) {
			if ((a.charAt(i) + "").equals(da)) {
				s = s + da;
			}
		}
		for (int j = 0; j < b.length(); j++) {
			if ((b.charAt(j) + "").equals(db)) {
				t = t + db;
			}
		}
		int a1 = 0;
		int a2 = 0;
		if (s != "") {
			a1 = Integer.parseInt(s);
		}
		if (t != "") {
			a2 = Integer.parseInt(t);
		}
		System.out.println(a1 + a2);

	}

}
