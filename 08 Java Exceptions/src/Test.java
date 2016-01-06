
public class Test {

	public static void main(String[] args) {

		PersonalAccount person = new PersonalAccount("Veronika" , 9506051714L, 6547);
		CoorporativeAccount coo= new CoorporativeAccount("Axivas", 947215437, 100000 );
		
		try {
			person.setMoney(-260);
			System.out.println("The amount of your money is: " + person.getMoney());
		} catch (NegativeMoneyException Exception ) {
			System.out.println ("Invalid opperation"  + Exception.getMessage());
		}
		
		try {
			coo.setMoney(-25);
			System.out.println("The amouns of money is:"  + person.getMoney());
		} catch (NegativeMoneyException Exception ) {
			System.out.println("Invalid opperation" + Exception.getMessage());
			
		}
		try {
			person.Inherit(person);
		} catch (InvalidAccountException e) {
			System.out.println(e.getMessage());
		}
		try {
			coo.inherit(coo);
		} catch (InvalidAccountException Exception ) {
			System.out.println(Exception.getMessage());
		}
	}   
	

}
