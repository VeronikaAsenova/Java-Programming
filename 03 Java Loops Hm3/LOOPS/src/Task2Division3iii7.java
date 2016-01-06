import java.util.Scanner;

public class Task2Division3iii7 {

	public static void main(String[] args) {

         Scanner input= new Scanner(System.in);
System.out.println("Enter N: ");	

int N=input.nextInt();

for (int i = 1; i <=N; i++) {
	if (i%3!=0 && i%7!=0) {
		System.out.println(i);
	}
}
	
	
	}

}
