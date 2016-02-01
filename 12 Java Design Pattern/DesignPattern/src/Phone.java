
public class Phone extends Device{
	
	private String color;

	public Phone() {
		super();
	}

	public Phone(String brand, String model,String color) {
		super(brand, model);
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void sayColor(){
		System.out.println("The color is: " + getColor());
	}

	
		
	
	
	
	
	

}
