import java.util.Scanner;

public class SumTask5 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("Enter Your first number: ");
		int a = input.nextInt();
		
		System.out.println("Enter Your second number: ");
		int b=input.nextInt();
		
		System.out.println("Enter your third number: ");
		int c=input.nextInt();
		
		System.out.println("Enter your fourth number");
		int d=input.nextInt();
		
		int result= a+b+c+d;
		System.out.println("Your result is: " + result );
		
		input.close();

	}

}
