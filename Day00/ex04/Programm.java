package Day00.ex04;

import java.util.Scanner;

public class Programm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line;
		int[] occur = new int[65535];

		System.out.print("->");
		line = in.nextLine();
		in.close();
		occur = charOccuring(line);
		printGramm(occur);
	}

	public static int[] charOccuring(String line) {
		char[] str;
		int[] num = new int[65535];
		int size = 0;
		size = line.length();
		str = new char[size];
		str = line.toCharArray();
		for (int i = 0; i < str.length; i++) {
			num[str[i]] += 1;
		}
		return num;
	}

	public static void printGramm(int[] occur) {
		int[][] num = new int[10][2];
		num = findTopTen(occur);
	}
	public static int[][] findTopTen(int[] occur) {
		int [][] num = new int[2][10];
		int temp = occur[0];
		for (int i = 0; i < occur.length; i++) {
			temp = occur[i];
			if (temp < occur[i]) {
				if 
			}
		}
	}
}
