
public class Test {

	public static void main(String[] args) {

		Employee Vladi = new Employee (160, 1800);
		Doctor Veri = new Doctor (180,3500,14,40);
		Policeman Riko= new Policeman("Sheriff", 200, 1200);
		
		Vladi.sayHours();
		Vladi.saySalary();
	System.out.println();
	
	Veri.sayHours();
	Veri.saySalary();
	Veri.sayDays();
	Veri.sayNights();
	System.out.println();
	
	Riko.sayRang();
	Riko.sayHours();
	Riko.saySalary();
	
	
	}

}