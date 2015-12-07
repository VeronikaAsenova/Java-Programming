import java.util.Scanner;

public class Task04MultiplyThreeIntegersFiveTimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Enter your 3 integers :");
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();

			System.out.println("The result is: ");
			multiply(a, b, c);

		}

	}

	public static void multiply(int a, int b, int c) {
		System.out.println(a * b * c);
	}

}
