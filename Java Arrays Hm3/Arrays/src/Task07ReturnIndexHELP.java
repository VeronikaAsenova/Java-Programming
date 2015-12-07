import java.util.Scanner;

public class Task07ReturnIndexHELP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] arr = new int[5];
		int n, found = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter the number: ");
			arr[i] = input.nextInt();
		}
		System.out.println("Enter the num which you want to cintinue: ");
		n = input.nextInt();

		for (int i = 0; i < arr.length && found == 0; i++) {
			if (n == arr[i]) {
				found = 1;
			} 
			

		} i--;
		System.out.println("The given search number is: " + n);
		System.out.println("The position of given search number is: "+ i);
	}
}