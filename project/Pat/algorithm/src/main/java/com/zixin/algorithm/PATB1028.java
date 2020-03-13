package com.zixin.algorithm;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PATB1028 {

	public static void main(String[] args) throws IOException, ParseException {

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int valid = 0;// 有效个数初始化为0
		Date min = null;
		Date max = null;
		String maxName = "";
		String minName = "";
        String  current = "2014/09/06";
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy/mm/dd");
		Date today = fmt.parse(current);
		// System.out.println(n);

		Calendar to = Calendar.getInstance();
		to.setTime(today);
		Calendar from = Calendar.getInstance();
		for (int i = 0; i < n; i++) {

			String name = sc.next();
			Date birth = fmt.parse(sc.next());
			from.setTime(birth);
			// 小于等于0说明日期是合法的
			if (birth.compareTo(today) <= 0 && isValieDay(current, fmt.format(birth))) {
				valid = valid + 1;
				if (min == null) {
					min = birth;
					minName = name;
				} else {
					if (differentDaysByDate(birth, today) < differentDaysByDate(min, today)) {
						min = birth;
						minName = name;
					}
				}

				if (max == null) {
					max = birth;
					maxName = name;
				} else {
					if (differentDaysByDate(birth, today) > differentDaysByDate(max, today)) {
						max = birth;
						maxName = name;
					}
				}
			}

		}
		sc.close();
		//注意这里如果没有有效的数据时的输出 
		if (valid == 0) {
			System.out.println("0");
		} else {
			System.out.println(valid + " " + maxName + " " + minName);
		}
	}

	public static boolean isValieDay(String fromDate, String toDate) {
		int fromYear = Integer.parseInt(fromDate.substring(0, 4));
		int toYear = Integer.parseInt(toDate.substring(0, 4));
		int fromMonth = Integer.parseInt(fromDate.substring(5, 7));
		int toMonth = Integer.parseInt(toDate.substring(5, 7));
		int fromDay = Integer.parseInt(fromDate.substring(8, 10));
		int toDay = Integer.parseInt(toDate.substring(8, 10));
		if (fromYear - toYear > 200) {
			return false;
		} else if (fromYear - toYear < 200) {
			return true;
		} else {// 年相同
			if (fromMonth < toMonth) {
				return true;
			} else if (fromMonth > toMonth) {
				return false;
			} else {
				if (fromDay <= toDay) {
					return true;
				} else {
					return false;
				}
			}
		}
	}

	public static int differentDaysByDate(Date date1, Date date2) {
		int days = (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
		return days;
	}
}
