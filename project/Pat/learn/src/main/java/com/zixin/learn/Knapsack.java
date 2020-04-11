package com.zixin.learn;

/**
 * 
 * @ClassName: Knapsack
 * @Description: 完全背包问题
 * @author Administrator
 * @date 2020-04-11 11:44:54
 */
public class Knapsack {
	private static int[] P={0,5,8};//物品价值
    private static int[] V={0,5,7};//物品重量
    private static int T = 10;

    //自上而下记忆数组
    private Integer[][] results = new Integer[P.length + 1][T + 1];

    /**
     * 
     * @Title: ks2
     * @Description: 完全背包问题动态规划解法
     * @author Administrator
     * @date 2020-04-11 11:45:57
     * @param @param i 物品的个数
     * @param @param t 总总量
     * @param @return 参数
     * @return int 返回类型
     * @throws
     */
    private int ks2(int i, int t){
        // 如果该结果已经被计算，那么直接返回
        if (results[i][t] != null) return results[i][t];
        int result = 0;
        if (i == 0 || t == 0){
            // 初始条件  第一行 第一列均为0  因为此时表示没有物品或者没有价值
            result = 0;
        } else if(V[i] > t){
            // 物品的重量 大于当前的空间  放不下 则该值为上一个物品的价值 因为不增加物品  所以空间不变 
            result = ks2(i-1, t);
        } else {
            // 可以装下
            // k表示可以取该物品的数量，最大是总重量除以该物品的体积   取其中的几个 使得其价值最大
            for (int k = 0; k * V[i] <= t; k++){
                int tmp = ks2(i-1, t - V[i] * k) + P[i] * k;//取当前物品k个  则上一个的体积就得相应减少t-V[i]*k 
                if (tmp > result){
                    result = tmp;
                }
            }
        }
        results[i][t] = result;
        return result;
    }
}
