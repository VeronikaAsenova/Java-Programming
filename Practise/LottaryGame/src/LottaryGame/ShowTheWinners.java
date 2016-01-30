package LottaryGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ShowTheWinners {

	public static int[] drawWinningNUmbers() {
		Random rand = new Random();
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			int number = rand.nextInt(31);
			if (number == 0) {
				number += 2;
			}
			numbers[i] = number;

		}
		return numbers;

	}

	public static PlayerInfo addPlyer(long ID, int[] userNumbers) {

		PlayerInfo player = new PlayerInfo(ID, userNumbers);

		return player;

	}

	public static HashMap<Long, Integer> showWiners(ArrayList<PlayerInfo> player, int[] winningNumbers) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		HashMap<Long, Integer> results = new HashMap<Long, Integer>();

		for (int i = 0; i < winningNumbers.length; i++) {
			number.add(winningNumbers[i]);
		}

		for (int i = 0; i < player.size(); i++) {
			int[] playerNumber = player.get(i).getUserNumbers();
			int counter = 0;
			for (int j = 0; j < playerNumber.length; j++) {
				if (number.contains(playerNumber[j])) {
					counter++;
				}
			}
			if (counter >= 3) {
				results.put(player.get(i).getEGN(), counter);
			}

		}
		return results;

	}

}
