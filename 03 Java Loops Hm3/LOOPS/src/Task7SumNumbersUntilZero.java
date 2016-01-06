import java.util.Scanner;

public class Task7SumNumbersUntilZero {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number;
		int sum = 0;

		do {

			number = input.nextInt();
			sum+=number;

		} while (number != 0);
System.out.println("Result is :" + sum);
	}

}
