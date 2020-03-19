package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * 使用Scanner 和BufferedReader均超时  需要使用StreamTokenizer
 * @author sangliping
 *
 */
public class PATB1049 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st=new StreamTokenizer(bf);
        st.nextToken();

		int num = (int) st.nval;
		double sum = 0;
		for(int i=0;i<num;i++) {
			st.nextToken();
			sum =sum+ st.nval*(i+1)*(num-i);
		}
		bf.close();
       System.out.printf("%.2f",sum);//格式化输出
	}

}
