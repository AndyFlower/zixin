package com.zixin.algorithm;

import java.util.Scanner;
/**
 * 
 * @ClassName: PATA1044
 * @Description: 思路：令sums为1到i的和  这样的话一定是单调递增的   因此计算子序列的值只需要相应位置减去即可
 *                    因为数组严格单调递增   可以用二分法来查找
 *                    枚举左端点 因为S[j]-S[i-1]=S得S[j]=S[i-1]+S 就是找第一个超过所找值的位置
 *                    不一定有正好和相同的数字 因此需要进行两次遍历  第一次找出和值   第二次进行输出  
 * @author Administrator
 * @date 2020-04-05 15:44:59
 */
public class PATA1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sum = sc.nextInt();
		int sums[]=new int [num+1];
		for(int i=1;i<=num;i++) {
			int t =sc.nextInt();
			sums[i]=sums[i-1]+t;//求出sum数组
		}
		sc.close();
		int nearS=10000000;
		for(int i=1;i<=num;i++) {//枚举左端点
			int j=firstMore(i,num+1,sums[i-1]+sum,sums);//求右端点
			if(sums[j-1]-sums[i-1]==sum) {//查找乘号
				nearS=sum;//最接近的数就是sum
				break;
			}else if(j<=num&&sums[j]-sums[i-1]<nearS) {
				nearS=sums[j]-sums[i-1];//更新nearS
			}
		}
		for(int i=1;i<=num;i++) {
			int j=firstMore(i,num+1,sums[i-1]+nearS,sums);//求右端点
			if(sums[j-1]-sums[i-1]==nearS) {//查找成功
				System.out.println(i+"-"+(j-1));//输出左端点和右端点
			}
		}
 	}
	
	static int firstMore(int L,int R,int x,int sums[]) {
		int left =L;
		int right=R;
		int mid=0;
		while(left<right) {
			mid=(left+right)/2;
			if(sums[mid]>x) {
				right=mid;
			}else {
				left=mid+1;
			}
		}
		return left;
	}
}
