package com.zixin.learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo05 {

	public static void main(String[] args) {
		File file = new File("d://te.txt");
		FileReader reader = null;
		try {
			reader = new FileReader(file);
			char[] flush = new char[10];
			int len = 0;
			while (-1 != (len = reader.read(flush))) {
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
