import java.util.Scanner;

public class Task02maxNumberOfThreeIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter three integers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		maxNumber(a, b, c);

	}

	public static void maxNumber(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("a is the biggest num!");
		}
		if (b > a && b > c) {
			System.out.println("b is the biggest num!");
		}
		if (c > a && c > b)
			System.out.println("c is the biggest num!");
	}
}
