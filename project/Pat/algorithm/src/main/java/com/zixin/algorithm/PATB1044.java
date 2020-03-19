package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//把火星文的个位数和进位后的数分别保存到两个字符数组，其下标表示其代表的值。通过判断输入的字符的第一位是数字还是字母来判断输出的是地球文还是
public class PATB1044 {
	static String[] e = {"tret", "jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec"};
    static String[] a = {"", "tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            char[] chars = str.toCharArray();
            if (chars[0] >= '0' && chars[0] <= '9') {//如果是数字地球文转火星文
                eToa(Integer.parseInt(str));

            }else {
                System.out.println(aToe(str));
            }
        }

    }

    // 外星文转地球
    private static int aToe(String str){
        int result = 0;
        String low = str.substring(str.length() - 3);
        for (int i = 0; i < 13; i++) {
            if (e[i].equals(low)) {
                result += i;
                break;
            }
            else if (a[i].equals(low)) {
                result += (i*13);
                break;
            }
        }
        if (str.length() > 4) {
            for (int i = 0; i < 13; i++) {
                if (a[i].equals(str.substring(0,3))) {
                    result += i * 13;
                    break;
                }
            }
        }
        return result;
    }

    // 地球转外星文
    private static void eToa(int res){
        if (res/13 != 0)
            System.out.print(a[res/13]);
        if (res / 13 != 0 && res % 13 != 0)
            System.out.print(" " + e[res % 13]);
        if (res/13 == 0)
            System.out.print(e[res % 13]);
        System.out.println();
    }

}
