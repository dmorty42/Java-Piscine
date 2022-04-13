package Day00.ex00;

public class Programm {
	public static void main(String[] args) {
		int i = 479598;
		int j = 0;
		for (int x = i; x > 0; x /= 10) {
			j += x % 10;
		}
		System.out.println(j);
	}
}