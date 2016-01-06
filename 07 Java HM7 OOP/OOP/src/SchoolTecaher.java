
public class SchoolTecaher extends Teacher implements CheckHomeworks {

	private String[] array = new String[5];

	public SchoolTecaher() {
		super();
		this.array = (null);
	}

	public SchoolTecaher(String name, int age, int workExperience, String subject, String[] array) {
		super(name, age, workExperience, subject);
		this.array = array;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;

	}
	public void entertain() {
		System.out.println("I can entertain children.");
	}


	public void CheckHomewroks() {
		System.out.println("I can check homeworks! ");
	}

	public void sayClasses() {
		System.out.println("I teach these classes:" + getArray());
		
	}

}
