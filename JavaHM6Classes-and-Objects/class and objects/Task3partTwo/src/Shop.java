import java.util.Scanner;

public class Shop {
	private String name;
	private String adress;

	public Shop() {
		this.name = "";
		this.adress = "";
	}

	public Shop(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of products you want to add: ");
		int number = input.nextInt();
		Stock[] products = new Stock[number];
		for (int i = 0; i < products.length; i++) {
			System.out.println("What kind of product you want to enter?");
			System.out.println("1.Meat");
			System.out.println("2.Vegetable");
			System.out.println("3.Drink");
			int choise = input.nextInt();

			switch (choise) {
			case 1:
				System.out.println("Plesase enter price: ");
				int price = input.nextInt();

				System.out.println("Plesase enter the weight: ");
				int weight = input.nextInt();

				input.nextLine();

				System.out.println("Plesase enter the meat type: ");
				String type = input.nextLine();
				Meat meats = new Meat(price, true, type, weight);
				products[i] = meats;
				i++;

			case 2:
				System.out.println("Plesase enter price: ");
				int priceVeg = input.nextInt();

				System.out.println("Plesase enter the name: ");
				String name = input.nextLine();

				System.out.println("Plesase enter the kg: ");
				Float kg = input.nextFloat();
				Vegetables vegetable = new Vegetables(priceVeg, true, name, kg);
				products[i] = vegetable;
				i++;

			case 3:
				System.out.println("Plesase enter price: ");
				int priceDrinks = input.nextInt();

				System.out.println("Plesase enter the calories ");
				String nameDr = input.nextLine();

				System.out.println("Plesase enter if it is chocolate: ");
				boolean sparkling = input.nextBoolean();
				Drinks drink = new Drinks(priceDrinks, true, nameDr, sparkling);
				products[i] = drink;
				i++;

			}
		}
		input.close();

	}
}
