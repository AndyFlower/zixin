### **1080** **Graduate Admission** (30分)

It is said that in 2011, there are about 100 graduate schools ready to proceed over 40,000 applications in Zhejiang Province. It would help a lot if you could write a program to automate the admission procedure.

Each applicant will have to provide two grades: the national entrance exam grade *G**E*, and the interview grade *G**I*. The final grade of an applicant is (*G**E*+*G**I*)/2. The admission rules are:

- The applicants are ranked according to their final grades, and will be admitted one by one from the top of the rank list.
- If there is a tied final grade, the applicants will be ranked according to their national entrance exam grade *G**E*. If still tied, their ranks must be the same.
- Each applicant may have *K* choices and the admission will be done according to his/her choices: if according to the rank list, it is one's turn to be admitted; and if the quota of one's most preferred shcool is not exceeded, then one will be admitted to this school, or one's other choices will be considered one by one in order. If one gets rejected by all of preferred schools, then this unfortunate applicant will be rejected.
- If there is a tied rank, and if the corresponding applicants are applying to the same school, then that school must admit all the applicants with the same rank, **even if its quota will be exceeded**.

### Input Specification:

Each input file contains one test case.

Each case starts with a line containing three positive integers: *N* (≤40,000), the total number of applicants; *M* (≤100), the total number of graduate schools; and *K* (≤5), the number of choices an applicant may have.

In the next line, separated by a space, there are *M* positive integers. The *i*-th integer is the quota of the *i*-th graduate school respectively.

Then *N* lines follow, each contains 2+*K* integers separated by a space. The first 2 integers are the applicant's *G**E* and *G**I*, respectively. The next *K* integers represent the preferred schools. For the sake of simplicity, we assume that the schools are numbered from 0 to *M*−1, and the applicants are numbered from 0 to *N*−1.

### Output Specification:

For each test case you should output the admission results for all the graduate schools. The results of each school must occupy a line, which contains the applicants' numbers that school admits. The numbers must be in increasing order and be separated by a space. There must be no extra space at the end of each line. If no applicant is admitted by a school, you must output an empty line correspondingly.

### Sample Input:

```in
11 6 3
2 1 2 2 2 3
100 100 0 1 2
60 60 2 3 5
100 90 0 3 4
90 100 1 2 0
90 90 5 1 3
80 90 1 0 2
80 80 0 1 2
80 80 0 1 2
80 70 1 3 2
70 80 1 2 3
100 100 0 2 4

      
    
```

### Sample Output:

```out
0 10
3
5 6 7
2 8

1 4

      
    
```

作者: CHEN, Yue

单位: 浙江大学

时间限制: 250 ms

内存限制: 64 MB

代码长度限制: 16 KB

### 题意

有N个考生，M所学校。每个考生都有K个志愿学校。每个学校也有招生人数限制，限制给出多有考生的初试成绩GE，面试成绩G1和K个志愿学校的编号，要求模拟学校录取招生的过程，并输出每个学校录取的考生编号(从小到大)，以下是录取规则：

先按考生的总分除以2从高到低，总分相同的按GE从高到低，如果GE相同则按排名相同来处理。

按排名先后来考虑每个学生最终录取的学校，对每个考生，按K个志愿的先后顺序考虑，如果当前志愿学校的已经招生人数未达到则录取他也不再考虑后面的志愿；如果当前志愿学校的以招生人数达到额度，但是该校上一个录取考生的排名和该考生相同，则可不受限制，破格录取他。除以上情况均表示该学校无法录取他，考虑后面的学校、

###  代码

```java
package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PATA1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stunum = sc.nextInt();// 学生
		int schnum = sc.nextInt();// 学校
		int zhiyuannum = sc.nextInt();// 志愿
		Student1080[] stuarr = new Student1080[stunum];
		School1080[] scharr = new School1080[1101];
		for (int i = 0; i < schnum; i++) {
			School1080 s = new School1080();
			s.quote = sc.nextInt();
			s.stuNum = 0;// 当前以招生人数
			s.lastAdmit = -1;// 上一个录取的名额
			Integer sa[] = new Integer[stunum];
			Arrays.fill(sa, -1);
			s.id = sa;
			scharr[i] = s;// 补充学校信息
		}
		for (int i = 0; i < stunum; i++) {
			Student1080 s = new Student1080();
			s.stuId = i;
			int GE = sc.nextInt();
			s.GE = GE;
			int GI = sc.nextInt();

			s.GI = GI;
			s.sum = GE + GI;
			Integer ar[] = new Integer[zhiyuannum];
			for (int j = 0; j < zhiyuannum; j++) {
				ar[j] = sc.nextInt();
			}
			s.cho = ar;
			stuarr[i] = s;
		}
		sc.close();
		Arrays.sort(stuarr, 0, stunum, new Comparator1080());
		for (int i = 0; i < stunum; i++) {
			if (i > 0 && stuarr[i].sum == stuarr[i - 1].sum && stuarr[i].GE == stuarr[i - 1].GE) {
				stuarr[i].r = stuarr[i - 1].r;
			} else {
				stuarr[i].r = i;
			}
		}
		for (int i = 0; i < stunum; i++) {
			for (int j = 0; j < zhiyuannum; j++) {
				int choice = stuarr[i].cho[j];// 考生i的第j个选择
				int num = scharr[choice].stuNum;
				int last = scharr[choice].lastAdmit;
				// System.out.println(num+" "+i+" "+last);
				if (num < scharr[choice].quote || (last != -1 && stuarr[i].r == stuarr[last].r)) {
					scharr[choice].id[num] = i;
					scharr[choice].lastAdmit = i;
					scharr[choice].stuNum++;
					break;// 录取之后就不需要再处理后面的了
				}
			}
		}
		for (int i = 0; i < schnum; i++) {
			if (scharr[i].stuNum > 0) {// 大于0说明有招生
				Arrays.sort(scharr[i].id, 0, scharr[i].stuNum, new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {//注意这里排序的元素
						return stuarr[o1].stuId - stuarr[o2].stuId;

					}
				});
				// Arrays.sort(scharr[i].id,Collections.reverseOrder());
				String s = new String();
				for (int j = 0; j < scharr[i].stuNum; j++) {
					s += stuarr[scharr[i].id[j]].stuId + " ";
				}

				System.out.println(s.substring(0, s.length() - 1));
			} else {
				System.out.println("");
			}
		}

	}

}

class Student1080 {
	int GE, GI, sum;// 初试面试和总成绩
	int r, stuId;// 排名和学生ID
	Integer cho[];// 志愿学校编号
}

class School1080 {
	int quote;// 招生人数
	int stuNum;// 当前实际招生的人数
	Integer id[];// 招生的学生编号
	int lastAdmit;// 最后一个招生的编号
}

class Comparator1080 implements Comparator<Student1080> {

	@Override
	public int compare(Student1080 o1, Student1080 o2) {
		if (o1.sum != o2.sum) {
			return o2.sum - o1.sum;
		} else {
			return o2.GE - o1.GE;
		}
	}

}


```

