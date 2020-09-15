package com.slp.leetcode;

/**
 * @ClassName ReverseInteger
 * @Description 7 整数反转
 * @Author sanglp
 * @Date 2020/9/15 9:26
 * @Version 1.0
 **/
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        long n =0;//找一个long来接收结果 因为溢出了long也是可以接收
       while (x!=0){//这里可以找一个三位数什么的进行一下推演看结果
           n = n*10+x%10;
           x = x/10;
       }
       //这里判断是否溢出 也可以使用(int)n==n来进行判断  因为会强转 如果强转了还一样那么元原数据没有溢出
       if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE){
           return 0;
       }
       return (int)n;
    }

    public int reverseVersion2(int x) {
        int res = 0;
        while (x != 0) {
            int t = x % 10;
            int newRes = res * 10 + t;
            //注意这里处理溢出的方法
            if ((newRes - t) / 10 != res)
                return 0;
            res = newRes;
            x = x / 10;
        }
        return res;
    }

}
