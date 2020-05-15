package com.zixin.learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo02 {

	public static void main(String[] args) {
		File file = new File("d://te.txt");
		OutputStream os = null;
		try {
			//追加形式写入文件
			os = new FileOutputStream(file, true);
			String s = "zixin";
			byte[] data = s.getBytes();
			os.write(data, 0, data.length);
			os.flush();// 强制刷新出去
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

		} finally {
			if (null != os) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
