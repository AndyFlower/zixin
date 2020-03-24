package com.zixin.learn.nnuo;

public class AnyToTen {

	public static void TwoToTen(String[] args) {
		char s[] = new char[105];//保存二进制字符串
		int ans = 0 ;
		int len = s.length;
		for(int i=0;i<len;i++) {
			if(s[i]=='0') {//如果是0就乘2
				ans = ans*2;
			}else {//是1就乘2加1
				ans=ans*2+1;
			}
		}
		System.out.println(ans);

	}
	
	
	public static void AnyToTen(String[] args) {
		char s[] = new char[105];//保存任何进制的字符串
		int ans = 0 ;
		int len = s.length;
		int x = 16;//x表示是几进制
		for(int i=0;i<len;i++) {
			ans = ans *x;
			if(s[i]>='0'&&s[i]<='9') {
				ans = ans+(s[i]-'0');
			}else {
				ans = ans+(s[i]-'A')+10;
			}
		}
		System.out.println(ans);

	}

}
