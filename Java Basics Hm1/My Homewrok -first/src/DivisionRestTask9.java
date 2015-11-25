import java.util.Scanner;

public class DivisionRestTask9 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("Please eneter a: ");
		int a =  input.nextInt();
		
		System.out.println("Please enter b: ");
		int b= input.nextInt();
		
		int division= (a%b);
	
		System.out.println("Your result is:  " + division);
		

	}

}
