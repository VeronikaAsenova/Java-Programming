import java.util.Scanner;

public class Task05OddOrEven {

	public static void main(String[] args) {
 
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		for (int i = 0; i < 4; i++) {
			
		int number=input.nextInt();
		
		oddOrEven(number);
		}
	}
public static void oddOrEven(int number){
	if (number%2==0) {
		System.out.println("Even");
	}if (number%2!=0)
		System.out.println("Odd");
	}
		
	}



