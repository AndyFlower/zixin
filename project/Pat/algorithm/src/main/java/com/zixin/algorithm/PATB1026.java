package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PATB1026 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
        int start = Integer.parseInt(str.split(" ")[0]);
        int end = Integer.parseInt(str.split(" ")[1]);
        int CLK_TCK  = 100; 
        //考虑四舍五入的时候使用+50 
        int consume = (end-start+50)/CLK_TCK;
        int hour = consume/3600;
        System.out.printf("%02d:",hour);
        int minute = (consume-hour*3600)/60;
        System.out.printf("%02d:",minute);
        int second = (consume-hour*3600)%60;
        System.out.printf("%02d",second);
       
	}

}
