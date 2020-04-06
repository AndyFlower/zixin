package com.zixin.algorithm;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public class PATA1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Fraction sum = new Fraction();
		sum.up=BigInteger.ZERO;
		sum.down=new BigInteger("1");
		for (int i = 0; i < n; i++) {
			Fraction a = new Fraction();
			String s = sc.next();
			a.up = new BigInteger(s.split("/")[0]);
			a.down = new BigInteger(s.split("/")[1]);
           sum=add(sum,a);
		}
		showResult(sum);

	}

	static Fraction reduction(Fraction res) {
		if (res.down.compareTo(BigInteger.ZERO) < 0) {
			res.up = res.up.abs();
			res.down = res.down.abs();
		}
		if (res.up.compareTo(BigInteger.ZERO) == 0) {
			res.down = new BigInteger("1");

		} else {
			BigInteger d = gcd(res.up, res.down);
			res.up = res.up.multiply(d);
			res.down = res.down.multiply(d);

		}
		return res;
	}

	static Fraction add(Fraction f1, Fraction f2) {
		Fraction re = new Fraction();
		re.up = f1.up.multiply(f2.down).add(f2.up.multiply(f1.down));
		re.down = f1.down.multiply(f2.down);
		return reduction(re);
	}

	static void showResult(Fraction f1) {
		f1 = reduction(f1);
		if (f1.down.compareTo(new BigInteger("1")) == 0) {
			System.out.println(f1.up);
		} else if (f1.up.compareTo(f1.down) > 0) {
			BigInteger r = f1.up;
			if (r.compareTo(BigInteger.ZERO) > 0) {
				r = f1.up;
			} else {
				r = new BigInteger("-" + f1.up);
			}
			System.out.println(f1.up.multiply(f1.down) + " " + f1.up.abs().remainder(f1.down) + "/" + f1.down);
		}
	}

	static BigInteger gcd(BigInteger a, BigInteger b) {
		return b.compareTo(BigInteger.ZERO) == 0 ? a : gcd(b, a.divide(b));
	}
}

class Fraction {
	BigInteger up;
	BigInteger down;
}
