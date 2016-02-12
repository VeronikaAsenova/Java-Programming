package TextManipulations;

import java.util.Scanner;

public class Task01ReversedWord {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word, which you want to reverse: ");
		String word = input.nextLine();
		reverse(word);

	}

	public static void reverse(String word) {
		String reversed = new StringBuffer(word).reverse().toString();
		System.out.println("Reversed: " + reversed);
	}

}
