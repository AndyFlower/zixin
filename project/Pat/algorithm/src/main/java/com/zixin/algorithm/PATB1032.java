package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;
/**
 * 1032挖掘机问题
 * @author Administrator
 *
 */
public class PATB1032 {
	/**
	 * 这里存储我用的数组，学校编号为数组下标，分数为对应的下标值。注意校编号从1开始。
	 * @param args
	 * @throws IOException
	 * @desc 
	 * 用JAVA解题一般用Scanner类来进行输入，但对时间要求严格的题，用它可能会超时，我、解POJ1823的时候就遇到这样的问题，后改用StreamTokenizer类进行输入，
	 * 类java.io.StreamTokenizer可以获取输入流并将其分析为Token（标记）。 
StreamTokenizer的nextToken方法读取下一个标记 
默认情况下，StreamTokenizer认为下列内容是Token:字母、数字、除c和c++注释符号以外的其他符号。
     如符号“/”不是Token，注释后的内容也不是，而"/"是Token。单引号和双引号以及其总的内容，只能算一个Token。 
     为了从流中获取标记，可以调用StreamTokenizer的nextToken()方法。 
调用nextToken()方法以后，如果标记是字符串，可用 String s=st.sval,如果是整数用 int n=(int) st.nval得到。 
这个输入是一整行就可以 分析是先1个 然后2个2个
	 */
public static void main1(String[] args) throws IOException {
	StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
   //java.io.StreamTokenizer.nextToken() 方法分析从标记生成器的输入流中的下一个标记
	in.nextToken();
    int n = (int) in.nval,max = 0,len,sch = 0;
    int[] score = new int[n];
    while(0 < n--) {
        in.nextToken();
        int schoo = (int) in.nval;
        in.nextToken();
        int sco = (int) in.nval;
        score[schoo] += sco;
    }
    len = score.length;
    for(int i = 1 ; i < len ; i++) {
        if(score[i] > max) {
            max = score[i];
            sch = i;
        }
    }
    System.out.print(sch + " " + max);

}

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int index = 0;
	int[] record = new int[n];   // 标号存学校编号最多n行个学校，数组存总分
	
	for (int i = 0; i < n; i++) {
		int num = input.nextInt();
		record[num - 1] += input.nextInt();    // 索引+1为学校标号
	}
	input.close();
	
	for (int i = 1; i < n; i++) {
		if (record[i] > record[index]) {
			index = i;
		}
	}
	System.out.println(index + 1 + " " + record[index]);

}


}
