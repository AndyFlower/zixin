package com.zixin.algorithm;

import java.util.Scanner;

public class PATB1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isFirst =true;
		while (sc.hasNext()) {
			int di = sc.nextInt();
			int zhi = sc.nextInt();
			if (zhi != 0) {
				if(isFirst) {
					System.out.print(di * zhi + " " + (zhi - 1) );
					isFirst = false;
				}else {
				    System.out.print(" "+di * zhi + " " + (zhi - 1) );
				}
			}
		}
		//注意0次多项式的区分
		if (isFirst) {
            System.out.print("0 0");
        }
		sc.close();

	}

}
