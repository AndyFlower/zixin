package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @ClassName: PATA1049
 * @Description: 当前处理的是第k个位的数字
 * left表示第k位的高位表示的数
 * right表示第k位的低位表示的数
 * now=0 ans+=left*a;
 * now=1 ans+=left*a+right+1
 * now>=2 ans+=(left+1)*a
 * @author Administrator
 * @date 2020-04-05 21:58:46
 */
public class PATA1049 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int a=1;
		int ans=0;
		int left=0;
		int right=0;
		int now;
		while(n/a!=0) {
			left=n/(a*10);
			now=n/a%10;
			right=n%a;
			if(now==0) {
				ans+=left*a;
			}else if(now==1) {
				ans+=left*a+right+1;
			}else {
				ans+=(left+1)*a;
			}
			a=a*10;
		}
		
		System.out.println(ans);

	}

}
