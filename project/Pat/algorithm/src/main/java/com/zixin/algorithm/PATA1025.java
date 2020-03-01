package com.zixin.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 注意arays.sort部分排序的起始位置
 * @author Administrator
 *
 */
public class PATA1025 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int classNum = scanner.nextInt();// 考场数目
		int sumNum = 0;// 总人数
		Comparators comparators = new Comparators();
		Student[] stus = new Student[10000];
		for (int i = 1; i <= classNum; i++) {

			int studentNum = scanner.nextInt();// 考场的人数
			for (int j = 0; j < studentNum; j++) {
				Student student = new Student();
				stus[sumNum] = student;
				stus[sumNum].id = scanner.next();
				stus[sumNum].score = scanner.nextInt();
				stus[sumNum].location_number = i;
				sumNum++;
			}
			// 对这个考场的考生场内排序
			Arrays.sort(stus, sumNum - studentNum, sumNum , comparators);
			
			stus[sumNum - studentNum].local_rank = 1;
			int m1=1;
			for (int a = sumNum - studentNum + 1; a < sumNum; a++) {
				if (stus[a].score == stus[a - 1].score) {
					stus[a].local_rank = stus[a - 1].local_rank;
					m1++;
				} else {
					//stus[a].local_rank = a + 1;
					m1++;
					stus[a].local_rank = m1;
				}
			}

		}
		Arrays.sort(stus, 0, sumNum, comparators);
		
		int ad = 1;// 记录当前考生的排名
		for (int g = 0; g < sumNum; g++) {
			if (g > 0 && stus[g].score != stus[g - 1].score) {
				ad = g + 1;
			}
			System.out.println(stus[g].id + " " + stus[g].score + " " + ad + " " + stus[g].location_number + " "
					+ stus[g].local_rank);

		}

	}

}

class Student {
	String id;// 准考证号
	Integer score;// 分数
	int location_number;// 考场号
	int local_rank;// 考场内排名

	public Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}

	public Student() {
		super();
	}

	

}

// 比较器
class Comparators implements Comparator<Student> {
	public int compare(Student stu1, Student stu2) {
		
		if (stu1.score > stu2.score) {
			System.out.println(stu1.score+","+stu2.score+"score>");
			return -1;
		} else if (stu1.score < stu2.score) {
			System.out.println(stu1.score+","+stu2.score+"score<");
			return 1;
		} else {
			// 如果分数相同，则准考证号小的在前
			if (Integer.parseInt(stu1.id) < Integer.parseInt(stu2.id)) {
				System.out.println(stu1.id+","+stu2.id+"id<");
				return -1;
			} else if (Integer.parseInt(stu1.id) > Integer.parseInt(stu2.id)) {
				System.out.println(stu1.id+","+stu2.id+"id>");
				return 1;
			} else {
				return 0;
			}
		}
	}
}
