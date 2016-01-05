
public class SUV extends Car {

	private boolean offroad;

	public SUV(float price, boolean offroad) {
		super(price);
		this.offroad = offroad;
	}

	public void setoffroad(boolean offroad) {
		this.offroad = offroad;
	}

	public boolean isOffroad() {
		return offroad;
	}

	public void saySUV() {
		if (this.offroad == true) {
			System.out.println("The automobile is off-road!");
		} else {
			System.out.println("The automobile is not off-road!");
		}

	}

}
