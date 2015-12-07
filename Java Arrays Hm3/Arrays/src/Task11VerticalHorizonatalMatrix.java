import java.util.Arrays;
import java.util.Scanner;

public class Task11VerticalHorizonatalMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n =");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				arr[i][j] = i + j * n;

			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
