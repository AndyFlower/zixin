package com.slp.leetcode;

/**
 * @ClassName ErWeiShuZuZhongDeChaZhaoLcof
 * @Description 二维数组中的查找
 * @Author sanglp
 * @Date 2020/9/15 15:52
 * @Version 1.0
 **/
public class ErWeiShuZuZhongDeChaZhaoLcof {
    public static void main(String[] args) {

        int[][] a = new int[][] {{1,2,3},{4,2,7}};
        findNumberIn2DArray(a,3);
    }
    //从右上角开始寻找
    public static boolean findNumberIn2DArrayVersion2(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while(row < m && col >= 0) {
            if(matrix[row][col] > target) {
                col--;
            }else if(matrix[row][col] < target) {
                row++;
            }else {
                return true;
            }
        }
        return false;
    }

    /**
     * 暴力方法
     * @param matrix
     * @param target
     * @return
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
