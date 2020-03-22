package com.zixin.algorithm;

import java.util.Arrays;


public class LC452 {
	// 这里使用的是贪心算法，每次都是打最右边的点 ，当新的点的左边大于之前打掉的断点的右边 则就需要再加一
	public int findMinArrowShots(int[][] points) {

		if(points.length < 1) return 0;
        Arrays.sort(points, (a, b) -> (a[1] - b[1]));
        int res = 1;
        int axis = points[0][1];
        
        for(int i = 1; i < points.length; ++i) {
            if(axis < points[i][0]) {
            	res++;
                axis = points[i][1];
            }
        }
		return res;
	}
}
