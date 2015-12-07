import java.util.Scanner;

public class Task10DivisionAB {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		
		int arr [] = new int [n];
		
		
		System.out.println("Enter i =");
		
		
		for ( int i = sc.nextInt(); i<n; i++){
			
			
		
			arr [i]+= i ;
			
			
			if(i%3 ==0){
			
			
			
			System.out.println(i);
			}
		}
			
	}
}

	
