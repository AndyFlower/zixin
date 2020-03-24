package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PATB1053 {

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);  使用scanner有一个超时
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //String str = sc.nextLine();
        String str = bf.readLine();
        int num = Integer.parseInt(str.split(" ")[0]);
        double d = Double.parseDouble(str.split(" ")[1]);
        int max = Integer.parseInt(str.split(" ")[2]);
        ArrayList<String>  list = new ArrayList<String>();
        for(int i=0;i<num;i++) {
        	//list.add(sc.nextLine());
        	list.add(bf.readLine());
        }
        
        //sc.close();
        bf.close();
        int maybeEmpty = 0;
        int empty=0;
        for(int i=0;i<list.size();i++) {
        	int lessThanNum = 0 ;
        	
        	String[] temp = list.get(i).split(" ");
        	for(int j=1;j<temp.length;j++) {
        		if(Double.parseDouble(temp[j])<d) {
        			lessThanNum++;
        		};
        	}
        	if(lessThanNum>(Integer.parseInt(temp[0])/2)) {
        		if(Integer.parseInt(temp[0])>max) {
        			empty++;
        		}else {
        			maybeEmpty++;
        		}
    		}
        }
        
        //System.out.println(maybeEmpty*100.0/num+"% "+empty*100.0/num+"%");
        System.out.printf("%.1f%% %.1f%%", maybeEmpty*100.0/num, empty*100.0/num);
	}

}
