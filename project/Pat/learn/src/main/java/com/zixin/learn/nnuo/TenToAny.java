package com.zixin.learn.nnuo;

/**
 * 
 * @ClassName: TenToAny
 * @Description: 10进制转任何进制
 * @author Administrator
 * @date 2020-03-24 23:33:15
 */
public class TenToAny {

	public static void main(String[] args) {
		int n=100,x=16;
		int cnt =0;
		char [] s = new char[105];//10进制以上有字符 所以用char存储
		while(n>0) {
			int w= (n%x);
			if(w<10) {
				s[cnt++]=(char) (w+'0');//变字符加‘0’
			}else {
				s[cnt++]=(char) ((w-10)+'A');
			}
			n/=x;
		}
		
		for(int i=cnt-1;i>=0;i--) {
			System.out.print(s[i]);
			
		}

	}

}
