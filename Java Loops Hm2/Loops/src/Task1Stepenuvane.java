import java.util.Scanner;

public class Task1Stepenuvane {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ener N:");
		int N = input.nextInt();

		System.out.println("Enter M");
		int M = input.nextInt();

		long result=1;

         for (int i= 0; i < M ; i++) {
			result *=N;
		}
         System.out.println("N^M= " + result);
		}
	}


