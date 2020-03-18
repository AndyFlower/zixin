package com.zixin.algorithm;

import java.util.Scanner;

/**
 * 
 * @author sangliping
 * @desc 输入在一行中按照 a1/b1 a2/b2 的格式给出两个分数形式的有理数，其中分子和分母全是整型范围内的整数，负号只可能出现在分子前，分母不为 0。
 */
public class PATB1034 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);

		String str1 = scanner.next();
		String str2 = scanner.next();
		scanner.close();
		long a1 = Long.parseLong(str1.split("/")[0]);
		long b1 = Long.parseLong(str1.split("/")[1]);
		long a2 = Long.parseLong(str2.split("/")[0]);
		long b2 = Long.parseLong(str2.split("/")[1]);
		if (b1 != 0 && b2 != 0) {
            add(a1, b1, a2, b2);
            minus(a1, b1, a2, b2);
            mutilply(a1, b1, a2, b2);
            divide(a1, b1, a2, b2);
        }
	}

	private static void divide(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
        System.out.print(" / ");
        tackle(a2, b2);
        System.out.print(" = ");
        if (a2 == 0) {
            System.out.print("Inf");
        } else if (a2 < 0) {
            tackle(-1 * a1 * b2, -1 * a2 * b1);
        } else {
            tackle(a1 * b2, a2 * b1);
        }
		
	}

	private static void mutilply(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
        System.out.print(" * ");
        tackle(a2, b2);
        System.out.print(" = ");
        tackle(a1 * a2, b1 * b2);
        System.out.println();
		
	}

	private static void minus(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
        System.out.print(" - ");
        tackle(a2, b2);
        System.out.print(" = ");
        tackle(a1 * b2 - a2 * b1, b1 * b2);
        System.out.println();
		
	}

	private static void add(long a1, long b1, long a2, long b2) {
		tackle(a1, b1);
        System.out.print(" + ");
        tackle(a2, b2);
        System.out.print(" = ");
        tackle(a1 * b2 + a2 * b1, b1 * b2);
        System.out.println();
		
	}
	
	public static void tackle(long a, long b) {
        if (a == 0) {//如果分子为0   说明是0  直接输出
            System.out.print(0);
            return;
        }

        boolean isMinus = a > 0 ? false : true;//判断是不是负数
        if (isMinus) {//如果是负数 输出(-  然后取绝对值
            System.out.print("(-");
            a = -a;
        }

        long gcd = getGcd(a, b);//获得最大公约数
        a = a / gcd; //分别对a b化简  得最简分数
        b = b / gcd;
        if (a % b == 0) {//如果 a  b取余得0  说明是整数  直接输出
            System.out.print(a / b);
        } else if (Math.abs(a) > b) { //如果为假分数  先输出整数 再输出分数 
            System.out.print(a / b + " " + (a % b) % b + "/" + b);
        } else if (a == b) {//如果ab相等 输出1
            System.out.print(1);
        } else { //真分式最简直接输出
            System.out.print(a + "/" + b);
        }

        if (isMinus) {//如果是负数 还需要输出）
            System.out.print(")");
        }

    }
	/**
	 * @描述 获取最大公约数方法1 欧几里得算法（非递归式）, 也叫辗转相除法, 高效稳定 <br>  原理： gcd(a, b) = gcd(b, a mod b)
	 * @param a
	 * @param b
	 * @return
	 */
	public static long getGcd(long a, long b) {
        while (a % b != 0) {//如果ab取余为0 则b为最大公约数
            long temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
	 /**
     * @描述 获取最大公约数 方法2  欧几里得算法（递归式）, 也叫辗转相除法, 高效稳定 <br>   原理： gcd(a, b) = gcd(b, a mod b)
     * @param num1 
     * @param num2
     * @return 最大公约数
     */
    public static int getGCD(int num1, int num2) {
        // 先获得绝对值，保证负数也可以求
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        // 先求余数，假定第一个数较大；如果第二个较大，在第二轮调用时会颠倒过来
        int remainder = num1 % num2;
        // 如果为 0，则直接得出
        if (remainder == 0) {
            return num2;
        }
        // 递归调用
        return getGCD(num2, remainder);
    }

    /**
     * @描述 更相减损法: 也叫更相减损术，出自《九章算术》 <br>
     *    然后把所有的除数连乘起来，所得的积就是这几个数的最大公约数。<br>
     *     短除法本质上还是质因数分解法
     *     缺点：当质因数较大时，会计算比较困难
     * @param num1
     * @param num2
     * @return
     */
    public static int getGCD3(int num1, int num2) {
        // 先获得绝对值，保证负数也可以求
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        // 区分数值大小，为后面终止条件做准备
        int min = num1 > num2 ? num2 : num1;
        int max = num1 > num2 ? num1 : num2;

        // 第一步：如果两个数是偶数，则先用2进行约分，并存储约去的2的乘积
        int product = 1;
        while (min % 2 == 0 && max % 2 == 0) {
            min /= 2;   
            max /= 2;
            product *= 2;   
        }

        // 第二步：用较大的数减去较小的数，接着把所得的差与较小的数比较，并以大数减小数
        // 继续这个操作，直到所得的减数和差相等为止。（或者多循环一次，判断相减差为 0）
        while (max - min > 0) {
            int deference = max - min; // 获得差数
            // 更相减损，将差数和较小数比较；大的重新赋给 max，小的赋给min，注意顺序
            max = min > deference ? min : deference;
            min = min < deference ? min : deference;
        } // while

        // 实际上，第一步约去的2的乘积，就是num1和num2的约数
        // 第二步最后算出的差或者较小数，就是第二步刚开始的两个数的最大公约数
        // 第一步的结果乘上第二步的结果，就是 num1 和 num2 的最大公约数
        return product * min;
    }

}
