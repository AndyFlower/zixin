package com.zixin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LC406 {
	  public int[][] reconstructQueue(int[][] people) {
		  if (0 == people.length || 0 == people[0].length)
	            return new int[0][0];
		  ////按照身高降序 K升序排序 
		  Arrays.sort(people, new Comparator<int[]>() {
	            @Override
	            public int compare(int[] o1, int[] o2) {
	                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
	            }
	        });
		  //身高一样的 K越大越排在后面
		  //List<int[]> list = new ArrayList<>();
		  List<int[]> list = new ArrayList<>();
		  for(int[] p:people) {
			  list.add(p[1],p);
			  
		  }
		  return list.toArray(new int[list.size()][]);
		  
	   }
	
	  
}
