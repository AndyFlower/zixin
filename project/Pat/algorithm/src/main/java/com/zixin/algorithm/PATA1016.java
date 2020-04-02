package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class PATA1016 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String toll[]=new String[24];
		String s = br.readLine();
		toll = s.split(" ");//资费
		
		int  num = Integer.parseInt(br.readLine());
		Record[] arr = new Record[num];
		for(int i=0;i<num;i++) {
			String[] temp = br.readLine().split(" ");
			Record r = new Record();
			r.name=temp[0];
			if(temp[2]=="on-line") {
				r.status=true;
			}else {
				r.status=false;
			}
			r.month=Integer.parseInt(temp[1].split(":")[0]);
			r.dd=Integer.parseInt(temp[1].split(":")[1]);
			r.hh=Integer.parseInt(temp[1].split(":")[2]);
			r.mm=Integer.parseInt(temp[1].split(":")[3]);
			arr[i]=r;
		}
		Arrays.sort(arr,new Comparator<Record>() {

			@Override
			public int compare(Record o1, Record o2) {
				if(o1.name!=o2.name) {
					if(o1.name.compareTo(o2.name)>0) {
						return o1.name.compareTo(o2.name);
					}else {
						return o2.name.compareTo(o1.name);
					}
				}else if(o1.month!=o2.month) {
					return o1.month-o2.month;
				}else if(o1.dd!=o2.dd) {
					return o1.dd-o2.dd;
				}else if(o1.hh!=o2.hh) {
					return o1.hh-o2.hh;
				}else {
					return o1.mm-o2.mm;
				}
			}
		});
		System.out.println("-----------");
	}

}

class Record {
	String name;
	int month,dd,hh,mm;
	boolean status;
	
}