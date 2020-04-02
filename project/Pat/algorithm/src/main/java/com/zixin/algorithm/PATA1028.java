package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class PATA1028 {

	/**
	 * 
	 * @Title: main
	 * @Description:最后一个点超时
	 * @author Administrator
	 * @date 2020-04-02 23:10:30
	 * @param @param args
	 * @param @throws IOException 参数
	 * @return void 返回类型
	 * @throws
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int n= Integer.parseInt(arr[0]);
		int c = Integer.parseInt(arr[1]);
		SRecord[] arr1= new SRecord[n];
		for(int i=0;i<n;i++) {
			String [] temp = br.readLine().split(" ");
			SRecord s =new SRecord();
			s.id=temp[0];
			s.name=temp[1];
			s.score=Integer.parseInt(temp[2]);
			arr1[i]=s;
		}
		br.close();
		if(c==1) {
			Arrays.sort(arr1,new Comparators1());
		}else if(c==2) {
			Arrays.sort(arr1,new Comparators2());
		}else {
			Arrays.sort(arr1,new Comparators3());
		}

		for(int i=0;i<n;i++) {
			System.out.println(arr1[i].id+" "+arr1[i].name+" "+arr1[i].score);
		}
	}

}

class SRecord{
	String id;
	String name;
	int score;
	
}

class Comparators1 implements Comparator<SRecord> {
	public int compare(SRecord stu1, SRecord stu2) {
		return stu1.id.compareTo(stu2.id);
		
		
	}
}
class Comparators2 implements Comparator<SRecord> {
	public int compare(SRecord stu1, SRecord stu2) {
		 if(stu1.name.compareTo(stu2.name)!=0) {
			 return stu1.name.compareTo(stu2.name);
		 }else {
			 return stu1.id.compareTo(stu2.id);
		 }
		
		
	}
}

class Comparators3 implements Comparator<SRecord> {
	public int compare(SRecord stu1, SRecord stu2) {
		 if(stu1.score!=stu2.score) {
			 return stu1.score-stu2.score;
		 }else {
			 return stu1.id.compareTo(stu2.id);
		 }
		
		
	}
}