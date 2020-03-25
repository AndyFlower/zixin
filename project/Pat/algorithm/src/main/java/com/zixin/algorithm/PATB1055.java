package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
				return a.height != b.height ? b.height - a.height : a.name.compareTo(b.name) ;
			}
		});
        for(int i=0;i<li.size();i++) {
        	//System.out.println(li.get(i).toString());
        }
        //System.out.println(perRow);
        int exceed = totalNum-perRow*rowNum;//最后一行比其他行多1个
        //System.out.println(exceed);
        
        String [] [] arr = new String[rowNum][perRow+exceed];
        int k=0;
        //先填第一行 
        arr[0][(perRow+exceed)/2]=li.get(k++).getName();
        int right = ((perRow+exceed)/2)-1;
    	int left = ((perRow+exceed)/2)+1;
        for(int i=0;i<perRow+exceed;i++) {

        		if(right>=0) {
        			arr[0][right--]=li.get(k++).getName();
        		}
        		if(left<perRow+exceed) {
        			arr[0][left++]=li.get(k++).getName();
        		}
        		
        	
        }//第一行填完了  
        int centerMore1 = perRow/2;
        for(int j=1;j<rowNum;j++) {
        	int rightMore1 = ((perRow)/2)-1;
        	int leftMore1 = ((perRow)/2)+1;
        	arr[j][centerMore1]=li.get(k++).getName();
        	 for(int i=0;i<perRow;i++) {

         		if(rightMore1>=0) {
         			arr[j][rightMore1--]=li.get(k++).getName();
         		}
         		if(leftMore1<perRow) {
         			arr[j][leftMore1++]=li.get(k++).getName();
         		}
         		
         	
         }//第一行填完了  
        }
        
        for(int i=0;i<perRow+exceed;i++) {
        	if(i!=perRow+exceed-1) {
        		System.out.print(arr[0][i]+" ");
        	}else {
        		System.out.print(arr[0][i]);
        	}
        	
        	
        }
        System.out.println();
        for(int i=1;i<rowNum;i++) {
        	for(int j=0;j<perRow;j++) {
        		if(j!=perRow-1) {
        			System.out.print(arr[i][j]+" ");
        		}else {
        		    System.out.print(arr[i][j]);
        		}
        	}
        	System.out.println();
        }
        
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
