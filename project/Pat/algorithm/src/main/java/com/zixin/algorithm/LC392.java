package com.zixin.algorithm;

public class LC392 {
   /**
    * 
    * @Title: main
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @author Administrator
    * @date 2020-03-20 22:26:22
    * @param @param args 参数
    * @return void 返回类型
    * @throws
    * 思考题  开一个26长度的数组 每个位置记录其所在的位置
    */
	public static void main(String[] args) {
		

	}
	//子序列可以不连续  子串需要连续
	//动态规划的思想
	public boolean isSubsequence(String s, String t) {
        int k =0;//表示当前已经匹配到s的哪个位置
        for(int i=0;i<t.length()&&k<s.length();i++) {
        	if(t.charAt(i)==s.charAt(k)) {
        		k++;
        	}
        	
        }
        return k==s.length();
    }
}
