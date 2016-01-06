import java.util.Scanner;

public class task03GreetingsName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Your name is: ");

		String name = input.next();
		greeting(name);
		input.close();
	}

	public static void greeting(String name) {
		System.out.println("Greeting  " + name + "!!!");
	}
}
