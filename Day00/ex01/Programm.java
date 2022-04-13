package Day00.ex01;

import java.util.Scanner;



public class Programm {
	public static void main(String[] args) {
		int x;
		int num = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("->");
		x = in.nextInt();
		in.close();
		if (x < 2) {
			System.out.println("Illegal Argument");
			System.exit(-1);
		}
		for (int i = 2; i <= findSquareRoot(x) ; i++) {
				if ((x % i) == 0) {
					System.out.println("false " + num);
					System.exit(0);;
			}
			num++;
		}
		System.out.println("true " + num);
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
