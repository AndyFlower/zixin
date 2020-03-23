package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author sangliping
 * 未通过
 */
public class PATB1052 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        List<String> hand = parse(in.nextLine());
        List<String> eye = parse(in.nextLine());
        List<String> mouth = parse(in.nextLine());
        int k = Integer.parseInt(in.nextLine());
        String [][] arr = new String[k][5];
        for(int i=0;i<k;i++) {
        	arr[i] = in.nextLine().split(" ");
        }
        for (int i = 0; i < k; i++) {
            String[] num = arr[i];
            int num0 = Integer.parseInt(num[0]);
            int num1 = Integer.parseInt(num[1]);
            int num2 = Integer.parseInt(num[2]);
            int num3 = Integer.parseInt(num[3]);
            int num4 = Integer.parseInt(num[4]);

            if (num0 >= hand.size() || num0 < 1 || num4 >= hand.size() || num4 < 1 || num1 >= eye.size()
                    || num1 < 1 || num3 >= eye.size() || num3 < 1 || num2 >= mouth.size() || num2 < 1) {
                System.out.println("Are you kidding me? @\\/@");
                continue;
            }

            System.out.println(hand.get(num0) + "(" + eye.get(num1) + mouth.get(num2) + eye.get(num3) + ")"
                    + hand.get(num4));
        }
        in.close();
    }
	
    public static List<String> parse(String s) {
        if(s.equals("") || s.isEmpty())
            return null;
        boolean isStart = false;
        List<String> list = new ArrayList<>();
        String temp = "";
        list.add(temp);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                isStart = true;
            } else if (s.charAt(i) == ']') {
                isStart = false;
                list.add(temp);
                temp = "";
            } else {
                if (isStart) {
                    temp += s.charAt(i);
                }
            }
        }
        return list;
    }
}
