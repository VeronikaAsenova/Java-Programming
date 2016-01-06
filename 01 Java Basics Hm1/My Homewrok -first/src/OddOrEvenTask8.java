import java.awt.geom.Ellipse2D;
import java.util.Scanner;

public class OddOrEvenTask8 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter your number: ");
		int num = input.nextInt();
		
		
	
		
		if (num%2==0) 
		System.out.println("Your number is even");
		
		else
		System.out.println("Your number is odd");
		
	}
	
}
