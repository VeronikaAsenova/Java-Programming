import java.util.Scanner;

public class Task5TriangleCanExist {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter three integer numbers : ");
		int NumOne = input.nextInt();
		int NumTwo = input.nextInt();
		int NumThree = input.nextInt();

		if (NumOne + NumTwo > NumThree && NumOne + NumThree > NumTwo && NumThree + NumTwo > NumOne) {
			System.out.println("You can have a Triangle!");

		} else {
			System.out.println("You can`t have a Triangle!!!");
		}
		System.out.println();
		input.close();
	}

}
