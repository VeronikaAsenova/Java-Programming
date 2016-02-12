import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Task02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your text: ");

		String text = input.nextLine();

		TreeMap<String, Integer> wordsCounter = new TreeMap<String, Integer>();
		String[] wordsInText = text.split(" ");

		for (String word : wordsInText) {

			Integer count = wordsCounter.get(word);
			if (count == null) {
				count = 0;
			}
			wordsCounter.put(word, count + 1);
		}
		Set<String> wordKey = wordsCounter.keySet();
		System.out.println("The unique words in the text are: " );
		for (String word : wordKey) {

			int stoinost = wordsCounter.get(word);
			if (stoinost == 1) {
				
			} System.out.println(word);

		}
	}
}
