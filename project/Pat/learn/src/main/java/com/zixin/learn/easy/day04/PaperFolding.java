package com.zixin.learn.easy.day04;

/**
 * 
 * @ClassName: PaperFolding
 * @Description: 将一棵头结点为 down，然后左孩子为 down，右孩子为 up 的二叉树按照 右、中、左顺序打印即可。
 * @author Administrator
 * @date 2020-03-22 11:16:27
 */
public class PaperFolding {

    public static void printAllFolds(int flodTime) {
        printProcess(1, flodTime, true);
    }

    public static void printProcess(int i, int flodTime, boolean down) {
        if (i > flodTime) {
            return;
        }
        printProcess(i + 1, flodTime, true);
        System.out.print(down ? "down " : "up ");
        printProcess(i + 1, flodTime, false);
    }

    public static void main(String[] args) {
        int N = 1;
        printAllFolds(N);
		System.out.println();
        printAllFolds(2);
		System.out.println();
        printAllFolds(3);
		System.out.println();
        printAllFolds(4);
    }
}
