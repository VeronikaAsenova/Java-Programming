
public class Tablet extends Device {
	
	private String country;

	public Tablet() {
		super();
	}

	public Tablet(String brand, String model, String country) {
		super(brand, model);
		this.country=country;
		
	}

	
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void sayCountry(){
		System.out.println("Tablet is from " + getCountry());
	}
	

}
