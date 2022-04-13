package Day00.ex02;

import java.util.Scanner;

public class Programm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = 0;
		int num = 0;
		for (x = in.nextInt(); x != 42 ; x = in.nextInt()) {
			if (x < 2) {
				continue;
			}
			x = summOfDigits(x);
			if (isPrime(x)) {
				num += 1;
			}
		}
		in.close();
		System.out.println("Count of coffee-requst - " + num);
	}
	public static int summOfDigits(int x) {
		int j = 0;
		for ( ; x > 0; x /= 10) {
			j += x % 10;
		}
		return j;
	}
	
	public static boolean isPrime(int x) {
		for (int i = 2; i <= findSquareRoot(x) ; i++) {
			if ((x % i) == 0) {
				return false;
		}
	}
	return true;
}
	public static int findSquareRoot(int value) {
		double num;
		double half = (double) value / 2;
		do {
			num = half;
			half = (num + (value / num)) / 2;
		} while ((num - half) != 0);
		return (int) half;
	}
}
