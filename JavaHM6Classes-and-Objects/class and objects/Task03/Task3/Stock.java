import javax.swing.plaf.synth.SynthScrollBarUI;

public class Stock {



	private float price;
	private boolean isOrNotAvaiable;



	public Stock(float price, boolean isOrNotAvaiable) {
		super();
		this.price = price;
		this.isOrNotAvaiable = isOrNotAvaiable;
	}

	public Stock() {
		setPrice(0.0);
		setStock(false);
	}

	public Stock(double price, boolean availability) {
		setPrice(price);
		setStock(availability);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = (float) price;
	}

	public boolean isStock() {
		return isOrNotAvaiable;
	}

	public void setStock(boolean availability) {
		this.isOrNotAvaiable = availability;
	}

}
