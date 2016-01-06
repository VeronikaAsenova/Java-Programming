
public class Drinks extends Stock {
	
	private String name;
	private boolean sparkling;
	int count;
	
	public Drinks(float price, boolean isOrNotAvaiable, String name, boolean sparkling) {
		super(price, isOrNotAvaiable);
		this.name = name;
		this.sparkling = sparkling;
		count++;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSparkling() {
		return sparkling;
	}

	public void setSparkling(boolean sparkling) {
		this.sparkling = sparkling;
	}
	
	void Avaiable(){
		System.out.println(count);
	}
	

}
