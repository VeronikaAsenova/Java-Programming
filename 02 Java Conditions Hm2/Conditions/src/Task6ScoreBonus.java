import java.util.Scanner;

public class Task6ScoreBonus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your score [1;9]");

		int score = input.nextInt();

		if (1 <= score && score <= 3) {
			System.out.println(score * 5);

		}
		if (4 <= score && score <=6) {
			System.out.println(score * 10);
		}
		if (7 <= score && score <= 9) {
			System.out.println(score * 50);
		}
		System.out.println(); 
		input.close();
	} 

}
