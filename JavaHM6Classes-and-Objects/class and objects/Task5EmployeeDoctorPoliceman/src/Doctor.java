
public class Doctor extends Employee {

	private int nightsPerMonth;
	private int wholeDaysPerMonth;
	
	public Doctor (){
		setSalary(0.0);
		setHoursPerMonth(0);
		setNightsPerMonth(0);
		setWholeDaysPerMonth(0);
	}
	
	
	public Doctor(int Salary, int Hours, int nightsPerMonth, int wholeDaysPerMonth) {
		super();
		this.nightsPerMonth = nightsPerMonth;
		this.wholeDaysPerMonth = wholeDaysPerMonth;
	}


	public int getNightsPerMonth() {
		return nightsPerMonth;
	}


	public void setNightsPerMonth(int nightsPerMonth) {
		this.nightsPerMonth = nightsPerMonth;
	}


	public int getWholeDaysPerMonth() {
		return wholeDaysPerMonth;
	}


	public void setWholeDaysPerMonth(int wholeDaysPerMonth) {
		this.wholeDaysPerMonth = wholeDaysPerMonth;
	}
	
	public void sayNights(){
		System.out.println("My night shitfs per month are: " + this.nightsPerMonth);
	}
	public void sayDays(){
		System.out.println("My day shifts per month are: " + this.wholeDaysPerMonth);
	}
	
	
}
