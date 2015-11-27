import java.util.Scanner;

public class Task2TheBiggerNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a: ");
		int a = input.nextInt();

		System.out.println("Please enter b: ");
		int b = input.nextInt();

		if (a > b) {
			System.out.println("The bigger num is a! ");
		} else {
			System.out.println("The bigger num is b!");
		}
		input.close();
	}
}
