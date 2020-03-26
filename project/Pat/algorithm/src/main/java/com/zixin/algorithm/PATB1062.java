package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author sangliping
 *     分析：使用辗转相除法gcd计算a和b的最大公约数，
 *     因为要列出a1/b1和a2/b2之间的最简分数，但是a1/b1不一定小于a2/b2，所以如果a1 * b2 > a2 * b1，
 *     说明a1/b1比a2/b2大，则调换a1和a2、b1和b2的位置～
 *     假设所求的分数分母为k、分子num，先令num=1，
 *     当a1 * k >= b1 * num时，num不断++，直到num符合n1/m1 < num/k为止～  这里才找到第一个符合的数据
 *     然后在n1/m1和n2/m2之间找符合条件的num的值，
 *     用gcd(num, k)是否等于1判断num和k是否有最大公约数，
 *     如果等于1表示没有最大公约数，就输出num/k，然后num不断++直到退出循环～
 */
public class PATB1062 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		br.close();
		int a1 = Integer.parseInt(str[0].split("/")[0]);
		int b1=Integer.parseInt(str[0].split("/")[1]);
		int a2 = Integer.parseInt(str[1].split("/")[0]);
		int b2=Integer.parseInt(str[1].split("/")[1]);
		int k =Integer.parseInt(str[2]);
		br.close();
		if (a1*b2 > a2*b1)//b1<b2时交换,第二个错误点
		{
			int temp = a1;
			a1 = a2;
			a2 = temp;
			temp = b1;
			b1 = b2;
			b2 = temp;
		}
		int num1 = 1;
	    boolean flag = false;//设置标识看是否需要前面的空格
	    while(a1 * k >= b1 * num1) num1++;//这里的数据是小于第一个数的 
	    while(a1 * k < b1 * num1 && b2 * num1 < a2 * k) {//在两个数中间
	        if(gcd(num1, k) == 1) {	        	
	        	if(flag) {
	        		System.out.print(" "+num1+"/"+k);
	        	}else {
	        		System.out.print(num1+"/"+k);
	        	}
	        	flag = true;
	            
	        }
	        num1++;
	    }
	
	}
	/**
	 *  求a b 的最大公约数
	 * @param a
	 * @param b
	 * @return
	 */
	private static int gcd(int a, int b){
	    return b == 0 ? a : gcd(b, a % b);
	}

}
