import java.util.Scanner;

public class Task01maxNumberTwoIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value of a and b: ");
		int a = input.nextInt();
		int b = input.nextInt();
		maxNumber(a, b);

	}

	public static void maxNumber(int a, int b) {
		if (a > b) {
			System.out.println("a is bigger than b!");
		} else {
			System.out.println("b is bigger than a!");
		}
	}

}
