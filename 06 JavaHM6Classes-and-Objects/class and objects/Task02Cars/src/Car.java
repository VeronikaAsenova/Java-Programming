import java.util.Scanner;

class Car {
	
	String Car;

	private float price;

	public Car() {
		this.price = 0;

	}

	public Car(float price) {
		
		this.price = price;
		
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void sayPrice(){
		System.out.println("The price is "+ this.price);
	}

	public void sayFuel() {
		// TODO Auto-generated method stub
		
	}

	public void saySUV() {
		// TODO Auto-generated method stub
		
	}
}
