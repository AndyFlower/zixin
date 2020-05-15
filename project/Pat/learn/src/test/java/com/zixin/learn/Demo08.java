package com.zixin.learn;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.InputStream;
import java.io.OutputStream;

public class Demo08 {

	public static void main(String[] args) throws Exception {
		// 建立联系
		File src = new File("d://te.txt");
		File dest = new File("d://te1.txt");
		// 选择流
		InputStream in = new BufferedInputStream(new FileInputStream(src));
		OutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
		// 文件拷贝

		byte[] flush = new byte[1024];
		int len = 0;
		// 读取
		while (-1 != (len = in.read(flush))) {
			// 写出
			out.write(flush, 0, len);
		}
		out.flush();// 强制输出
		// 先打开的后关闭
		out.close();
		in.close();

	}

}
