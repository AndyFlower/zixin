package com.zixin.learn.nnuo;

public class DJ1155 {

	//求反序数 求1000到9999之间的反序数
	public static void main(String[] args) {
		for(int i=1000;i<9999;i++) {
			int x= i*9;
			int y=0;
			while(x>0) {
				y=y*10+(x%10);
				x=x/10;
			}
			if(y==i) {
				System.out.println(i);
			}
		}
		

	}

}
