
public class CoorporativeAccount extends Account {

	private String NameCompmany;
	private long BULSTAT;

	public CoorporativeAccount() {
		super();
		NameCompmany = "";
		BULSTAT = 0;
	}

	public CoorporativeAccount(String nameCompmany, long bULSTAT,double money) {
		super(money);
		NameCompmany = nameCompmany;
		BULSTAT = bULSTAT;
	}

	public String getNameCompmany() {
		return NameCompmany;
	}

	public void setNameCompmany(String nameCompmany) {
		NameCompmany = nameCompmany;
	}

	public long getBULSTAT() {
		return BULSTAT;
	}
	public void setBULSTAT(long bULSTAT) {
		BULSTAT = bULSTAT;
	}

	public void inherit(CoorporativeAccount object) throws InvalidAccountException {
		if (object instanceof Account) {
			System.out.println("Your BULSTAT is: " + getBULSTAT());

		} else {
			throw new InvalidAccountException("Invalid Coorporative Account");
		}
	}

}
