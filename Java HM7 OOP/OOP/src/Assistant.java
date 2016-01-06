
public class Assistant extends Lecturer implements CheckHomeworks {

	private boolean ChiefAssistant;

	public Assistant() {
		super();
		ChiefAssistant = (false);

	}

	public Assistant(String Firstname, String Lastnamename, int age, int workexperience, String university,	boolean ChiefAssistant) {
		super(Firstname, Lastnamename, age, workexperience, university);
		this.ChiefAssistant = ChiefAssistant;
	}

	public boolean ChiefAssistant() {
		return ChiefAssistant;
	}

	public void setChiefAssistant(boolean chiefAssistant) {
		ChiefAssistant = chiefAssistant;
	}

	public void CheckHomeworks() {
		System.out.println("I also check homeworks to help the Professor!");
	}

	public void chekExams() {
		System.out.println("I can chechk exams!");
	}

	public void sayMyName() {
		System.out.printf("Hello! My name is " + getFirstname() + getLastname() + "" );
		if (ChiefAssistant() == true) {
			System.out.println(" and I am chief assistant");
		} else {
			System.out.println(" and I am not chief assistant");
		}

	}

}
