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

