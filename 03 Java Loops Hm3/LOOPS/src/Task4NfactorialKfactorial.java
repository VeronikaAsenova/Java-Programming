import java.util.Scanner;

public class Task4NfactorialKfactorial {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		int factN = 1;
		int factK = 1;

		System.out.print("Enter N = ");
		int n = input.nextInt();

		System.out.print("Enter K = ");
		int k = input.nextInt();

		while (true) {
			if (n == 1) {
				break;
			}
			factN *= n;
			n--;
		}
		System.out.println("N! = " + factN);

		do {
			factK *= k;
			k--;
		} while (k > 1);

		System.out.println("K! = " + factK);

		System.out.println("N! / K! = " + (factN / factK));

	}
}