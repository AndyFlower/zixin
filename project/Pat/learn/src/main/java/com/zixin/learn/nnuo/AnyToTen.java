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

}
