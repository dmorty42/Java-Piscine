package Day00.ex03;

import java.util.Scanner;

public class Programm {
	public static void main(String[] args) {
		String week = "Week ";
		long minGrades = 0;
		String delim = "42";
		Scanner in = new Scanner(System.in);
		String line;

		for (int i = 0; i < 19; i++) {
			System.out.print("->");
			line = in.nextLine();
			if (line.equals(delim)) {
				break;
			}
			if (!line.equals(week + (i + 1))) {
				System.err.println("IllegalArgument");
				in.close();
				System.exit(-1);
			}
			System.out.print("->");
			line = in.nextLine();
			minGrades += packMinGrades(line, i);
		}
		unpackMinGrades(minGrades);
	}
	public static long packMinGrades(String line, int index) {
		long temp;
		long num = Integer.parseInt(line.substring(0, 1));
		for (int i = 2; i < 5; i += 2) {
			temp = Integer.parseInt(line.substring(i, i + 1));
			if (temp < num) {
				num = temp;
			}
		}
		for (int i = 0; i < index; i++) {
			num *= 10;
		}
		return (num);
	}
	public static void unpackMinGrades(long minGrades) {
		long temp = 0;
		for (int i = 0; minGrades > 0; i++) {
			System.out.print("Week " + (i + 1) + " ");
			temp = minGrades % 10;
			for ( ; temp > 0; temp--) {
				System.out.print("=");
			}
			System.out.println(">");
			minGrades /= 10;
		}
	}
}
