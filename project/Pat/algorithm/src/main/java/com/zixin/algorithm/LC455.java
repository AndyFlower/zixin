package com.zixin.algorithm;

import java.util.Arrays;

/**
 * 
 * @ClassName: LC455
 * @Description:455. 分发饼干
 * @author Administrator
 * @date 2020-03-20 22:33:22
 * 
 */
public class LC455 {
	//贪心算法
	public int findContentChildren(int[] g, int[] s) {

		Arrays.sort(g);
		Arrays.sort(s);
		int i=0,j=0,res=0;
		for(i=0;i<g.length;i++) {//遍历小孩
			while(j<s.length&&s[j]<g[i]) {//如果s(j)不满足i那么他一定不满足i之后的所有小朋友
				j++;
			}
			if(j<s.length) {
				res++;
				j++;
			}
		}
		return res;
    }
}
