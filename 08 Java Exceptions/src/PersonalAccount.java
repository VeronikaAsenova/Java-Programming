
public class PersonalAccount extends Account {

	private String Name;
	private long EGN;

	public PersonalAccount() {
		super();
		Name = "";
		EGN = 0;
	}

	public PersonalAccount(String name, long EGN,double money) {
		super(money);
		Name = name;
		EGN = EGN;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getEGN() {
		return EGN;
	}

	public void setEGN(long eGN) {
		EGN = eGN;
	}

	public void Inherit(PersonalAccount object) throws InvalidAccountException {
		if (object instanceof Account) {
			System.out.println("Your EGN IS : " + getEGN());
		} else {
			throw new InvalidAccountException("Invalid account!");
		}
	}
}
