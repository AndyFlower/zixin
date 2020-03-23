package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class PATB1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(str.split(" ")[0]);
        double d = Double.parseDouble(str.split(" ")[1]);
        int max = Integer.parseInt(str.split(" ")[2]);
        ArrayList<String>  list = new ArrayList<String>();
        for(int i=0;i<num;i++) {
        	list.add(sc.nextLine());
        }
        
        sc.close();
        int maybeEmpty = 0;
        int empty=0;
        for(int i=0;i<list.size();i++) {
        	int lessThanNum = 0 ;
        	
        	String[] temp = list.get(i).split(" ");
        	for(int j=0;j<temp.length;j++) {
        		if(Double.parseDouble(temp[j])<d) {
        			lessThanNum++;
        		};
        	}
        	if(lessThanNum>max) {
        		empty++;
        	}else {
        		if(lessThanNum>=(temp.length+1)/2) {
        			maybeEmpty++;
        		}
        	}
        }
        
        //System.out.println(maybeEmpty*100.0/num+"% "+empty*100.0/num+"%");
        System.out.printf("%.1f%% %.1f%%", maybeEmpty*100.0/num, empty*100.0/num);
	}

}
