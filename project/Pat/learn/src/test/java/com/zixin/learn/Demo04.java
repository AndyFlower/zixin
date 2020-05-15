package com.zixin.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo04 {

	public static void main(String[] args) {

	}

	public static void copyDirDetail(File src, File dest) throws Exception {
		if (src.isFile()) {
			// 选择流
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);
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
		} else if (src.isDirectory()) {
			dest.mkdirs();
			// 获取下一级目录|文件
			for (File sub : src.listFiles()) {
				copyDirDetail(sub, new File(dest, sub.getName()));
			}
		}
	}
}
