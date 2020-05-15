package com.zixin.learn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo06 {

	public static void main(String[] args) {
		File file = new File("d://te2.txt");
		Writer wr = null;
		try {
			// 选择流 true表示追加文件
			wr = new FileWriter(file,true);
			String ms = "";
			wr.write(ms);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != wr) {
				try {
					wr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
