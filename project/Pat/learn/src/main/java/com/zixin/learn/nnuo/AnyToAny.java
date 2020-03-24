package com.zixin.learn.nnuo;

public class AnyToAny {

	public static void main(String[] args) {
		char[] s=new char[105];
		int x=2,y=8;
		int ans=0;
		int len = s.length;
		for(int i=0;i<len;i++) {
			ans = ans *x;
			if(s[i]>='0'&&s[i]<='9') {
				ans = ans+(s[i]-'0');
			}else {
				ans = ans+(s[i]-'A')+10;
			}
		}
		char out[] = new char[105];
		int cnt=0;
		while(ans>0) {
			int w= (ans%x);
			if(w<10) {
				out[cnt++]=(char) (w+'0');//变字符加‘0’
			}else {
				out[cnt++]=(char) ((w-10)+'A');
			}
			ans/=x;
		}

		for(int i=cnt-1;i>=0;i--) {
			System.out.print(out[i]);
		}
	}

}
