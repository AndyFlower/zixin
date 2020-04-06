package com.zixin.algorithm;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @ClassName: PATA1096
 * @Description: 全通过   需要处理大数 
 * @author Administrator
 * @date 2020-04-06 10:43:41
 */
public class PATA1096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		sc.close();
		BigInteger sqrt = getSqrt(n);//开方
		BigInteger ansI =BigInteger.ZERO;//对应的第一个整数
		BigInteger ansLen = BigInteger.ZERO;//最长连续长度
		for(BigInteger a=new BigInteger("2");a.compareTo(sqrt)<=0;a=a.add(new BigInteger("1"))) {//遍历连续的第一个整数
			BigInteger temp =new BigInteger("1");//temp为连续整数的乘积
			BigInteger j=a;//j从a开始连续增加 看最长能到多少
			while(true) {
				temp=temp.multiply(j);
				if(n.mod(temp).compareTo(BigInteger.ZERO)!=0) {
					break;
				}
				if(j.subtract(a).add(new BigInteger("1")).compareTo(ansLen)>0) {//发现了更长的长度
					ansI=a;//更新首字母
					ansLen=j.subtract(a).add(new BigInteger("1"));//更新长度预
				}
				j=j.add(new BigInteger("1"));//j递增
			}
		}
		
		if(ansLen.compareTo(BigInteger.ZERO)==0) {//如果长度为0   则为本身
			System.out.println(1);
			System.out.println(n);
		}else {
			System.out.println(ansLen);//有长度  则顺序输出
			boolean flag=false;
			for(BigInteger a = new BigInteger("0");a.compareTo(ansLen)<0;a=a.add(new BigInteger("1"))) {
				if(!flag) {
					System.out.print(ansI.add(a));
					flag=!flag;
				}else {
					System.out.print("*"+ansI.add(a));
				}
				
				
			}
		}

	}
	private static BigInteger getSqrt(BigInteger num) {
        String s = num.toString();
        int mlen = s.length();    //被开方数的长度
        int len;    //开方后的长度
        BigInteger beSqrtNum = new BigInteger(s);//被开方数
        BigInteger sqrtOfNum;    //存储开方后的数
        BigInteger sqrtOfNumMul;    //开方数的平方
        String sString;//存储sArray转化后的字符串
        if (mlen % 2 == 0) len = mlen / 2;
        else len = mlen / 2 + 1;
        char[] sArray = new char[len];
        Arrays.fill(sArray, '0');//开方数初始化为0
        for (int pos = 0; pos < len; pos++) {
            //从最高开始遍历数组，
            //每一位都转化为开方数平方后刚好不大于被开方数的程度
            for (char ch = '1'; ch <= '9'; ch++) {
                sArray[pos] = ch;
                sString = String.valueOf(sArray);
                sqrtOfNum = new BigInteger(sString);
                sqrtOfNumMul = sqrtOfNum.multiply(sqrtOfNum);
                if (sqrtOfNumMul.compareTo(beSqrtNum) == 1) {
                    sArray[pos] -= 1;
                    break;
                }
            }
        }
        return new BigInteger(String.valueOf(sArray));
    }

}
