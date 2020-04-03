Forbes magazine publishes every year its list of billionaires based on the annual ranking of the world's wealthiest people. Now you are supposed to simulate this job, but concentrate only on the people in a certain range of ages. That is, given the net worths of *N* people, you must find the *M* richest people in a given range of their ages.

### Input Specification:

Each input file contains one test case. For each case, the first line contains 2 positive integers: *N* (≤105) - the total number of people, and *K* (≤103) - the number of queries. Then *N* lines follow, each contains the name (string of no more than 8 characters without space), age (integer in (0, 200]), and the net worth (integer in [−106,106]) of a person. Finally there are *K* lines of queries, each contains three positive integers: *M* (≤100) - the maximum number of outputs, and [`Amin`, `Amax`] which are the range of ages. All the numbers in a line are separated by a space.

### Output Specification:

For each query, first print in a line `Case #X:` where `X` is the query number starting from 1. Then output the *M* richest people with their ages in the range [`Amin`, `Amax`]. Each person's information occupies a line, in the format

```
Name Age Net_Worth

      
    
```

The outputs must be in non-increasing order of the net worths. In case there are equal worths, it must be in non-decreasing order of the ages. If both worths and ages are the same, then the output must be in non-decreasing alphabetical order of the names. It is guaranteed that there is no two persons share all the same of the three pieces of information. In case no one is found, output `None`.

### Sample Input:

```in
12 4
Zoe_Bill 35 2333
Bob_Volk 24 5888
Anny_Cin 95 999999
Williams 30 -22
Cindy 76 76000
Alice 18 88888
Joe_Mike 32 3222
Michael 5 300000
Rosemary 40 5888
Dobby 24 5888
Billy 24 5888
Nobody 5 0
4 15 45
4 30 35
4 5 95
1 45 50

      
    
```

### Sample Output:

```out
Case #1:
Alice 18 88888
Billy 24 5888
Bob_Volk 24 5888
Dobby 24 5888
Case #2:
Joe_Mike 32 3222
Zoe_Bill 35 2333
Williams 30 -22
Case #3:
Anny_Cin 95 999999
Michael 5 300000
Alice 18 88888
Cindy 76 76000
Case #4:
None
```

### 提交

```java
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

```

