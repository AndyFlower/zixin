package com.zixin.learn.other;
/**  
 * @Title:  Dfs03.java   
 * @Package com.zixin.learn.other   
 * @Description:    描述   
 * @author: Sanglp     
 * @date:   2020年4月11日 下午5:49:36   
 * @version V1.0 
 * qq交流群：1027372701
 */
public class Dfs03 {

	static int m;
	static int n;
	static int [][] arr;
	public static void main(String[] args) {
		int res=0;
		arr = new int[6][7];
		arr[0]= new int[] {0,0,0,0,0,0,0};
		arr[1]= new int[] {0,2,2,0,0,2,0};
		arr[2]= new int[] {0,2,2,2,2,0,0};
		arr[3]= new int[] {0,2,0,0,2,0,0};
		arr[4]= new int[] {0,0,2,2,2,2,0};
		arr[5]= new int[] {0,0,0,0,0,0,0};
		dfs(0,0);
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				if(arr[i][j]==0) {
					res++;
				}
			}
		}
		System.out.println(res);
		
		
	}
	static void dfs(int x,int y) {
		
		if(x<0||y<0||x>m+1||y>n+1||arr[x][y]!=0) {
		 return ;//边界问题	
		}
		arr[x][y]=1;
		dfs(x+1,y);
		dfs(x-1,y);
		dfs(x,y+1);
		dfs(x,y-1);
	}
	
	
}
