package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * 
 * @author sangliping
 * 注意：只有1个符合时候的输出
 *     temp.divide(new BigDecimal(validNum),2,BigDecimal.ROUND_DOWN) 除不尽的情况的保留小数位情况 ROUND_DOWN表示直接去掉多余的小数位
 */
public class PATB1054 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        br.close();
        int validNum =0;//有效数字个数
        BigDecimal  temp = BigDecimal.ZERO;//存储中间计算的结果
        String [] arr = str.split(" ");
        for(int i=0;i<num;i++) {
        	if(!isValidNum(arr[i])) {
        		System.out.println("ERROR: "+arr[i]+" is not a legal number");
        	}else {
        		validNum++;
        		temp=temp.add(new BigDecimal(arr[i]));
        	}
        }
        if(validNum==0) {
        	System.out.println("The average of 0 numbers is Undefined");
        }else if(validNum==1){//注意这里的输出需要特殊处理
        	System.out.printf("The average of 1 number is %.2f",temp);
        }else {
        System.out.printf("The average of %d numbers is %.2f",validNum,temp.divide(new BigDecimal(validNum),2,BigDecimal.ROUND_DOWN));
        }
	}

	
	private static boolean isValidNum(String str) {
		BigDecimal number = BigDecimal.ZERO;
		if(str.equals("0")) {
			return true;//如果是0  返回true
		}
		try {
			 number = new BigDecimal(str); //会将非数字  以及多个.的情况都过滤掉的
		} catch (Exception e) {
			return false;
		}
		//System.out.println(number);
		if(number.compareTo(new BigDecimal("-1000"))<0||number.compareTo(new BigDecimal("1000"))>0) {
			return false;
		}
		//需要排出超过2位数的
		if(str.contains(".")) {
			String temp = str.substring(str.indexOf(".")+1, str.length());
			//System.out.println(temp);
			if(temp.length()>2) {
				return false;
			}
		}
		
		return true;
		
	}
}
