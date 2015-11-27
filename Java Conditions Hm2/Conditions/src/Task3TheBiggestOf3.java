import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Task3TheBiggestOf3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Eneter a: ");
		int a = input.nextInt();

		System.out.println("Enter b: ");
		int b = input.nextInt();

		System.out.println("Enter c: ");
		int c = input.nextInt();

		if (a > b && a > c) {
			System.out.println("The max is a!");
		}
		if (b > a && b > c) {
			System.out.println("The max is b!");
		}
		if (c > a && c > b) {
			System.out.println("The max is c!");

		}
		input.close();

	}
}
