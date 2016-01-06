import java.util.Scanner;

public class Task8Discriminant {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter coefficients (a, b ,c ):");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int D = (b * b - 4 * a * c);
		System.out.println("Your discriminant is : " + D);

		System.out.println(Math.sqrt(D));
		
		int root1 = ((-b - D) /( 2 * a));
		int root2 = ((-b + D) / (2 * a));
		

		if (D < 0) {
			System.out.println("No Real real roots!!!");
		}
		if (D == 0) {
			System.out.println("You have one real root: " + (-b / (2 * a)));
		}
		if (D > 0) {
			System.out.println("The first root is :" + root1);
			System.out.println("The second root is :" + root2);
		} 
		input.close();
	}

}
