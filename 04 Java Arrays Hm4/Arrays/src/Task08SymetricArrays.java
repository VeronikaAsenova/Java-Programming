import java.util.Scanner;

public class Task08SymetricArrays {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
		array[i] = input.nextInt();
		}
		boolean symmetric = true;
		for (int i = 0; i < (array.length + 1) / 2; i++) {
		if (array[i] != array[n - i - 1])
		symmetric = false;
		}
	System.out.println("Is that symetric? " + symmetric);

	}

}
