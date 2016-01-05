
public class Vegetables  extends Stock{

	private String name;
	private float kg;
	int count;
	
	public Vegetables() {
		setPrice(0.0);
		setStock(false);
		setName("");
		setKg(0);
		}
	
	
		
	

	public Vegetables(float price, boolean isOrNotAvaiable, String name, float kg) {
		super(price, isOrNotAvaiable);
		this.name = name;
		this.kg = kg;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getKg() {
		return kg;
	}

	public void setKg(float kg) {
		this.kg = kg;
	}
	void Avaiable (){
		System.out.println(count);
	}
	
	
	
}
