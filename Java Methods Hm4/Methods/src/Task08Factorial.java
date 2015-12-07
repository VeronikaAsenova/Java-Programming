import java.util.Scanner;

public class Task08Factorial {

	public static void main(String[] args) {

		System.out.println("F: " + f(10));
	}

	private static int f(int num) {
		if (num <= 0) {
			return 1;
		}

		return num * f(num - 1);
	}
}
