package LottaryGame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {

	static String answer;

	public static void menu() throws IOException {

		ArrayList<PlayerInfo> list = new ArrayList<PlayerInfo>();
		HashMap<Long, Integer> result = new HashMap<Long, Integer>();
		int[] winningNumbers = new int[5];

		do {
			System.out.println("Menu:");
			System.out.println("1.Add person.");
			System.out.println("2.Draw the winning numbers.");
			System.out.println("3.Show the winers.");
			System.out.println("4.Exit.");
			System.out.println("5.Export.");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter option:");
			int choise = sc.nextInt();
			sc.nextLine();
			switch (choise) {
			case 1:

				System.out.println("Please enter your EGN: ");
				long ID = sc.nextLong();
				int[] userNumbers = new int[5];
				for (int i = 0; i < userNumbers.length; i++) {
					System.out.println("Enter numbers: ");
					userNumbers[i] = sc.nextInt();
				}

				sc.nextLine();
				list.add(ShowTheWinners.addPlyer(ID, userNumbers));
				for (PlayerInfo playerInfo : list) {
					System.out.println(playerInfo);
				}
				break;
			case 2:
				winningNumbers = ShowTheWinners.drawWinningNUmbers();
				for (int i : winningNumbers) {
					System.out.print(i + "  ");
				}
				break;
			case 3:
				result = ShowTheWinners.showWiners(list, winningNumbers);
				for (Long key : result.keySet()) {
					System.out.println("" + key + " -> " + result.get(key));
				}

				break;
			case 4:
				System.exit(0);
				break;
			case 5:
				WrittingFiles.writingPlayerInfo("File1.txt", list);

				WrittingFiles.writingWinningNumbers("File2.txt", winningNumbers);

				WrittingFiles.writingTheWinners("File3.txt", result);
				break;

			default:
				System.out.println("Invalid option.");
				break;
			}
			System.out.println("Do you want to continue(Y/N)?");
			answer = sc.nextLine();

		} while (answer.equalsIgnoreCase("Y"));

	}
}
