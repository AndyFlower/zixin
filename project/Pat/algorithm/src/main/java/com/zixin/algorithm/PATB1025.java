package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * 空间换时间的思想
 * -1 可直接输出
 * %05d
 * 部分优化
 * 换成C此代码可过
 * */

class Node {
	int data;
	int adds;
	int next;

	Node(int adds, int data, int next) {
		this.adds = adds;
		this.data = data;
		this.next = next;
	}

	public Node() {
	}
}
/**
 * @desc 自己未解决
 * @author sangliping
 *
 */
public class PATB1025 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1[] = in.readLine().split(" ");
		int start = Integer.parseInt(s1[0]);
		int n = Integer.parseInt(s1[1]);
		int k = Integer.parseInt(s1[2]);
		ArrayList<Node> arrout = new ArrayList<Node>();
		Node arrin[] = new Node[100005];// 空间换时间
		while (n-- != 0) {
			String s2[] = in.readLine().split(" ");
			int adds = Integer.parseInt(s2[0]);
			int data = Integer.parseInt(s2[1]);
			int next = Integer.parseInt(s2[2]);
			arrin[adds] = new Node();
			arrin[adds].adds = adds;
			arrin[adds].data = data;
			arrin[adds].next = next;
		}
		Node temp = new Node();
		temp.adds = start;// 优化
		temp.data = arrin[start].data;
		temp.next = arrin[start].next;
		while (temp.next != -1) {
			arrout.add(new Node(temp.adds, temp.data, temp.next));
			temp.adds = arrin[temp.next].adds;
			temp.data = arrin[temp.next].data;
			temp.next = arrin[temp.next].next;
		}
		arrout.add(new Node(temp.adds, temp.data, temp.next));// 优化
		for (int i = 0; i < arrout.size(); i += k) {
			Outreverse(i, k, arrout);
		}
	}

	private static void Outreverse(int i, int k, ArrayList<Node> arrout) {
		if (i + k <= arrout.size()) {
			for (int p = i + k - 1; p >= i; p--) {
				if (p != i)
					System.out.printf("%05d %d %05d\n", arrout.get(p).adds, arrout.get(p).data, arrout.get(p - 1).adds);
				else {
					if (i + 2 * k <= arrout.size())
						System.out.printf("%05d %d %05d\n", arrout.get(p).adds, arrout.get(p).data,
								arrout.get(i + 2 * k - 1).adds);
					else {
						if (i + k >= arrout.size())
							System.out.printf("%05d %d -1\n", arrout.get(p).adds, arrout.get(p).data);
						else
							System.out.printf("%05d %d %05d\n", arrout.get(p).adds, arrout.get(p).data,
									arrout.get(i + k).adds);
					}
				}
			}
		} else {//长度不够不需要进行反转
			for (int p = i; p < arrout.size(); p++) {
				if (p == arrout.size() - 1) {//最后一个数字不需要格式化为5位 是-1
					System.out.printf("%05d %d -1\n", arrout.get(p).adds, arrout.get(p).data);
				}else {
					System.out.printf("%05d %d %05d\n", arrout.get(p).adds, arrout.get(p).data, arrout.get(p + 1).adds);
				}
			}
		}
	}
	
	
}