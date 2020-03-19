package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PATB1047 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		HashMap<String,Integer> hm  = new HashMap<String,Integer>();
		String duinunum = "";
		int gradenum = 0;
		for(int i=0;i<num;i++) {
			String s = br.readLine();
			String duiwu = s.split("-")[0];
			int grade = Integer.parseInt(s.split(" ")[1]);
			if(hm.containsKey(duiwu)) {
				hm.put(duiwu, hm.get(duiwu)+grade);
				if(hm.get(duiwu)>gradenum) {
					gradenum = hm.get(duiwu);
					duinunum=duiwu;
				}
			}else {
				hm.put(duiwu, grade);
				if(grade>gradenum) {
					gradenum = grade;
					duinunum=duiwu;
				}
			}
		}
		br.close();
		System.out.println(duinunum+" "+gradenum);

	}

	
}
