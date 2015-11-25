import java.util.Scanner;

public class StriangleTask10 {

	public static void main(String[] args) {
	
		Scanner input= new Scanner (System.in);
		
		System.out.println("Please enter a value of a:");
        int a=input.nextInt();
                
        System.out.println("Please enter a value of ha: ");
        int ha=input.nextInt();
        
       int S= ((a*ha)/2);
    
        System.out.println("S of triangle is: " + S );
        
        input.close();
	}
	

}
