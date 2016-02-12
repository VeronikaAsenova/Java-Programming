package TextManipulations;

import java.util.Scanner;

public class Task05Skobi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		String text = null;
		int count = 0;

		System.out.print("Enter math text: ");
		text = input.nextLine();

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(') {
				count++;
			} else if (text.charAt(i) == ')') {
				count--;
			}
		}

		System.out.println(text);
		System.out.println("\nMisplaced priority brackets: " + (count != 0));

		input.close();

	}
}
