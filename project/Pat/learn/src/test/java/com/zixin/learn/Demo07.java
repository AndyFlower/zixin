package com.zixin.learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Demo07 {

	public static void main(String[] args) {
		File src = new File("d://1.txt");
		File dest = new File("d://2.txt");
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader(src);

			writer = new FileWriter(dest);
			char[] flush = new char[10];
			int len = 0;
			while (-1 != (len = reader.read(flush))) {
				writer.write(flush, 0, len);
			}
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null!=writer) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(null!=reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
