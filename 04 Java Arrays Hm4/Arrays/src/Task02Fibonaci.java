import java.util.Scanner;

public class Task02Fibonaci {

	public static void main(String[] args) {
		
 Scanner input=new Scanner (System.in);
 
 int first = 0;
 int second = 1;
 int sum;
 
 System.out.println("Ener N :");
 int N=input.nextInt();
 for (int i = 0; i < N; i++)
 {
    sum = first + second;
    System.out.println("iteration " + i + ": " + sum);
    first = second;
    second = sum;
 }
 
 
	}

}
