import java.util.Scanner;

public class SrectangleFromConsoleTask1 {

	public static void main(String[] args) {
		
		Scanner input=  new Scanner (System.in);
		
		System.out.println("Please enter a double: ");
		double NumDouble= input.nextDouble();
		
		System.out.println("Please enter a second double: ");
		double NumSecondDouble= input.nextDouble();
		
		double result= NumDouble*NumSecondDouble;
		
		System.out.println("Your result is :" + result );
		
		input.close();

	}

}
