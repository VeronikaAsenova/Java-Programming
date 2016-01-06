
abstract class Person {

	String Firstname;
	String Lastname;
	protected int age;
	protected int workExperience;
	static int counter;

	public Person() {
		this.age = 0;
		this.Firstname = "";
this.Lastname="";
		this.workExperience = 0;
		counter++;

	}

	public Person(int age, String name, int workExperience) {
		this.age = age;
		this.Firstname = Firstname;
		this.Lastname=Lastname;
		this.workExperience = workExperience;

	}

	protected int getage() {
		return age;
	}

	protected void setage(int age) {
		this.age = age;
	}

	protected String getFirstname() {
		return Firstname;
	}

	protected void setFirstname(String Firstname) {
		this.Firstname = Firstname;
	}
	
	protected String getLastname() {
		return Lastname;
	}

	protected void setLastname(String Lastname) {
		this.Lastname = Lastname;
	}
	
	

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Person.counter = counter;
	}

	protected int getWorkExperience() {
		return workExperience;
	}

	protected void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}

	public void greet(int name, int age, int workExperience) {
		if (workExperience > 0) {

			this.workExperience = workExperience;
			System.out.println("My work time is" + this.workExperience + "!");
			System.out.println("Hello! I am " + this.Firstname + this.Lastname +  "!");
			System.out.println("I am " + this.age + "years old! ");
		}
	}
}
