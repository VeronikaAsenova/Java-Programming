
public class Automobile extends Car {

	private int FuelConsumption;

	public Automobile(int i) {
		super();
		this.FuelConsumption = 0;
	}

	public Automobile(float price, int FuelConsumption) {
		super(price);
		this.FuelConsumption = FuelConsumption;
	}

	public int getFuelConsumption() {
		return FuelConsumption;
	}

	public void setFuelConsumption(int FuelConsumption) {
		this.FuelConsumption = FuelConsumption;
	}

	public void sayFuel() {
		System.out.printf(". Fuel consumption: %d/100. \n", FuelConsumption);
	}


		
	}

