
public class Policeman extends Employee {

	private String rang;

	public Policeman (){
		super();
		this.rang="";
	}
	
	public Policeman(String rang, int hoursPerMonth, int Salary) {
		super();
		this.rang = rang;
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}
	
	public void sayRang(){
		System.out.println("My rang is : " + this.rang);
	}
	
	
	
}