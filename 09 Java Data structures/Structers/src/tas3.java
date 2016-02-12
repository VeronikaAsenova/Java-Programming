
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class tas3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 cards: ");

		String[] cards = new String[5];
		
		for (int i = 0; i < cards.length; i++) {
			cards[i] = input.nextLine();

		}
		TreeMap<String, Integer> hand = new TreeMap<String, Integer>();

		for (String card : cards) {
			Integer count = hand.get(card);
			if (count == null) {
				count = 0;
			}
			hand.put(card, count + 1);
		}

		Set<String> cardKey = hand.keySet();

		for (String card : cardKey) {
			int value = hand.get(card);
			if (value == 2) {
				System.out.println("You have pair.");
			}
			if (value == 3) {
				System.out.println("You have set.");
			}
			if (value == 4) {
				System.out.println("You have quads.");
			}
		}

	}
}