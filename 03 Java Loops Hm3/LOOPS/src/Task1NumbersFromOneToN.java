import java.util.Scanner;

public class Task1NumbersFromOneToN {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("Enter N: ");
		
		int N=input.nextInt();
		
		for (int i = 1; i <=N; i++) {
			System.out.println(i);
		}
		

	}

}
