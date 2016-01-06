import java.util.Scanner;

public class InfomationForCustomersTask3 {



	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter your First name: ");
		String FirstName= input.nextLine();
		
		System.out.println("Please enter your Last name: ");
		String LastName=input.nextLine();
		
		System.out.println("Please enter your Age: ");
		byte YourAge= input.nextByte();
		
		System.out.println("Please enter your sex: ");
		String sex = input.next();
				
		System.out.println("Please enter your EGN: ");
		String EGN= input.next();
		
		System.out.println("Please enter your number: ");
		String Number= input.next();
		
		
		input.close();
				
		
		


	}

}
