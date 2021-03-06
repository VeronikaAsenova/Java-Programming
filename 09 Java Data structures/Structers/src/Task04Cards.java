import java.util.HashMap;
import java.util.Random;

public class Task04Cards {
	private String face;
	private Suit suit;

	public Task04Cards(String face, Suit suit) {
		this.face = face;
		this.suit = suit;
	}

	public String getFace() {
		return face;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public String toString() {
		String card = "(" + this.face + " " + this.suit + ")";
		return card;
	}

	enum Suit {
		CLUB, DIAMOND, HEART, SPADE;
	}

	public static void main(String[] args) {

		String[] cards = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		Random rnd = new Random();

		for (int i = 1; i <= 5; i++) {

			int randomCard = rnd.nextInt(13);

			Integer count = result.get(cards[randomCard]);
			if (count == null) {
				count = 0;
			}
			result.put(cards[randomCard], count++);
		}
		System.out.print(result + " ");
		System.out.println();

		for (int i = 0; i < 13; i++) {
			Integer temp = result.get(cards[i]);
			if (temp == null) {
				continue;
			}

			if (temp == 2) {
				System.out.println("pair!");
			} else if (temp == 3) {
				System.out.println("set!");
			} else if (temp == 4) {
				System.out.println("four of a kind!");
			}
		}
	}
}
