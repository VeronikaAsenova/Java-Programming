import java.util.Scanner;

public class Task9BiggestNum5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Please enter five numbers: ");
		
		int First= input.nextInt();
		int Second= input.nextInt();
		int Third=input.nextInt();
		int Fourth=input.nextInt();
		int Fifth=input.nextInt();
		
		if (First>Second && First>Third && First>Fourth && First>Fifth) {
			
			System.out.println("The biggest number is: First!");
		} 
		if (Second>First && Second>Third && Second>Fourth && Second>Fifth) {
			System.out.println("The biggest number is: Second!");
		} 
		if (Third>First && Third>Second && Third>Fourth && Third>Fifth) {
			System.out.println("The biggest number is: Third");
		} 
		if (Fourth>First && Fourth>Second && Fourth>Third && Fourth>Fifth) {
			System.out.println("The biggest num is: Fourth");
		} 
		if (Fifth>First && Fifth>Second && Fifth>Third && Fifth>Fourth) {
			System.out.println("The biggest number is: Fifth");
		}
		input.close();
	}

}
