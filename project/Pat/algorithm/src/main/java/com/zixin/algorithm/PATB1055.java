package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PATB1055 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int totalNum = Integer.parseInt(str.split(" ")[0]);
        int rowNum = Integer.parseInt(str.split(" ")[1]);
        int perRow = totalNum/rowNum;
        List<PhotoStu> li = new ArrayList<PhotoStu>();
        for(int i=0;i<totalNum;i++) {
        	String temp = br.readLine();
        	li.add(new PhotoStu(Integer.parseInt(temp.split(" ")[1]),temp.split(" ")[0]));
        }
        li.sort(new Comparator<PhotoStu>() {

			@Override
			public int compare(PhotoStu a, PhotoStu b) {
				return a.height != b.height ? a.height - b.height : a.name.compareTo(b.name) ;
			}
		});
        for(int i=0;i<li.size();i++) {
        	System.out.println(li.get(i).toString());
        }
        System.out.println(perRow);
        
	}

	static class PhotoStu  {
  
		private int height;
		private String name;
		
		public PhotoStu(int height, String name) {
			super();
			this.height = height;
			this.name = name;
		}

		

		@Override
		public String toString() {
			return "PhotoStu [height=" + height + ", name=" + name + "]";
		}



		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
}
