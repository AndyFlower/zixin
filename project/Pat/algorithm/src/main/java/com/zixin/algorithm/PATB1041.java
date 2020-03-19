package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PATB1041 {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(rd.readLine());
		HashMap<String, Stu> h = new HashMap<String, Stu>();
		for (int i = 0; i < num; i++) {
			String s = rd.readLine();
			h.put(s.split(" ")[1], new Stu(s.split(" ")[0], s.split(" ")[1], s.split(" ")[2]));
		}

		int senum = Integer.parseInt(rd.readLine());
		String[] s = rd.readLine().split(" ");
		for (int i = 0; i < senum; i++) {
			if (h.containsKey(s[i])) {
				System.out.println(h.get(s[i]).getStuNo() + " " + h.get(s[i]).getKaoshi());
			}

		}
	}

	static class Stu {
		private String stuNo;
		private String jishi;
		private String kaoshi;

		public String getStuNo() {
			return stuNo;
		}

		public void setStuNo(String stuNo) {
			this.stuNo = stuNo;
		}

		public String getJishi() {
			return jishi;
		}

		public void setJishi(String jishi) {
			this.jishi = jishi;
		}

		public String getKaoshi() {
			return kaoshi;
		}

		public void setKaoshi(String kaoshi) {
			this.kaoshi = kaoshi;
		}

		public Stu(String stuNo, String jishi, String kaoshi) {
			super();
			this.stuNo = stuNo;
			this.jishi = jishi;
			this.kaoshi = kaoshi;
		}

	}
}
