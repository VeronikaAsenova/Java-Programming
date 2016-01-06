import java.util.Scanner;

public class Task5NfacKfac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int factN = 1;
		int factD = 1;

		System.out.print("Enter N = ");
		int n = input.nextInt();

		System.out.print("Enter K = ");
		int k = input.nextInt();

		int d = n - k;

		while (true) {
			if (n == 1) {
				break;
			}
			factN *= n;
			n--;
		}
		System.out.println("N! = " + factN);

		do {
			factD *= d;
			d--;
		} while (d > 1);

		System.out.println("D! = " + factD);

		System.out.println("N!*K / (N-K)! = " + (factN * k / factD));

	}

}
