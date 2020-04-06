package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
/**
 * 
 * @ClassName: PATA1050
 * @Description: 1 3测试点超时
 * @author Administrator
 * @date 2020-04-04 19:03:33
 */
public class PATA1050 {

	public static void main1(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String s1=br.readLine();
     char[] s2 = br.readLine().toCharArray();
     for(int i=0;i<s2.length;i++) {
    	 String s = String.valueOf(s2[i]);
    	 s1=s1.replaceAll(s, "");
     }
     System.out.println(s1);
	}
	
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 char[] s1=br.readLine().toCharArray();
	     char[] s2 = br.readLine().toCharArray();
	     HashMap<Character,Boolean> m =new  HashMap<Character,Boolean>();
	     for(int i=0;i<s2.length;i++) {
	    	 m.put(s2[i], true);
	     }
	     for(int i=0;i<s1.length;i++) {
	    	 char c = s1[i];
	    	 if(!m.containsKey(c)) {
	    		 System.out.printf("%c",s1[i]);
	    	 }
	     }
	}

}
