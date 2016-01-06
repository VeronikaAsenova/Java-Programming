
public class Teacher extends Person implements CheckHomeworks {

	String subject;

	protected Teacher() {
		setage(0);
		setFirstname("");
		setLastname("");
		setWorkExperience(0);
		setSubject("");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	protected Teacher(String name, int age, int workExperience, String subject) {
		this.Firstname = Firstname;
		this.Lastname=Lastname;
		this.subject = subject;
		this.age = age;
		this.workExperience = workExperience;
	}

	public static void sayHello() {
		System.out.println("Good afternoon!");
	}

	public static void sayBye() {
		System.out.println("Good bye!");
	}

	@Override
	public void CheckHomework() {
System.out.println("I can check homeworks! ");		
	}

}
