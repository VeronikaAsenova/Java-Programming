package replace;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02Uppercase {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a word:");
			String word = input.nextLine();

			System.out.println("Enter a text:");
			String text = input.nextLine();
			wordToUpper(word, text);
		} catch (ExceptionNotAWord exc) {
			System.out.println(exc.getMessage());
		}
	}

	public static void wordToUpper(String word, String text) throws ExceptionNotAWord {
		word.trim();
		Pattern p = Pattern.compile("[^A-Za-z0-9]");
		Matcher m = p.matcher(word);
		boolean b = m.find();
		if (b) {
			throw new ExceptionNotAWord(
					"This is not a valid word!" + "Enter only one word without special characters!");
		}
		String wordToUpper = word.toUpperCase();
		String text2 = "";
		if (text.contains(word)) {
			text2 = text.replaceAll(word, wordToUpper);
			System.out.println("Text after change:");
			System.out.println(text2);
		} else {
			System.out.println("We don't find this word in the text!");
		}

	}
}
