
public class Device {
	
	private String brand;
	private String model;
	
	
	public Device() {
		super();
	}


	public Device(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	public void sayInfo(){
		System.out.println(" The brand is: " + getBrand() + "The model is:" + getModel());
	}
	
	

}
