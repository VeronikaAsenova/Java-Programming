import java.util.Scanner;

public class Task1ZnakPlusMinus {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter two real numbers: ");

		float a = input.nextInt();
		float b = input.nextInt();

		if (a / b >= 0) {
			System.out.println("+");
		} else {
			System.out.println("-");
		}
		input.close();
	}

}
