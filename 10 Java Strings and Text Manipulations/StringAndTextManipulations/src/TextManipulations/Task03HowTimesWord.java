package TextManipulations;

import java.util.Scanner;

public class Task03HowTimesWord {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a text:");
		String text = input.nextLine();
		System.out.println("Enter a word:");
		String word = input.nextLine();

		int contentionCount = findTheWord(text, word);
		input.close();
	}

	public static int findTheWord(String text, String word) {
		int index = text.indexOf(word);
		int counter = 0;
		while (index != -1) {
			counter++;
			index = text.indexOf(word, index + 1);

		}
		System.out.printf("The word contains %d times in the text.\n",counter);
		return counter;

	}

}
