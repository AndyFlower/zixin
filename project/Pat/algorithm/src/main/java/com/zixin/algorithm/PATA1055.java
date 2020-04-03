package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
/**
 * 提交   答案错误
 * @author sangliping
 *
 */
public class PATA1055 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String []s = br.readLine().split(" ");
		int num = Integer.parseInt(s[0]);//人数
		int querynum = Integer.parseInt(s[1]);//查询case
		PersonR [] arr = new PersonR[100010];
		for(int i=0;i<num ;i++) {//保存所有的数据
			String[] temp =br.readLine().split(" ");
			PersonR r = new PersonR();
			r.name=temp[0];
			r.age=Integer.parseInt(temp[1]);
			r.worths=Integer.parseInt(temp[2]);
			arr[i]=r;
		}
		Arrays.sort(arr,0,num,new Comparator<PersonR>() {//排序

			@Override
			public int compare(PersonR o1, PersonR o2) {

				if(o1.worths!=o2.worths) {
					return o2.worths-o1.worths;
				}else if(o1.age!=o2.age) {
					return o1.age-o2.age;
				}else {
					return o1.name.compareTo(o2.name);
				}
				
			}
		});
		
		int validNum = 0;
		PersonR [] valid = new PersonR[100010];
		int Age[] = new int[100010];
		for(int i=0;i<num;i++) {//预处理只保留前100名
			if(Age[arr[i].age]<100){
				Age[arr[i].age]++;
				valid[validNum++]=arr[i];
			}
		}
		
		int m ,ageL,ageR;
		for(int i=1;i<=querynum;i++) {
			String[] tt =br.readLine().split(" ");
			m=Integer.parseInt(tt[0]);
			ageL=Integer.parseInt(tt[1]);
			ageR=Integer.parseInt(tt[2]);
			System.out.println("Case "+(i)+"#:");
			int printNum=0;
			for(int j=0;j<validNum&&printNum<m;j++) {
				if(valid[j].age>=ageL&&valid[j].age<=ageR) {
					System.out.println(valid[j].name+" "+valid[j].age+" "+valid[j].worths);
					printNum++;
				}
			}
			if(printNum==0) {
				System.out.println("None");
			}
		}
		br.close();
	}

}

class PersonR{
	String name;
	int age;
	int worths;
}
