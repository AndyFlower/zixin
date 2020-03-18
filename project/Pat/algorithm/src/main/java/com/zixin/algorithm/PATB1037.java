package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @author sangliping
 * @desc  十七个银西可(Sickle)兑一个加隆(Galleon)，二十九个纳特(Knut)兑一个西可
 * 1G=17S  1S=29K
 */
public class PATB1037 {
    /**
     * Galleon.Sickle.Knut
     * @param args  
               * 注意：需要转义的字符串：.  $  |   (   )  [   {   ^  ?  *  +  \\      共12个特殊字符
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int g1 = Integer.parseInt(s1.split("\\.")[0]);//应该给的 
		int g2 = Integer.parseInt(s1.split("\\.")[1]);
		int g3 = Integer.parseInt(s1.split("\\.")[2]);
		
		int f1 = Integer.parseInt(s2.split("\\.")[0]);//实际给的
		int f2 = Integer.parseInt(s2.split("\\.")[1]);
		int f3 = Integer.parseInt(s2.split("\\.")[2]);
		sc.close();
		int gei = g1*17*29+g2*29+g3;
		int fu = f1*17*29+f2*29+f3;
		if(gei>fu) {
			System.out.print("-");
			int temp = gei;
			gei=fu;
			fu=temp;
		}
       
        //G (gei-fu)/17/29
        System.out.print((fu-gei)/(17*29)+".");
        System.out.print(((fu-gei)%(17*29))/29+".");
        System.out.print(((fu-gei)%(17*29))%29);
      
	}
	

}
