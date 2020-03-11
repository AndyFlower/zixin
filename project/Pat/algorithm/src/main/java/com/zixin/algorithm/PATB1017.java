package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class PATB1017 {

	public static void main(String[] args) throws IOException {
		//使用Scanner提交超时 BufferedReader可以
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] buf = bf.readLine().split(" ");
		BigInteger a = new BigInteger(buf[0]);
		BigInteger b = new BigInteger(buf[1]);
        //sc.close();
        System.out.println(a.divide(b)+" "+ a.mod(b));
	}

}
