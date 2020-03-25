package com.zixin.learn.nnuo;

public class TenToN {

	/**
	 * 
	 * @Title: main
	 * @Description:10进制转n进制  n小于10
	 * @author Administrator
	 * @date 2020-03-24 23:24:42
	 * @param @param args 参数
	 * @return void 返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		int n=100,x=2;//x代表是转几进制
		int [] s=new int[105];
		int cnt=0;
		while(n>0) {
			int w=(n%x);//使用短除法    先模再除  然后逆序输出
			s[cnt++]=w;
			n/=x;
		}
		//逆序输出
		for(int i=cnt-1;i>=0;i--) {
			System.out.print(s[i]);
		}

	}

}
