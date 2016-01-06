
public class Meat extends Stock {

	protected String type;
	protected int weight;
	int count = 0;

	
	
		public Meat() {
			setPrice(0.0);
			setStock(false);
			setType("");
			setKg(0.0);

	}
	

		public Meat(double price, boolean availability, String type, double weight) {
			setPrice(price);
			setStock(availability);
			setType(type);
			setKg(weight);
			count++;
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getKg() {
		return weight;
	}

	public void setKg(double d) {
		this.weight = (int) d;
	}
	
	public void Avaiable(){
		System.out.println(count);
	}
	

}
