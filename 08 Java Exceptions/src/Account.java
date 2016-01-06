
public class Account {

	private double money;

	public Account() {
		super();
		this.money = 0;
	}

	public Account(double money) {
		super();
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) throws NegativeMoneyException {

		if (money < 0) {
			throw new NegativeMoneyException(" You cannot enter negative amount of money!");
		} else {
			return;
		}

	}

}
