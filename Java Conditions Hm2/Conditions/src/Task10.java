import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int YourNumber = input.nextInt();
		int Edinitsi = YourNumber % 10; // delim nasheto chislo na 10, za da
										// poluchim edinicite
		int Desetici = (YourNumber / 10) % 10; // delim na 10,za da gi premahnem
												// i sled tova pak delim s
												// ostatyk za deseticite
		int Stotici = YourNumber / 100; // pak delim chisloto na 100, za da
										// poluchim stoticite
		if (1 <= YourNumber && YourNumber <= 999)

			switch (Stotici) {

			case 1:
				System.out.println("Hundred");
				break;
			case 2:
				System.out.println("Two Hundred");
				break;
			case 3:
				System.out.println("Three Hundred");
				break;
			case 4:
				System.out.println("Four Hundred");
				break;
			case 5:
				System.out.println("Five Hundred");
				break;
			case 6:
				System.out.println("Six Hundred");
				break;
			case 7:
				System.out.println("Seven Hundred");
				break;
			case 8:
				System.out.println("Eight Hundred");
				break;
			case 9:
				System.out.println("Nine Hundred");
				break;

			}
		if (Edinitsi == 0 && Desetici == 0) {
			System.out.println();
		}
		if (Edinitsi == 0 && Desetici != 0) {
			System.out.println("and");
		}

		switch (Desetici) {
		case 1:
			if (Stotici != 0 && (Desetici != 0 || Edinitsi > 0))

				System.out.println(" and ");

			switch (Desetici) {
			case 1:
				System.out.println("Eleven");
				break;
			case 2:
				System.out.println("Twelve");
				break;
			case 3:
				System.out.println("Thirteen");
				break;
			case 4:
				System.out.println("Fourteen");
				break;
			case 5:
				System.out.println("Fifteen");
				break;
			case 6:
				System.out.println("Sixteen");
				break;
			case 7:
				System.out.println("Seventeen");
				break;
			case 8:
				System.out.println("Eighteen");
				break;
			case 9:
				System.out.println("Nineteen");
				break;
			case 0:
				System.out.println("Ten");
				break;

			}
			break;

		case 2:
			System.out.println("Twenty");
			break;
		case 3:
			System.out.println("Thirty");
			break;
		case 4:
			System.out.println("Fourty");
			break;
		case 5:
			System.out.println("Fifty");
			break;
		case 6:
			System.out.println("Sixty");
			break;
		case 7:
			System.out.println("Seventy");
			break;
		case 8:
			System.out.println("Eighty");
			break;
		case 9:
			System.out.println("Ninety");
			break;
		case 0:
			break;

		}
		if (Desetici != 0) {
			if (Desetici != 0 || (Stotici != 0 && Edinitsi != 0)) {
				if (Edinitsi > 0) {
					System.out.println(" and ");
				}
				switch (Edinitsi) {

				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine");

					break;
				case 0:
					if (Desetici != 0)
						System.out.println();
					break;
				}
			}
			if (Edinitsi == 0 && Desetici == 0 && Stotici == 0) {
				System.out.println("Zero");

			} 
		}else {
			System.out.println("Out of Range!");
		}

	}

}
