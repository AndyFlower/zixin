package com.zixin.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo01 {
	public static void main(String[] args) {
		// 建立联系
		File f1 = new File("d://1.sql");
		// 选择流
		InputStream in = null;
		try {
			in = new FileInputStream(f1);
			// 操作不断读取缓冲数组
			byte[] b = new byte[10];
			int len = 0;// 接收 实际读取大小
			while (-1 != (len = in.read(b))) {
				// 输出字节数组
				String info = new String(b, 0, len);
				System.out.println(info);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (null != in) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
