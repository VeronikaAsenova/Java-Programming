
public class Laptop extends Device {
	
	private String OperatingSystem;

	public Laptop() {
		super();
	}

	public Laptop(String brand, String model,String OpratingSystem) {
		super(brand, model);
		this.OperatingSystem=OpratingSystem;
	}

	public String getOperatingSystem() {
		return OperatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}
	 
	public void saySystem(){
		System.out.println("The operating system is: " +getOperatingSystem());
	}
	
	
	

}
